package com.finc.sandbox

object Libs {

    object Kotlin {
        private const val version = "1.3.61"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${version}"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val coreKtx= "androidx.core:core-ktx:1.1.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"

        object Test {
            const val junit = "androidx.test.ext:junit:1.1.1"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }

    object JUnit {
        const val junit = "junit:junit:4.12"
    }
}