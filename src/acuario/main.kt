package acuario

import acuario.TanqueTorre

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    // Imprimir los colores de los peces
    println("El color del Tiburón es: ${tiburon.color}")
    println("El color del Pez Payaso es: ${pezPayaso.color}")

    // Llamar al método comer() para cada pez
    tiburon.comer()
    pezPayaso.comer()

    // Crear un acuario
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    // Crear un tanque torre
    val miTorre = TanqueTorre(diametro = 25, alto = 45)
    miTorre.imprimirTamano()
}

fun main() {
    crearPeces()
}
