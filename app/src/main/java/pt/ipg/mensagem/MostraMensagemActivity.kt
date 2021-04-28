package pt.ipg.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val data : Date = intent.getSerializableExtra(MainActivity.INFO_EXTRA_DATA) as Date
        val textViewMensagem = findViewById<TextView>(R.id.editTextMensagem)
        textViewMensagem.setText(mensagem)
        findViewById<TextView>(R.id.data)
        textViewMensagem.setText(data.toString())
    }
}