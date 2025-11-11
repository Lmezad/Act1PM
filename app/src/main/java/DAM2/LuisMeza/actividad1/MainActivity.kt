package DAM2.LuisMeza.actividad1

import DAM2.LuisMeza.actividad1.databinding.ActivityMainBinding
import android.R.id.button1
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAbout.setOnClickListener {
            val intento1= Intent(this, About::class.java)
            startActivity(intento1)
        }

        binding.button1.setOnClickListener {
            val intento2 = Intent(this, Activ1::class.java)
            startActivity(intento2)
        }


        binding.button2.setOnClickListener {
            val intento3 = Intent(this, Activ2::class.java)
            startActivity(intento3)
        }

        binding.button3.setOnClickListener {
            val intento4 = Intent(this, Activ3::class.java)
            startActivity(intento4)
        }

            }

        }

        // codigo para boton que cierra el app---> val buttonacerca1 = findViewById<Button>(R.id.buttonacerca1)
//            buttonacerca1.setOnClickListener {
//                Toast.makeText(this, "Cerrando", Toast.LENGTH_SHORT).show()
//                finish()
