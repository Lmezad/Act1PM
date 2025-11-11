package DAM2.LuisMeza.actividad1

import DAM2.LuisMeza.actividad1.databinding.ActivityAboutBinding
import DAM2.LuisMeza.actividad1.databinding.ActivityActiv1Binding
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class About: AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVolver.setOnClickListener{
            finish() }
        }
    }



