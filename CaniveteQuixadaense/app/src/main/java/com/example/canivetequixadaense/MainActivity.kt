import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.canivetequixadaense.CalculadoraActivity
import com.example.canivetequixadaense.R


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startContadorButton: Button = findViewById(R.id.startContadorButton)
        val startCalculadoraButton: Button = findViewById(R.id.startCalculadoraButton)

        startContadorButton.setOnClickListener {
            val initialValueEditText: EditText = findViewById(R.id.initialValueEditText)
            val initialValue = initialValueEditText.text.toString().toIntOrNull() ?: 0

            val intent = Intent(this, ContadorActivity::class.java)
            intent.putExtra("initialValue", initialValue)
            startActivity(intent)
        }

        startCalculadoraButton.setOnClickListener {
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }
    }
}
