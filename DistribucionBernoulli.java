package simulacion;

/**
 *
 * @author pzx64
 */
import java.util.Scanner;

public class DistribucionBernoulli {

    public static void main(String[] args) {
        int p, x, prob;
        float ri;
        Scanner leer = new Scanner(System.in);
        System.out.println("1. llenar valores de Ri\n2.Llenar valores en automatico de Ri");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Este programa genera una v.a. condistribucion bernoulli");
                System.out.println("¿Cual es el valor de p?");
                p = leer.nextInt();
                prob = 100 - p;
                System.out.println("Introduzca el valor del ri");
                ri = leer.nextFloat();
                if (0.0 <= ri && ri <= prob) {
                    System.out.println("la v.a con distribucion Bernoulli es cero");
                    System.out.println("x=0, no ocurre el evento");
                } else if (prob <= ri && ri <= 1.0) {
                    System.out.println("La v.a con distribucion Bernoulli es uno\n"
                            + "x=1, ocurre el evento");
                }
                break;
            case 2:
                System.out.println("Este programa genera una v.a. condistribucion bernoulli");
                System.out.println("¿Cual es el valor de p?");
                p = leer.nextInt();
                prob = 100 - p;
                System.out.println("¿Cuantos ri desea generar?");
                int riopcion = leer.nextInt();
                while (riopcion > 0) {
                    ri = (float) Math.random();
                    if (0.0 <= ri && ri <= prob) {
                        System.out.println("la v.a con distribucion Bernoulli es cero");
                        System.out.println("x=0, no ocurre el evento");
                    } else if (prob <= ri && ri <= 1.0) {
                        System.out.println("La v.a con distribucion Bernoulli es uno\n"
                                + "x=1, ocurre el evento");
                    }
                    riopcion--;
                }
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
    }
}
