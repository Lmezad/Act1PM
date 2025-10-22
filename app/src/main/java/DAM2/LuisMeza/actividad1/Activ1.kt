package DAM2.LuisMeza.actividad1

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activ1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activ1)
            // ESTO ES UNA PRUEBA DE GIT
            val botonmenu=findViewById<Button>(R.id.botonMenu)
            botonmenu.setOnClickListener{
                finish()
        }
    }
}