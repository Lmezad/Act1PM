package DAM2.LuisMeza.actividad1

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activ3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activ3)
        val botonmenu=findViewById<Button>(R.id.botonMenu3)
        botonmenu.setOnClickListener{
            finish()
        }
    }
}