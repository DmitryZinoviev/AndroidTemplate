package com.da.androidtemplate.buildlogic.convention

import com.da.androidtemplate.buildlogic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

class KotlinTestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {

        dependencies {
            add("testImplementation", libs.findLibrary("junit").get())

            add("androidTestImplementation", libs.findLibrary("androidx.junit").get())
            add("androidTestImplementation", libs.findLibrary("androidx.espresso.core").get())
        }
    }
}