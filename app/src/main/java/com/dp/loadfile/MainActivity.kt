package com.dp.loadfile

import android.graphics.Color
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var url = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                keyCode == KeyEvent.KEYCODE_ENTER
            ) {
                if (editText.text.isNotEmpty()) {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    StringTextView.text = editText?.text.toString()
                    if (editText?.text.toString().toInt() == 5) {
                        iView.setBackgroundColor(Color.GREEN)
                    }
                }
                return@OnKeyListener true
            }
            false
        }
        )

        button.setOnClickListener(){
            println(editText.text.toString())
            StringTextView.text = editText.text.toString()
        }

//        val model = MyClass()
//        model.run(StringTextView, url)
    }
}