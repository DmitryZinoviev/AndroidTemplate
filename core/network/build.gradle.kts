plugins {
    id("androidtemplate.android.library")
    id("androidtemplate.kotlin.test")
    id("network.convention")
    id("koin.convention")
}

dependencies {
    implementation(libs.androidx.core.ktx)
}