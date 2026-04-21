plugins {
    id("androidtemplate.android.library")
    id("androidtemplate.kotlin.test")

}

dependencies {
    implementation(libs.androidx.core.ktx)

    implementation(libs.retrofit)
    implementation(project(":domain"))
    implementation(project(":core:network"))

    implementation(libs.koin.core)
}