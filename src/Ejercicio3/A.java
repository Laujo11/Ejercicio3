package Ejercicio3;

public class A {

    private String mensaje;

    public A() {
    }

    public void mensajeRecibido(String mensaje) {
        System.out.println("El mensaje ' " + mensaje + " ' fue recibido por el objeto de la clase A");
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
