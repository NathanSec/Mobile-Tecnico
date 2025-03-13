# Classes Ex:
1)
//Considere o seguinte código

fun main(){
    val emp = Empregado("Dimas", 5000)
    println(emp)
    emp.salario += 500
    println(emp)
}

//Crie uma classe de dados Empregado com as propriedades
//nome e salario. O nome pode ser uma constante, mas o
//salário deve ser uma variável, caso contrário, não
//poderemos lhe dar aumento
2) //Considere o seguinte código

import kotlin.random.Random

data class Empregado(val nome: String, var salario: Int)

//Escreva seu código aqui

fun main() {
    val empGen = GeradorEmpregadoAleatorio(10000, 30000)
    println(empGen.gerarEmpregado())
    println(empGen.gerarEmpregado())
    println(empGen.gerarEmpregado())
    empGen.salarioMin = 15000
    empGen.salarioMax = 50000
    println(empGen.gerarEmpregado())
}

// Crie uma classe que gera empregados aleatórios. 
//Defina dentro dessa classe uma lista
//fixa de nomes potenciais e ponha no cabeçalho da classe 
//o valor do salário mínimo e  máximo. 
//Dica: o conteúdo da função main deve guiar a criação dessa classe.