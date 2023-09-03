plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization") version Deps.Version.kotlin
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "network"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                // KTOR
                with(Deps.Ktor) {
                    api(core)
                    api(logging)
                    api(negotiation)
                    api(serialization)
                }

                // Logging
                implementation(Deps.Logging.napier)
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
                implementation(Deps.Ktor.ktorAndroid)
            }
        }
        val iosMain by getting {
            dependencies {
                //put your ios dependencies here
                implementation(Deps.Ktor.ktorIOS)
            }
        }
    }
}

android {
    namespace = "net.yuuzu.network"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}