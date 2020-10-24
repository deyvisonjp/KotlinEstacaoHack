package br.com.deyvisonjp.celleptechcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Padrão de funcionamento, não há necessidade de alteração
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)

        // Abrir a tela LoginActivity após 2.5s
        Handler(Looper.getMainLooper()).postDelayed({

            // Criando uma intent e armazenando em uma variável
            val myIntent = Intent(this, LoginActivity::class.java)

            // iniciar myIntent
            startActivity(myIntent)

            // Após esse tempo encerre a SplashActcity
            finish()

        }, 2500)
    }
}