//Considere o seguinte código
data class Empregado( val nome: String , var salario: Int)
fun main(){
    val emp = Empregado("Dimas", 5000)
    println(emp)
    emp.salario += 500
    println(emp)

}

/*Crie uma classe de dados Empregado com as prpriedades
nome e salario. O nome pode ser uma constante, mas o 
salário deve ser uma variável, caso contrário, não 
podemos lhe dar aumento*/