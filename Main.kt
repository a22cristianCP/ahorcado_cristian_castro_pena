//Cristian Castro Pena
//Grupo A -DAM


import kotlin.system.exitProcess

fun main() {
    //Iniciamos reproductor de música
    val rm = ReproductorMidi("pugnodollari.mid")

    println("Bienvenido al juego del ahorcado.")
    println("Cargando juego, espere a que se inicie la partida...")

    //Hilo para simular el tiempo de carga de la partida
    Thread.sleep(7000)

    println("Tienes que adivinar una fruta (sin tildes), tienes hasta 7 fallos")

    // Diccionario de palabras relacionadas (en este caso, frutas)
    val palabras = listOf("manzana", "platano", "naranja", "fresa", "mango", "kiwi", "cereza")

    // Escoger una palabra aleatoria
    val palabraSecreta = palabras.random()
    val palabraOculta = palabraSecreta.map { '_' }.toMutableList()

    //Mostramos la plabra a adivinar a través de guiones bajos, así el jugador sabe el número de letras totales
    println("La palabra a adivinar es: ${palabraOculta.joinToString(" ")}")


    var fallos = 0
    val maxFallos = 7
    val letrasIntentadas = mutableSetOf<Char>()


    //Bucle que implementa la dinamica de juego
    while (fallos < maxFallos && palabraOculta.contains('_')) {
        print("\nIntroduce una letra: ")
        //Convertimos a minuscula para evitar errores en las entradas
        val input = readLine()?.lowercase()

        //Hacemos dos if para comprobar que la letra sea válida, que no esté vacía o que no haya sido usada
        if (input.isNullOrEmpty() || input.length != 1) {
            println("Por favor, introduce una sola letra válida.")
            continue
        }

        val letra = input[0]

        if (letrasIntentadas.contains(letra)) {
            println("Ya intentaste esta letra. Prueba otra.")
            continue
        }

        letrasIntentadas.add(letra)

        if (palabraSecreta.contains(letra)) {
            // Actualizar la palabra oculta
            palabraSecreta.forEachIndexed { index, char ->
                if (char == letra) {
                    palabraOculta[index] = letra
                }
            }
            println("¡Bien hecho! Letra correcta.")
        } else {
            // Incrementar los fallos
            fallos++
            println("Letra incorrecta. Te quedan ${maxFallos - fallos} intentos.")
            DibujoAhorcado.dibujar(fallos) // Dibujar el ahorcado progresivamente
        }

        println("Progreso: ${palabraOculta.joinToString(" ")}")
    }

    // Resultado del juego
    if (fallos >= maxFallos) {
        println("\n¡Has perdido! La palabra secreta era: $palabraSecreta")
        DibujoAhorcado.dibujar(7) // Dibujar el ahorcado final
        exitProcess(0)


    } else {
        println("\n¡Felicidades! Has adivinado la palabra: $palabraSecreta")
        exitProcess(0)
    }

}
