package Ejercicio3;

public class E {

    private String mensaje;

    public E() {
    }

    public void mensajeRecibido(String mensaje) {
        System.out.println("El mensaje ' " + mensaje + " ' fue recibido por el objeto de la clase E");
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
