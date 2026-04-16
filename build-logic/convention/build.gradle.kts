plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(libs.android.gradle.plugin)
}
gradlePlugin {
    plugins {
        register("kotlinLibrary") {
            id = "androidtemplate.kotlin.library"
            implementationClass = "KotlinLibraryConventionPlugin"
        }
        register("androidApplication") {
            id = "androidtemplate.android.application"
            implementationClass =
                "com.da.androidtemplate.buildlogic.convention.AndroidApplicationConventionPlugin"
        }
    }
}