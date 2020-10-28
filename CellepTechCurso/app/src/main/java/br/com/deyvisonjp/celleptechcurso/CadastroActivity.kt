package br.com.deyvisonjp.celleptechcurso

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        // Otendo as referencias para os componentes
        val edtCadastroNome: EditText = findViewById(R.id.edtCadastroNome);
        val edtCadastroSobrenome: EditText = findViewById(R.id.edtCadastroSobrenome);
        val edtCadastroEmail: EditText = findViewById(R.id.edtCadastroEmail);
        val edtCadastroSenha: EditText = findViewById(R.id.edtCadastroSenha);
        val btnCadastroCdastrar: Button = findViewById(R.id.btnCadastroCadastrar)
        val spnCadastroSpinner: Spinner = findViewById(R.id.spnCadastroGenero);

        // Criando uma lista de generos para o spineer
        val listaDeGeneros = arrayListOf("Selecione o genêro", "Feminino", "Masculino", "Não-binário")

        // Criar num adaptador para o spinner
        val generoAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item, //Layout
            listaDeGeneros
        )

        //Plugar a lista Adapter
        spnCadastroSpinner.adapter = generoAdapter;

        // Listener do botao cadastrar
        btnCadastroCdastrar.setOnClickListener {
            // Obtendo os dados inseridos pelo usuário
            val nome = edtCadastroNome.text.toString().trim();
            val sobrenome = edtCadastroSobrenome.text.toString().trim();
            val email = edtCadastroEmail.text.toString().trim();
            val senha = edtCadastroSenha.text.toString().trim();
            // Obtendo o item que foi selecionado pelo spinner
            val genero = spnCadastroSpinner.selectedItem.toString();

            // Validando Campos
            if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() ||
                senha.isEmpty() || genero == listaDeGeneros[0]) {
                // Exibindo a mensagem de erro com Toast
                Toast.makeText(this, "Todos os campos devem ser preenchidos!", Toast.LENGTH_LONG).show()
            } else {

                // Criar ou acessar o arquivo de SharedPreferences
                val sharedPrefs = getSharedPreferences("cadastro_$email",
                                                        Context.MODE_PRIVATE);

                // Criando uma referencia para o editor do arquivo
                val editPrefs = sharedPrefs.edit();

                // Definindo as alterações do arquivo
                editPrefs.putString("NOME", nome)
                editPrefs.putString("SOBRENOME", sobrenome)
                editPrefs.putString("EMAIL", email)
                editPrefs.putString("SENHA", senha)
                editPrefs.putString("GENERO", genero)

                // Salvando as alterações no arquivo de SharedPreferences
                editPrefs.apply()

                // Abrir a tela Main após salvar
                val mIntent = Intent(this, MainActivity::class.java)

                // Passando dados de um activity para outra utlizando a intent
                mIntent.putExtra("INTENT_EMAIL", email)

                startActivity(mIntent)

                // Fechar todas telas que estavam abertas por dependência a essa
                finishAffinity()
            }
        }

    }
}