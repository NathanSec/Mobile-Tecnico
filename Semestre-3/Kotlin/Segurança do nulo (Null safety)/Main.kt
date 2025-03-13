data class Empregado(val nome: String, var salario: Int)

fun empregadoPeloId(id: Int) = when (id) {
    1 -> Empregado("Inácio", 4000)
    2 -> null
    3 -> Empregado("Bráulio", 5000)
    4 -> Empregado("Emengarda", 6000)
    else -> null
}


fun main() {
    println((1..5).sumOf { id -> salarioPeloId(id) })
}
fun salarioPeloId(id: Int): Int {
    return empregadoPeloId(id)?.salario ?: 0
}
