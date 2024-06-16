package com.example.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)



        val themeSwitch = findViewById<Switch>(R.id.theme_switch)
        themeSwitch.isChecked = ThemeUtils.isDarkMode(this)

        themeSwitch.setOnCheckedChangeListener { _, isChecked ->
            ThemeUtils.setDarkMode(this, isChecked)
            recreate() // Перезапустить активность для применения темы
        }
            // Обработчик нажатия на кнопку "Назад"
            findViewById<View>(R.id.btn_back).setOnClickListener {
                finish()  // Закрыть текущую активность и вернуться на предыдущий экран
            }
        }
    }

