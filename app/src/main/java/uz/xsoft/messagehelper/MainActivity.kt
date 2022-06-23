package uz.xsoft.messagehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * https://www.youtube.com/watch?v=dah4ZP3eOVk
         */

        MessageHelper.showMessage(this, "Show test message")
    }
}
