package DAM2.LuisMeza.actividad1

import android.R.id.button1
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonabout=findViewById<Button>(R.id.buttonAbout)
        botonabout.setOnClickListener {
            val intento1= Intent(this, About::class.java)
            startActivity(intento1)
        }

        val botonActiv1=findViewById<Button>(R.id.button1)
        botonActiv1.setOnClickListener {
            val intento2 = Intent(this, Activ1::class.java)
            startActivity(intento2)
        }

        val botonActiv2=findViewById<Button>(R.id.button2)
        botonActiv2.setOnClickListener {
            val intento3 = Intent(this, Activ2::class.java)
            startActivity(intento3)
        }

        val botonActiv3=findViewById<Button>(R.id.button3)
        botonActiv3.setOnClickListener {
            val intento4 = Intent(this, Activ3::class.java)
            startActivity(intento4)
        }

            }

        }



