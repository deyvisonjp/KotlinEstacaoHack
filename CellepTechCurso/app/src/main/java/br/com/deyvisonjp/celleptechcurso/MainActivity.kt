package br.com.deyvisonjp.celleptechcurso

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia para os ids dos componentes visuais
        val txvMainNome: TextView = findViewById(R.id.txvMainNome)
        val txvMainEmail: TextView = findViewById(R.id.txvMainEmail)
        val txvMainGenero: TextView = findViewById(R.id.txvMainGenero)
        val btnMainSair: Button = findViewById(R.id.btnMainSair)
        val btnMainSite: Button = findViewById(R.id.btnMainSite)

        // Recuperando o e-mail passado por meio da intent
        val email = intent.getStringExtra("INTENT_EMAIL")

        // Acessar o arquivo de Shared Preferences
        val sharedPrefs = getSharedPreferences("cadastro_$email", Context.MODE_PRIVATE)

        // Recuperar dados do arquivo Shared Preferences
        val nome = sharedPrefs.getString("NOME", "Nome não encontrado") //2º parametro -> Caso não encontre o NOME
        val sobrenome = sharedPrefs.getString("SOBRENOME", "")
        val genero = sharedPrefs.getString("GENERO", "Genêro não encontrado.")

        // Exibindo os dados no textView
        txvMainNome.text = "$nome $sobrenome"
        txvMainEmail.text = "$email"
        txvMainGenero.text = "$genero"

        // Listener (Ouvinte) do botão Sair
        btnMainSair.setOnClickListener{
            // Criando e definindo o Alert Dialog
            val alert = AlertDialog.Builder(this)
                    .setTitle("Atenção")
                    .setMessage("Deseja mesmo sair?")
                    .setPositiveButton("Sair") {_, _ ->
                        // Abre/Volta para a tela login
                        val mIntent = Intent(this, LoginActivity::class.java)
                        startActivity(mIntent)

                        // Finaliza todas a Activitys anteriores (da pilha)
                        finishAffinity()
                    }
                    .setNeutralButton("Não") {_, _ ->
                        // Não queremos fazer nada
                    }
                    .setCancelable(true)

            alert.show()
        }

        // Listener do botao site
        btnMainSite.setOnClickListener {
            // Abrindo a Web Activity (Versão em uma linha)
            startActivity(Intent(this, WebActivity::class.java))
        }

    }
}