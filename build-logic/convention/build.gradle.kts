plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
}
gradlePlugin {
    plugins {

        register("androidApplication") {
            id = "androidtemplate.android.application"
            implementationClass =
                "com.da.androidtemplate.buildlogic.convention.AndroidApplicationConventionPlugin"
        }

        register("androidLibrary") {
            id = "androidtemplate.android.library"
            implementationClass =
                "com.da.androidtemplate.buildlogic.convention.AndroidLibraryConventionPlugin"
        }

        register("androidCompose") {
            id = "androidtemplate.android.compose"
            implementationClass =
                "com.da.androidtemplate.buildlogic.convention.AndroidComposeConventionPlugin"
        }

        register("kotlinLibrary") {
            id = "androidtemplate.kotlin.library"
            implementationClass =
                "com.da.androidtemplate.buildlogic.convention.KotlinLibraryConventionPlugin"
        }

        register("kotlinTest") {
            id = "androidtemplate.kotlin.test"
            implementationClass =
                "com.da.androidtemplate.buildlogic.convention.KotlinTestConventionPlugin"
        }

        plugins {
            register("networkConvention") {
                id = "network.convention"
                implementationClass =
                    "com.da.androidtemplate.buildlogic.convention.NetworkConventionPlugin"
            }
        }
    }

}