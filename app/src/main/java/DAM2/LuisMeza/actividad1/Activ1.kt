package DAM2.LuisMeza.actividad1

import DAM2.LuisMeza.actividad1.databinding.ActivityActiv1Binding
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activ1 : AppCompatActivity() {

    private lateinit var binding: ActivityActiv1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActiv1Binding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.botonMenu.setOnClickListener {
                finish()
            }

    }
}