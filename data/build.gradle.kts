plugins {
    id("androidtemplate.android.library")
    id("androidtemplate.kotlin.test")
    id("koin.convention")

}

dependencies {
    implementation(libs.androidx.core.ktx)

    implementation(libs.retrofit)
    implementation(project(":domain"))
    implementation(project(":core:network"))
}