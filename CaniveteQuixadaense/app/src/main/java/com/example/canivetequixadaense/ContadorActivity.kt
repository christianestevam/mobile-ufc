import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.canivetequixadaense.R

class ContadorActivity : AppCompatActivity() {
    private var contador: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        val initialValue = intent.getIntExtra("initialValue", 0)
        contador = initialValue

        val contadorTextView: TextView = findViewById(R.id.contadorTextView)
        val incrementarButton: Button = findViewById(R.id.incrementarButton)

        contadorTextView.text = contador.toString()

        incrementarButton.setOnClickListener {
            contador++
            contadorTextView.text = contador.toString()
        }
    }
}
