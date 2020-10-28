package br.com.deyvisonjp.celleptechcurso

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Capturando as referências para os copmponentes visuais
        val editTextEmail: EditText = findViewById(R.id.editTextEmail);
        val editTextSenha: EditText = findViewById(R.id.editTextSenha);
        val btnLoginEntrar: Button = findViewById(R.id.btnLoginEntrar);
        val btnLoginCadastrar: Button = findViewById(R.id.btnLoginCadastrar);

        // Criando o Listener (ouvinte) do botao
        btnLoginEntrar.setOnClickListener {
            val email = editTextEmail.text.toString().trim();
            val senha = editTextSenha.text.toString().trim();

            // Validação dos campos
            if (email.isEmpty()) {   // o mesmo que -> if (email == " ")
                editTextEmail.error = "Campo obrigatório"
                editTextEmail.requestFocus()
            }

            if (senha.isEmpty()) {
                editTextSenha.error = "Campo obrigatório"
                editTextSenha.requestFocus()
            }

            else { //Campos não estão vazios

                // Criando Referencia ao Shared Preferences
                val sharedPrefs = getSharedPreferences("cadastro_$email", Context.MODE_PRIVATE)
                val emailLogin = sharedPrefs.getString("EMAIL", "")
                val senhaLogin = sharedPrefs.getString("SENHA", "")

                // Verificação de email e senha
                if (email == emailLogin && senha == senhaLogin) {

                    // Exibindo uma mensagem usando o Toast -> makeText (tela a mostrar, texto a ser exibido, tempo a ser exibido)
                    Toast.makeText(this, "Você acaba de logar . . .", Toast.LENGTH_SHORT).show()

                    // Abrir MainActivity
                    val mIntent = Intent(
                        this,
                        MainActivity::class.java
                    ) // Intent(Tela que estamos, tela a ser direcionada)

                    mIntent.putExtra("INTENT_EMAIL", email)

                    startActivity(mIntent);
                    finish();
                }
                else {
                    Toast.makeText(this, "Email ou senha inválidos", Toast.LENGTH_SHORT).show()
                }
            }
        };

        // Listener do botao cadastrar
        btnLoginCadastrar.setOnClickListener {
            val mIntent = Intent(this, CadastroActivity::class.java)
            startActivity(mIntent)
        }
    }
}