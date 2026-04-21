plugins {
    id("androidtemplate.android.library")
    id("androidtemplate.kotlin.test")
    id("network.convention")
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.koin.core)
}