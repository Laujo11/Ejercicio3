package Ejercicio3;

public class Main {

    public static A a1 = new A();
    public static B b1 = new B();
    public static C c1 = new C();
    public static D d1 = new D();
    public static E e1 = new E();

    public static void main(String[] args) {

        mensajesDesdeA();
        mensajesDesdeB();
        mensajesDesdeC();
        mensajesDesdeD();
        mensajesDesdeE();
    }

    public static void mensajesDesdeA() {
        System.out.println("Saludos del objeto de la clase A");
        a1.setMensaje("Saludo enviado desde el objeto a1 para el objeto b1");
        b1.mensajeRecibido(a1.getMensaje());
        a1.setMensaje("Saludo enviado desde el objeto a1 para el objeto c1");
        c1.mensajeRecibido(a1.getMensaje());
        a1.setMensaje("Saludo enviado desde el objeto a1 para el objeto d1");
        d1.mensajeRecibido(a1.getMensaje());
        a1.setMensaje("Saludo enviado desde el objeto a1 para el objeto e1");
        e1.mensajeRecibido(a1.getMensaje());
        System.out.println("");
    }

    public static void mensajesDesdeB() {
        System.out.println("Saludos del objeto de la clase B");
        b1.setMensaje("Saludo enviado desde el objeto b1 para el objeto a1");
        a1.mensajeRecibido(b1.getMensaje());
        b1.setMensaje("Saludo enviado desde el objeto b1 para el objeto c1");
        c1.mensajeRecibido(b1.getMensaje());
        b1.setMensaje("Saludo enviado desde el objeto b1 para el objeto d1");
        d1.mensajeRecibido(b1.getMensaje());
        b1.setMensaje("Saludo enviado desde el objeto b1 para el objeto e1");
        e1.mensajeRecibido(b1.getMensaje());
        System.out.println("");
    }

    public static void mensajesDesdeC() {
        System.out.println("Saludos del objeto de la clase C");
        c1.setMensaje("Saludo enviado desde el objeto c1 para el objeto a1");
        a1.mensajeRecibido(c1.getMensaje());
        c1.setMensaje("Saludo enviado desde el objeto c1 para el objeto b1");
        b1.mensajeRecibido(c1.getMensaje());
        c1.setMensaje("Saludo enviado desde el objeto c1 para el objeto d1");
        d1.mensajeRecibido(c1.getMensaje());
        c1.setMensaje("Saludo enviado desde el objeto c1 para el objeto e1");
        e1.mensajeRecibido(c1.getMensaje());
        System.out.println("");
    }

    public static void mensajesDesdeD() {
        System.out.println("Saludos del objeto de la clase D");
        d1.setMensaje("Saludo enviado desde el objeto d1 para el objeto a1");
        a1.mensajeRecibido(d1.getMensaje());
        d1.setMensaje("Saludo enviado desde el objeto d1 para el objeto b1");
        b1.mensajeRecibido(d1.getMensaje());
        d1.setMensaje("Saludo enviado desde el objeto d1 para el objeto c1");
        c1.mensajeRecibido(d1.getMensaje());
        d1.setMensaje("Saludo enviado desde el objeto d1 para el objeto e1");
        e1.mensajeRecibido(d1.getMensaje());
        System.out.println("");
    }

    public static void mensajesDesdeE() {
        System.out.println("Saludos del objeto de la clase E");
        e1.setMensaje("Saludo enviado desde el objeto e1 para el objeto a1");
        a1.mensajeRecibido(e1.getMensaje());
        e1.setMensaje("Saludo enviado desde el objeto e1 para el objeto b1");
        b1.mensajeRecibido(e1.getMensaje());
        e1.setMensaje("Saludo enviado desde el objeto e1 para el objeto c1");
        c1.mensajeRecibido(e1.getMensaje());
        e1.setMensaje("Saludo enviado desde el objeto e1 para el objeto d1");
        d1.mensajeRecibido(e1.getMensaje());
        System.out.println("");
    }
}
