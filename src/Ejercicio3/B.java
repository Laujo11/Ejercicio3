package Ejercicio3;

public class B {

    private String mensaje;

    public B() {
    }

    public void mensajeRecibido(String mensaje) {
        System.out.println("El mensaje ' " + mensaje + " ' fue recibido por el objeto de la clase B");
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
