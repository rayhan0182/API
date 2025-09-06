plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    id("dagger.hilt.android.plugin")

    kotlin("kapt")


}

android {
    namespace = "com.example.apiservice"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.apiservice"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    viewBinding {

        enable = true

    }


}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("com.google.dagger:hilt-android:2.57.1")

    kapt("com.google.dagger:hilt-compiler:2.57.1")

    // retrofit
    implementation("com.squareup.retrofit2:retrofit:3.0.0")
// gson converter
    implementation("com.squareup.retrofit2:converter-gson:3.0.0")

    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.3")



}