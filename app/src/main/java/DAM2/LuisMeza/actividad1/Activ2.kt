package DAM2.LuisMeza.actividad1

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activ2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activ2)

        val botonmenu2=findViewById<Button>(R.id.botonMenu2)
        botonmenu2.setOnClickListener{
            finish()
        }
    }
}