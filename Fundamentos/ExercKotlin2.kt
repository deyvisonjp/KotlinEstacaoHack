// Exercícios de Kotlin Nível II

// 1. Crie funções para as 4 operações aritméticas básicas
    fun soma (x: Int, y: Int): Int {
        return x + y;
    }
    fun subtracao (x: Int, y: Int): Int {
        return x - y;
    }
    fun multiplicacao (x: Int, y: Int): Int {
        return x * y;
    }
    fun divisao (x: Int, y: Int): Int {
        return x / y;
    }

// 2. Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa é maior ou menor de idade
	fun ehMaiorDeidade (idade: Int): String {
        if (idade >= 18) {
            return "É MAIOR de idade" 
        }
        return "É MENOR de idade"
    }
    
//3. Utilizando a estrutura condicional e operadores relacionais, desenvolva um algoritmo que identifique se um determinado número inteiro é par ou ímpar
	fun parImpar(num: Int): String {
        if (num % 2 == 0) {
            return "É par"
        } else { return "É ímpar"}
    }
    
// 4. Utilizando a estrutura condicional e operadores lógicos, desenvolva um algoritmo que simule um sistema de login    
   	var login = "login@email.com";
	var senha = "159357";
	fun logar(l: String, s: String): String {
        if( l == login && s == senha) {
            return "Bem vindo Usuário"; 
        } else {
            return "email ou senha incorreto";
        }
    }
    
// 5. Desenvolva uma função que calcule o IMC de uma pessoa, imprimir o valor do IMC e sua classificação
	fun imc(massa: Float, altura: Float): String {
        var result = (massa/(altura*altura));
        if (result >= 29.9) {
            return "Acima do peso"
        } else {
            return "Abaixo do peso"
        }
    }
    
// 6. Utilizando o loop de repetição for, desenvolva um algoritmo que imprima qualquer tabuada
	var tabuadaDe = 7;
	fun tabuada(tabuadaDe: Int) : String {
        var tab = "";
        for (i in 1..10) {
            tab += "$tabuadaDe * $i = " + tabuadaDe * i + "\n"
        }
        return tab;
    }

// 7. Utilizando o loop de repetição for, desenvolva um algoritmo que conte a quantidade de vogais em uma String
	var vogais = arrayListOf('a', 'e', 'i', 'o', 'u');
	fun qtdVogais(frase: String): Int {
        var contaVogais = 0;
        for (letra in frase) {
            for (vogal in vogais) {
            	if (letra == vogal) {
                    contaVogais += 1;
                }
            }
        }
        return contaVogais;
    }

fun main() {
      
  println(ehMaiorDeidade(4));
	println(parImpar(2));
  println(logar("login@email.com", "159357"));
  println(imc(84.5f, 1.7f));
  println(tabuada(tabuadaDe))
  var texto = "Vamos testassaar";
  println("Texto: $texto . . .")
  println("Quantidade de vogais no texto: " + qtdVogais(texto))
  
}