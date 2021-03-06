package com.tomiwo.quickqrscanner

import android.content.Context
import android.preference.PreferenceManager

class UserPreference (context: Context) {

    companion object {
        private const val DARK_STATUS = "io.github.manuelernesto.DARK_STATUS"
    }

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    var darkMode = preferences.getInt(DARK_STATUS, 0)
        set(value) = preferences.edit().putInt(DARK_STATUS, value).apply()


}