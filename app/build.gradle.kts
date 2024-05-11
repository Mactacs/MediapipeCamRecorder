plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.mactacs.mediapipecamrecorder"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mactacs.mediapipecamrecorder"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }


    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.fragment:fragment-ktx:1.5.4")

    // Navigation library
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    // Media pipe
    implementation("com.google.mediapipe:tasks-vision:0.20230731")

    // CameraX core library
    implementation("androidx.camera:camera-core:1.4.0-alpha05")

    // CameraX Camera2 extensions
    implementation("androidx.camera:camera-camera2:1.4.0-alpha05")

    // CameraX Lifecycle library
    implementation("androidx.camera:camera-lifecycle:1.4.0-alpha05")

    // CameraX View class
    implementation("androidx.camera:camera-view:1.4.0-alpha05")

    //WindowManager
    implementation("androidx.window:window:1.3.0-beta02")

}