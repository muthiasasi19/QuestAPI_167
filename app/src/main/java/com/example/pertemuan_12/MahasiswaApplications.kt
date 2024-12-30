package com.example.pertemuan_12

import android.app.Application
import com.example.pertemuan_12.dependenciesinjection.AppContainer
import com.example.pertemuan_12.dependenciesinjection.MahasiswaContainer

class MahasiswaApplications : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}