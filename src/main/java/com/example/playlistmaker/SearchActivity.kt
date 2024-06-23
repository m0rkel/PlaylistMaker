package com.example.playlistmaker

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        // Обработчик нажатия на кнопку "Назад"
        findViewById<View>(R.id.btn_back).setOnClickListener {
            finish()  // Закрыть текущую активность и вернуться на предыдущий экран
        }

    }
}
