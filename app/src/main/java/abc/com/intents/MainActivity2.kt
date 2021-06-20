package abc.com.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.jar.Attributes

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name =intent.getStringExtra(KEY_1)
        val age =intent.getIntExtra(KEY_2, 5)
        val isStudent=intent.getBooleanExtra(KEY_3, false)
        textView.text= "$name $age $isStudent"


    }
}