import java.util.*

fun main (args: Array<String>) {
    val palabra = "Ahorcado".toLowerCase()

    var listapalabra = mutableListOf<Char>()
    var listletras = mutableListOf<Char>()

    var letra:Char = ' '
    var contador = 0

    palabra.forEach{
        listapalabra.add('-')
    }

    while (listapalabra.contains('-')){
        listapalabra.forEach {
            print(it)
        }
        do{
            println("\n Introduzca una letra por favor: ")
            letra = readCharFromKeyboard2().toLowerCase()
            if(listletras.contains(letra))
                println("\n ¬_¬'U   La letra: "+letra+", ya ha sido anteriormente introducida... Mo se puede repetir!!! ")
        }while(listletras.contains(letra))
        listletras.add(letra)
        contador++

        for(i in palabra.indices){
            if(palabra[i]==letra)
                listapalabra.set(i,letra)
        }
    }
    println("\nCongratulations!!!\nHa descubierto la palabra: "+palabra+"" +
            "\nUsted ha necesitado: "+contador+" intentos")
}

fun readCharFromKeyboard2(): Char {
    var result: Char?
    val keyboardReader = Scanner(System.`in`)
    do {
        val selectedOption = keyboardReader.nextLine()
        result = if (selectedOption.length == 1) selectedOption[0] else null
    } while (result == null)
    return result
}


