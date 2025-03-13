fun intervaloEmSegundos( horas: Int = 0, minutos: Int = 0 ,  segundos: Int = 0): Int{
        return ((horas * 60) + minutos) * 60 + segundos
}
fun main(){
        println(intervaloEmSegundos( 1, 30, 20 ) )
        println(intervaloEmSegundos(horas = 0, minutos = 1 ,segundos = 25 ) )
        println(intervaloEmSegundos(horas = 2, minutos = 0, segundos = 0) )
        println(intervaloEmSegundos(horas = 0 , minutos = 10 ,segundos = 0 ) )
        println(intervaloEmSegundos(horas = 1, minutos = 0, segundos = 1 ) )
}