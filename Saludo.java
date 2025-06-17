public class Saludo {
    public String GenerarSaludo(String nombre) {
        return nombre == null || nombre.isEmpty()? : "¡Hola, Invitado!" : "¡Hola " + nombre + " !";
    }
}