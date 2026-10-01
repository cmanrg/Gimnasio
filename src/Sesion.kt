open class Sesion(
    val nombre: String,
    val horario: String,
    val cupo: Int,
    val entrenador: Entrenador,
){
    val socios = mutableListOf<Socio>()
}