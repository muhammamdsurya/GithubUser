package com.dicoding.githubuser.data.local

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.prefDataStore by preferencesDataStore("settings")

class SettingPreferences constructor(context: Context) {

    private val settingDataStore = context.prefDataStore
    private val themeKEY = booleanPreferencesKey("theme_setting")

    fun getThemeSetting(): Flow<Boolean> =
        settingDataStore.data.map { preferences ->
            preferences[themeKEY] ?: false
        }

    suspend fun saveThemeSetting(isDarkModeActive: Boolean) {
        settingDataStore.edit { preferences ->
            preferences[themeKEY] = isDarkModeActive
        }
    }
}