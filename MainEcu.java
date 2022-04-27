package clase05;

public class MainEcu {
    public static void main(String[] args) {
        Ecuaciones ecuacion = new Ecuaciones();

        ecuacion.establecerA(2);

        ecuacion.establecerB(4);

        ecuacion.establecerC(-6);

        System.out.println("Coeficiente: " + ecuacion.obtenerA());

        System.out.println("Coeficiente: " + ecuacion.obtenerB());

        System.out.println("Coeficiente: " + ecuacion.obtenerC());

        System.out.println("Discriminante: " + ecuacion.discriminante());

        ecuacion.restrincion();

        System.out.println("Raiz1: " + ecuacion.raiz1());

        System.out.println("Raiz2: " + ecuacion.raiz2());
    }

}
