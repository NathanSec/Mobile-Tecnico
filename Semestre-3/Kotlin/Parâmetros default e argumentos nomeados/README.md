# Kotlin-Tecnico
Considere o código abaixo:

fun intervaloEmSegundos( horas: Int, minutos: Int, segundos: Int): Int{
        return ((horas * 60) + minutos) * 60 + segundos)
}
fun main(){
        println(intervaloEmSegundos( 1, 30, 20 ) 
}

Usando parâmetros default e argumentos nomeados, reescreva o código acima para calcular em segundos os seguintes intervalos de tempo:

1 minuto e 25 segundos
2 horas
10 minutos
1 hora e 1 segundo