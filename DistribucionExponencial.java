package simulacion;

/**
 *
 * @author pzx64
 */
import java.util.Scanner;

public class DistribucionExponencial {

    public static void main(String[] args) {
        int lamda;
        float ri;
        double a, a1, ei;
        Scanner leer = new Scanner(System.in);
        System.out.println("1. llenar valores de Ri\n2.Llenar valores en automatico de Ri");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Este programa genera una v.a. con distribucion exponencial");
                System.out.println("Introduzca el valor de lamda");
                lamda = leer.nextInt();
                System.out.println("Introduzca un valor de ri");
                ri = leer.nextFloat();
                a = (1 - ri);
                a1 = Math.log(a);
                lamda = lamda * -1;
                ei = (lamda * a1);
                System.out.println("El valor de la v.a con distribucion exponencial es: " + ei);
                break;
            case 2:
                System.out.println("Este programa genera una v.a. con distribucion exponencial");
                System.out.println("Introduzca el valor de lamda");
                lamda = leer.nextInt();
                System.out.println("¿Cuantos ri desea generar?");
                int riopcion = leer.nextInt();
                while (riopcion > 0) {
                    ri = (float) Math.random();
                    a = (1 - ri);
                    a1 = Math.log(a);
                    lamda = lamda * -1;
                    ei = (lamda * a1);
                    System.out.println("El valor de la v.a con distribucion exponencial es: " + ei);
                    riopcion--;
                }
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
    }
}
