plugins {
    alias(libs.plugins.android.application) // Applies Android application plugin
    alias(libs.plugins.kotlin.android) // Applies Kotlin plugin
    alias(libs.plugins.google.gms.google.services) // Applies Google services plugin
}

android {
    namespace = "com.example.ritveemilkandmilkwonders" // Package namespace
    compileSdk = 35 // Matches dependency requirements

    defaultConfig {
        applicationId = "com.example.ritveemilkandmilkwonders" // App ID
        minSdk = 24 // Minimum SDK for app compatibility
        targetSdk = 33 // Target SDK for runtime compatibility
        versionCode = 1 // App version code
        versionName = "1.0" // App version name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" // Test runner
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Disables code shrinking in release builds
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), // Default ProGuard rules
                "proguard-rules.pro" // Custom ProGuard rules file
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11 // Java compatibility
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11" // Kotlin JVM target
    }
}


dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.firebase.database.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

