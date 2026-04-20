package com.da.androidtemplate.buildlogic.convention

import com.da.androidtemplate.buildlogic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies


class KoinConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {


        dependencies {
            add("implementation", libs.findLibrary("koin.core").get())
            add("implementation", libs.findLibrary("koin.android").get())
        }
    }
}