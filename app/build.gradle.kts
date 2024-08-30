plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.denise.castro.codelabs"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.denise.castro.codelabs"
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
    //+--------------------------------------------------------------------------------------------+
    //| LIBS                                                                                       |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.legacy.support.v4)

    //+--------------------------------------------------------------------------------------------+
    //| MATERIAL COMPONENTS                                                                        |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.volley)
    implementation(libs.gson)

    //+--------------------------------------------------------------------------------------------+
    //| CODELAB APP SETTINGS                                                                       |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.preference.ktx)

    //+--------------------------------------------------------------------------------------------+
    //| WORKMANAGER                                                                                 |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.work.runtime.ktx)
    implementation(libs.glide)
    implementation(libs.androidx.lifecycle.extensions)

    //+--------------------------------------------------------------------------------------------+
    //| VIEWPAGER                                                                                  |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.viewpager2)

    //+--------------------------------------------------------------------------------------------+
    //| NAVIGATION                                                                                 |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.navigation.dynamic.features.fragment)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.work.runtime.ktx)

    //+--------------------------------------------------------------------------------------------+
    //| LIFECYCLE                                                                                  |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.common.java8)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    //+--------------------------------------------------------------------------------------------+
    //| COROUTINES                                                                                 |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

    //+--------------------------------------------------------------------------------------------+
    //| ROOM                                                                                       |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.sqlite.jdbc)
    ksp(libs.androidx.room.compiler)

    //+--------------------------------------------------------------------------------------------+
    //| DEPURAÇÃO                                                                                  |
    //+--------------------------------------------------------------------------------------------+

    implementation(libs.timber)

    //+--------------------------------------------------------------------------------------------+
    //| TESTS                                                                                      |
    //+--------------------------------------------------------------------------------------------+
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}