fun main(args: Array<String>) {
      // Comentário em linha - 1º dia de Aula
    
    /* Comentário em . . .
     . . . Multiplas . . . 
     . . .  linhas 
    */
    
    // Variáveis Mutáveis e Imutáveis
    	// Variável Mutável
    	var nome = "Kotlin Android"
    	var idade = 18;
    	var altura = 1.74;
    	nome = "Fulano"
    	idade = 25;
    
    	// Variável Imutável
    	val tipoSanguineo = "O+";
    	val CPF = "111555777-22"
    	
    
    /* Tipos de dados
     * Primitivos
        - Inteiro: byte, short, int e long (var filhos = 0);
        - Decimal: float e double (var peso = 70.5);
        - Caractere: char (var genero = 'M');
        - Booleano: boolean (false = 0 e true = 1);
      * Não Primitivos
        - String (var nome = "Antonio Dafonseca");
    */
    
	// Declarando variáveis com inferência de dados:::
        var linguagem = "Kotlin" // String
        var letra = 'z' // Char
        var ano = 1998 // Inteiro -> Int
        var distancia = 99999999999L
        var temperatura = 25.9 // Decimal -> Double
        var media = 5.5f // Decimal -> Float

	// Declarando Variáveis com tipo explicito:::
        var valor : Float = 8.5f
        var sobrenome : String = "Reis"
        var caractere : Char = 'R'

    // Concatenação
    	println(nome + " - Tipo Sanguineo: " + tipoSanguineo + " - CPF: " + CPF);
    	println("Idade: " + idade + " - Altura: " + altura);
    
    // Interpolação de Strings
    var frase: String = "$nome $sobrenome tem $idade anos e programa em $linguagem"
    println(frase)
}
