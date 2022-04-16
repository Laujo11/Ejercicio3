package Ejercicio3;

public class D {

    private String mensaje;

    public D() {
    }

    public void mensajeRecibido(String mensaje) {
        System.out.println("El mensaje ' " + mensaje + " ' fue recibido por el objeto de la clase D");
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
