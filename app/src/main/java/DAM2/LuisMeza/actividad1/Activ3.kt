package DAM2.LuisMeza.actividad1

import DAM2.LuisMeza.actividad1.databinding.ActivityActiv2Binding
import DAM2.LuisMeza.actividad1.databinding.ActivityActiv3Binding
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activ3 : AppCompatActivity() {

    private lateinit var binding: ActivityActiv3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActiv3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        // boton back
        binding.botonMenu3.setOnClickListener{
            finish()
        }
    }
}