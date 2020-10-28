package br.com.deyvisonjp.celleptechcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        // Referenciar o id do componente
        val wbvWeb: WebView = findViewById(R.id.wbvWeb)

        // habilitando a leitura de códigos  JavaScript
        wbvWeb.settings.javaScriptEnabled = true

        // Carregar a página web
        wbvWeb.loadUrl("http://br.cellep.com/estacaohack")

        // Definindo o WebView como cliente padrão
        wbvWeb.webViewClient = WebViewClient()
    }
}