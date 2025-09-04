package acuario

// Clase abstracta Pez
abstract class Pez {
    // Propiedad abstracta 'color' que debe ser implementada en las subclases
    abstract val color: String
}

// Clase Tiburón que hereda de Pez
class Tiburon : Pez() {
    override val color: String = "gris"
}

// Clase PezPayaso que hereda de Pez
class PezPayaso : Pez() {
    override val color: String = "dorado"
}
