package com.da.androidtemplate.buildlogic.convention

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.apply("com.android.application")

        target.extensions.configure<com.android.build.api.dsl.ApplicationExtension> {

            namespace = "com.da.androidtemplate"
            compileSdk = 36

            defaultConfig {
                applicationId = "com.da.androidtemplate"
                minSdk = 29
                targetSdk = 36
                versionCode = 1
                versionName = "1.0"
            }

            buildFeatures {
                compose = true
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }
    }
}