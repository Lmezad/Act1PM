package DAM2.LuisMeza.actividad1

import DAM2.LuisMeza.actividad1.databinding.ActivityActiv2Binding
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activ2 : AppCompatActivity() {

    private lateinit var binding: ActivityActiv2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityActiv2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        // boton back
        binding.botonMenu2.setOnClickListener{
            finish()
        }
    }
}