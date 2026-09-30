class SesionPresencial(
    val salon: String,
    nombre: String,
    horario: String,
    cupo: Int,
    entrenador: Entrenador
) : Sesion(nombre, horario, cupo, entrenador) {

}