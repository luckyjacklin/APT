package me.jack.apt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.jack.annotation.Function

/**
 * Created by Jack on 2019-10-05.
 */
@Function(name = "Main")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
