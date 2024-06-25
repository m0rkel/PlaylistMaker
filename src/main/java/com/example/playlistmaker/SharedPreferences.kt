package com.example.playlistmaker

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate

object ThemeUtils {
    private const val PREFERENCES_NAME = "theme_prefs"
    private const val KEY_IS_DARK_MODE = "is_dark_mode"

    private fun getPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
    }

    fun isDarkMode(context: Context): Boolean {
        return getPreferences(context).getBoolean(KEY_IS_DARK_MODE, false)
    }

    fun setDarkMode(context: Context, isDarkMode: Boolean) {
        getPreferences(context).edit().putBoolean(KEY_IS_DARK_MODE, isDarkMode).apply()
        AppCompatDelegate.setDefaultNightMode(
            if (isDarkMode) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        )
    }

    fun applyTheme(context: Context) {
        AppCompatDelegate.setDefaultNightMode(
            if (isDarkMode(context)) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        )
    }
}
