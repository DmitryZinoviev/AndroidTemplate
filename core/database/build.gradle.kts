plugins {
    id("androidtemplate.android.library")
    id("androidtemplate.kotlin.test")
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}