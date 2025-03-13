//Considere o código abaixo
 
import kotlin.random.Random
 
data class Empregado (val nome: String, var salario: Int)
 
//Escreva seu código aqui
class GeradorEmpregadoAleatorio(var salarioMin: Int , var salarioMax: Int){
    val nomesP = listOf<String>("Ana", "Beatriz", "Caroline", "Duda")
    
     fun gerarEmpregado(): Empregado{
     var nomeAleatorio = nomesP.random()
     var salarioAleatorio = Random.nextInt(salarioMin, salarioMax+1)
     return Empregado(nomeAleatorio, salarioAleatorio)
        
    }
}
    


 
fun main(){
    val empGen = GeradorEmpregadoAleatorio(10000, 30000)
    println(empGen.gerarEmpregado())
    println(empGen.gerarEmpregado())
    println(empGen.gerarEmpregado())
    empGen.salarioMin = 15000
    empGen.salarioMax = 50000
    println(empGen.gerarEmpregado())
}

/* Crie uma classe que gera empregados aleatorios. Defina dentro dessa classe uma lista 
fixa de nomes potenciais e ponha no cabeçalho da classe o valor do salário mínimo e
máximo. Dica: o conteúdo da função main deve guiar a criação dessa classe.*/