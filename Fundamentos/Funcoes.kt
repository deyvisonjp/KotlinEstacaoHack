// 2º dia de aula - Funções
fun main() {

    // Chamando a função
    cumprimento("Deyvison");
    dizOla()
    soma(25, 10);
    println("A resultado da multiplicação 5 x 10 = " + multi(5, 10));
    
}

// Declarando uma função
fun dizOla() {
    println("Hoje Vamos aprender Funções")
}

// Função com parâmetros
fun cumprimento(nome: String) {
    println ("Olá $nome, seja bem vindo!")
}

fun soma(a: Int, b: Int) {
    println("A soma de $a + $b = " + (a+b))
}

// Declarando função com retorno:
fun multi(a: Int, b: Int) : Int {
    val ab = a * b;
    return ab;
}

