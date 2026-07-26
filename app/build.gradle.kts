plugins {
    id("com.android.application")
}

android {
    namespace = "com.securepay.dashboard"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        versionCode = 1
    }

    flavorDimensions("app")
    productFlavors {
        create("touchbase") {
            dimension = "app"
            applicationId = "com.securepay.dashboard"
            versionName = "1.0.0"
        }
        create("tbdata") {
            dimension = "app"
            applicationId = "com.tbdata.app"
            versionName = "1.0.0"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
}
