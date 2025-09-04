package acuario

abstract class Pez : AccionPez {
    abstract val color: String
}

class Tiburon : Pez() {
    override val color: String = "gris"

    override fun comer() {
        println("Cazar y comer peces")
    }
}

class PezPayaso : Pez() {
    override val color: String = "dorado"

    override fun comer() {
        println("Comer algas")
    }
}
