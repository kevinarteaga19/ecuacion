package clase05;

public class Ecuaciones {

    double a;

    double b;

    double c;

    void establecerA(double numa) {
        a = numa;
    }

    double obtenerA() {
        return a;
    }

    void establecerB(double numb) {
        b = numb;
    }

    double obtenerB() {
        return b;
    }

    void establecerC(double numc) {
        c = numc;
    }

    double obtenerC() {
        return c;
    }

    public float discriminante() {
        float discriminante;

        discriminante = (float) (Math.pow(obtenerB(), 2) - 4 * obtenerA() * obtenerC());

        return discriminante;
    }

    public void restrincion() {
        if (discriminante() > 0) {

            System.out.println("Hay dos soluciones reales distintas");

        } else if (discriminante() == 0) {

            System.out.println("Hay una solucion doble");

        } else if (discriminante() < 0) {

            System.out.println("No existe solucion real, soluciones complejas");
        }
    }

    public float raiz1() {
        float raiz1;

        raiz1 = (float) (((-obtenerB()) + (Math.sqrt(discriminante()))) / (2 * obtenerA()));

        return raiz1;
    }

    public float raiz2() {
        float raiz2;

        raiz2 = (float) (((-obtenerB()) - (Math.sqrt(discriminante()))) / (2 * obtenerA()));

        return raiz2;
    }

}
