package pt.ipg.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity::INFO_EXTRA_MENSAGEM.toString())
        val textViewMensagem = findViewById<TextView>(R.id.editTextMensagem)
        textViewMensagem.setText(mensagem)
    }
}