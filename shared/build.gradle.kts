plugins {
    kotlin("multiplatform")
    id("com.android.library")

    id("org.jetbrains.compose")
    id("dev.icerock.mobile.multiplatform-resources")
    kotlin("plugin.serialization") version Deps.Version.kotlin
}

kotlin {
    androidTarget()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
            export(Deps.Moko.Resources.commonMain_Resources)
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                implementation(compose.ui)
                implementation(compose.runtime)
                implementation(compose.animation)
                implementation(compose.animationGraphics)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)

                api(project(":shared:network"))

                api(Deps.Moko.Resources.commonMain_Resources)
                api(Deps.Moko.Resources.commonMain_ResourcesCompose)

                implementation(Deps.Kotlinx.DateTime.dateTime)
                implementation(Deps.Insets.insetx)

                implementation(Deps.Koin.core)
                implementation(Deps.Logging.napier)
                with(Deps.Precompose) {
                    api(precompose)
//                    api(precomposeKoin)
                    api(precomposeViewModel)
                }
                with(Deps.SharedPreferences) {
                    api(multiplatform)
                    api(multiplatform_coroutine)
                }
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                //put your android dependencies here
                dependsOn(commonMain)

                implementation(Deps.Android.appcompat)
                implementation(Deps.Android.activityCompose)
                implementation(Deps.Koin.android)
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)

            dependencies {
                // put your ios dependencies here
            }
        }
    }
}

android {
    namespace = Configurations.applicationId
    compileSdk = Configurations.compileSdk
    defaultConfig {
        minSdk = Configurations.minSdk
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}

multiplatformResources {
    multiplatformResourcesPackage = Configurations.applicationId
    multiplatformResourcesClassName = "SharedRes"
}