package com.example.playlistmaker

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // Обработчик нажатия на кнопку "Назад"
        findViewById<View>(R.id.btn_back).setOnClickListener {
            finish()  // Закрыть текущую активность и вернуться на предыдущий экран
        }
    }
}