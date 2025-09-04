package acuario

//fun contruirAcuario(){
  //  val acuario1 = Acuario()
  //  acuario1.imprimirTamano()
    // altura y largo amchop (25)
   // val acuario2 = Acuario(ancho =25)
 //   acuario2.imprimirTamano()
    /// ancho por defecto
  //  val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()
    // todos perzonalizados
  //  val acuario4 = Acuario(alto = 35, largo = 110, ancho = 25)
  //  acuario4.imprimirTamano()
   // val acuario5 = Acuario(numeroDePeces = 29)
   // acuario5.imprimirTamano()
   // val acuario6 = Acuario(numeroDePeces =29)
   // acuario6.imprimirTamano()
   // acuario6.volumen=70
   // acuario6.imprimirTamano()
   // val acuario7 = Acuario(largo = 25, ancho = 25, alto = 40)
   // acuario7.imprimirTamano()
    //val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
   // miAcuario.imprimirTamano()

   // Crear un objeto de la subclase TanqueTorre
   // val miTorre = TanqueTorre(diametro = 25, alto = 45)
  //  miTorre.imprimirTamano()
//}
fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El color del Tiburón es: ${tiburon.color}")
    println("El color del Pez Payaso es: ${pezPayaso.color}")
    tiburon.comer()
    pezPayaso.comer()
}
fun main(){
        crearPeces()
    }

