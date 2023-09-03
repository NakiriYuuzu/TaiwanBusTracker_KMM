object Deps {
    // remember same as gradle.properties
    object Version {
        const val kotlin = "1.9.0"
        const val gradle = "8.1.1"
        const val compose = "1.5.0"
    }

    object Moko {
        object Flow { //沒在用
            private const val version = "0.16.1"

            const val mokoCore = "dev.icerock.moko:mvvm-core:$version"
            const val mokoCompose = "dev.icerock.moko:mvvm-compose:$version"
            const val mokoFlow = "dev.icerock.moko:mvvm-flow:$version"
            const val mokoFlowCompose = "dev.icerock.moko:mvvm-flow-compose:$version"
        }

        object Resources {
            private const val version = "0.23.0"

            const val classPath_Resources = "dev.icerock.moko:resources-generator:$version"
            const val commonMain_Resources = "dev.icerock.moko:resources:$version"
            const val commonMain_ResourcesCompose = "dev.icerock.moko:resources-compose:$version"

            private const val graphicsVersion = "0.9.0"
            const val export_graphics = "dev.icerock.moko:graphics:$graphicsVersion"
        }

        object Biometry {
            private const val version = "0.4.0"

            const val biometry = "dev.icerock.moko:biometry:$version"
            const val biometryCompose = "dev.icerock.moko:biometry-compose:$version"
        }

        object Media {
            private const val version = "0.11.0"

            const val media = "dev.icerock.moko:media-compose:$version"
            const val mediaTest = "dev.icerock.moko:media-test:$version"
        }

        object Permission {
            private const val version = "0.16.0"

            const val premission = "dev.icerock.moko:permissions:$version"
            const val permissionTest = "dev.icerock.moko:permissions-test:$version"
            const val premissionCompose = "dev.icerock.moko:permissions-compose:$version"
        }
    }

    object Sqldelight {
        private const val version = "1.5.5"

        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:$version"
        const val runtime = "com.squareup.sqldelight:runtime:$version"
        const val coroutinesExtensions = "com.squareup.sqldelight:coroutines-extensions:$version"

        // engines
        const val androidDriver = "com.squareup.sqldelight:android-driver:$version"
        const val iosDriver = "com.squareup.sqldelight:native-driver:$version"
    }

    object Precompose {
        private const val version = "1.5.0"

        const val precompose = "moe.tlaster:precompose:$version"
        const val precomposeMolecule = "moe.tlaster:precompose-molecule:$version"
        const val precomposeViewModel = "moe.tlaster:precompose-viewmodel:$version"
        const val precomposeKoin = "moe.tlaster:precompose-koin:$version"
    }

    object SharedPreferences {
        private const val version = "1.0.0"

        const val multiplatform = "com.russhwolf:multiplatform-settings:$version"
        const val multiplatform_coroutine = "com.russhwolf:multiplatform-settings-coroutines:$version"
    }

    object Kotlinx {
        object Coroutines {
            private const val version = "1.7.3"

            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }

        object DateTime {
            private const val version = "0.4.0"

            const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:$version"
        }
    }

    object Ktor {
        private const val version = "2.3.2"

        const val core = "io.ktor:ktor-client-core:$version"
        const val logging = "io.ktor:ktor-client-logging:$version"
        const val negotiation = "io.ktor:ktor-client-content-negotiation:$version"
        const val serialization= "io.ktor:ktor-serialization-kotlinx-json:$version"

        // engines
        const val ktorAndroid = "io.ktor:ktor-client-android:$version"
        const val ktorIOS = "io.ktor:ktor-client-darwin:$version"
    }

    object Koin {
        private const val version = "3.4.3"

        const val core = "io.insert-koin:koin-core:$version"
        const val test = "io.insert-koin:koin-test:$version"
        const val android = "io.insert-koin:koin-android:$version"
    }

    object Logging {
        private const val version = "2.6.1"

        const val napier = "io.github.aakira:napier:$version"
    }

    object Insets {
        private const val version = "0.1.0-alpha10"

        const val insetx = "com.moriatsushi.insetsx:insetsx:$version"
    }

    object ImageLoader {
        private const val version = "1.6.4"

        const val imageLoader = "io.github.qdsfdhvh:image-loader:$version"
        const val imageLoaderMoko = "io.github.qdsfdhvh:image-loader-extension-moko-resources:$version"
        const val imageLoaderBlur = "io.github.qdsfdhvh:image-loader-extension-blur:$version"
    }

    object Android {
        private const val androidCoreVersion = "1.10.1"
        const val androidCore = "androidx.core:core:$androidCoreVersion"

        private const val activityComposeVersion = "1.7.2"
        const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

        private const val appcompatVersion = "1.6.1"
        const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
    }

    object Ios {

    }

    object Test {

    }
}