// Android CTA23 - Noite
// Exercícios de Kotlin Nível I

fun main() {
	// Solução 1
	var nome = "Deyvison J Paula"
    println("Olá, $nome!")
        
    //Solução 2
    var a: Double = 5.9
    var b: Double = 54.1
    println("A soma de a + b = " + (a+b))
    
	//Solução 3
	var x = 5;
    println("$x ao quadrado = " + (x*x))
	
    // Solução 4
    println("O dobro de $a = " + (a+a))
    
    // Solução 5
    println("O Antecessor de $x é: [" + (x-1) + "] - E o Sucessor é: [" + (x+1) + "]")
	// Solução 6
    println("7 meses tem o total de " + (30*7) + " dias.")
    
    // Solução 7
	var nota1 = 5; var nota2 = 10; var nota3 = 7; var nota4 = 7; var nota5 = 6.5;
    println("A média das 5 notas é = " + ((nota1 + nota2 + nota3 + nota4 + nota5)/5))
    
	// Solução 8
	var metros = 500;
    println("$metros metros <=> " + metros*100 + " centímetros")
    
    // Solução 9
    var preco: Double = 55.50;
    var desconto = 0.10;
    println("Voce tem 10% de desconto, valor a pagar = " + (preco - (preco*desconto)))
    // Solução 9 (Alternativa)
    val produtoPreco = 150.0
    var desconto = 20.0
    var valorDesconto = produtoPreco * (desconto/100)
    println("Desconto de R$" + valorDesconto)
}
