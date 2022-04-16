package Ejercicio3;

public class C {

    private String mensaje;

    public C() {
    }

    public void mensajeRecibido(String mensaje) {
        System.out.println("El mensaje ' " + mensaje + " ' fue recibido por el objeto de la clase C");
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
