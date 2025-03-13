# Exercicio 1:
Considere o código abaixo

fun main(){
        val acoes = listOf("titulo", "ano", "autor")
        val prefixo = "http://exemplo.com.br/info"
        val id = 5
        val urls = //Escreva seu código
        println(urls)
}

Use uma expressão lambda para criar uma lista de URLs do tipo "http://exemplo.com.br/info/5/titulo" a partir da lista de ações.

# Exercicio 2:
Considere o código abaixo

fun repetir(n: Int, funcao: () -> Unit){
//Escreva seu código aqui
}

fun main(){
//Escreva seu código aqui
}

Escreva uma função que aceita um argumento n do tipo Int e uma função do tipo () -> Unit, repita a execução dessa função n vezes. Depois chame essa função para imprimir "Kamehameha!" 3 vezes.