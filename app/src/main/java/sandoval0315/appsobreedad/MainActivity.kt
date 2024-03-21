package sandoval0315.appsobreedad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Txtnum = findViewById<EditText>(R.id.txtnum)
        val Btncalcular = findViewById<Button>(R.id.btncalcular)
        val Txtresultado = findViewById<TextView>(R.id.txtresultado)

        val objCalcular = Calcular()

        Btncalcular.setOnClickListener {
            val resultado = objCalcular.calcular(Txtnum.text.toString().toInt())
            println("el resultado es $resultado")
Txtresultado.text = "el resultado es $resultado"
        }
    }
}