fun main() {
	// Listas
	
	// Definindo e imprimindo uma lista 
	var professores = arrayListOf("David", "Kaory", "Raul");
    println(professores);
    
    // Acessando um item da lista
    println(professores[1])
    
    // Adicionando novos itens na lista
    professores.add("Moisés")
    println(professores)
    
    // Removendo itens da lista
    professores.removeAt(1)
    println(professores)
    
    // Pegando um item aleatório da lista
    println(professores.random())
    
    // Iterar os itens da lista com o comando for
    println("\nIteração de listas utlizando for:")
    for (nome in professores) {
        println("Professor $nome")
    }
    
    // Tamanho da lista (length)
    println("\nTamnho da lista: " + professores.size)
}