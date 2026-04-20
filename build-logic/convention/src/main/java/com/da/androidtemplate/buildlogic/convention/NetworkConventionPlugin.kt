package com.da.androidtemplate.buildlogic.convention

import com.da.androidtemplate.buildlogic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class NetworkConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {

        pluginManager.apply("com.android.library")



        extensions.configure<com.android.build.api.dsl.LibraryExtension> {
            defaultConfig {
                consumerProguardFiles("consumer-rules.pro")
            }
        }

        dependencies {
            // Coroutines
            add("implementation", libs.findLibrary("kotlinx.coroutines").get())

            // Retrofit
            add("implementation", libs.findLibrary("retrofit").get())
            add("implementation", libs.findLibrary("moshi.kotlin").get())
            add("implementation", libs.findLibrary("moshi.kotlin.codegen").get())
            add("implementation", libs.findLibrary("converter.moshi").get())

            // OkHttp
            add("implementation", libs.findLibrary("okhttp").get())
            add("implementation", libs.findLibrary("okhttp.logging").get())

        }
    }
}