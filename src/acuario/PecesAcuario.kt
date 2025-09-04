package acuario

import kotlin.math.PI

class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        get() = (ancho / 2 * largo / 2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho / 2 * largo / 2)).toInt()
        }

    override var agua: Double
        get() = volumen * 0.8
        set(valor) {
            volumen = (valor / 0.8).toInt()
        }

    override val forma: String = "cilindro"
}


// Clase abstracta Pez
abstract class Pez : AccionPez {
    abstract val color: String
}

// Clase Tiburón que implementa la interfaz AccionPez
class Tiburon : Pez() {
    override val color: String = "gris"

    override fun comer() {
        println("Cazar y comer peces")
    }
}

// Clase PezPayaso que implementa la interfaz AccionPez
class PezPayaso : Pez() {
    override val color: String = "dorado"

    override fun comer() {
        println("Comer algas")
    }
}
