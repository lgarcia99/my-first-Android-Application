package garcia.luis.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var counter:Int = 0
    var num:Int = 0
    var upCounter:Int = 0
    var downCounter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label:TextView = findViewById(R.id.etiqueta)// as TextView
        val down:Button = findViewById(R.id.down)// as Button
        val up:Button = findViewById(R.id.up)
        val generate:Button = findViewById(R.id.generate)

        generate.setOnClickListener {
            num = Random.nextInt(0,100)

            label.setText(""+num+"")
        }

        up.setOnClickListener {
            up.setText("UP ("+(upCounter++)+")")
        }

        down.setOnClickListener {
            down.setText("DOWN ("+(downCounter++)+")")
        }
    }
}
