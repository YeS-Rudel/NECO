package com.example.daggerhiltlesson

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton


class WiFiManager (private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()
    }
}

class WiFiSettings constructor() {
    fun openConnection() {
        Log.d("MyLog", "openConnection")
    }

    fun writeBytes() {
        Log.d("MyLog", "writeBytes")
    }
}