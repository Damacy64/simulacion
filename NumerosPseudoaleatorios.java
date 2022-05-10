package simulacion;

/**
 *
 * @author pzx64
 */
import java.util.Scanner;

public class NumerosPseudoaleatorios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Eliga una opcion \n1.Metodo Congruencial\n2.Metodo Potencias Sucesivas\n3.Metodo Aditivo");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Metodo Congruencial\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int semilla, modulo;
                    System.out.println("Metodo Congruencial");
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    MetodoCongruencial metodo1 = new MetodoCongruencial(semilla, modulo);
                } else if (opcion == 2) {
                    int semilla, modulo;
                    System.out.println("Metodo Congruencial");
                    semilla = (int) (Math.random() * 100);
                    modulo = (int) (Math.random() * 100);
                    MetodoCongruencial metodo1 = new MetodoCongruencial(semilla, modulo);
                }
                break;
            case 2:
                System.out.println("Metodo Potencias Sucesivas\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int semilla, modulo, i;
                    System.out.println("Metodo Potencias Sucesivas");
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    System.out.println("Ingrese el valor de i");
                    i = leer.nextInt();
                    MetodoPotenciasSucesivas metodo2 = new MetodoPotenciasSucesivas(semilla, modulo, i);
                } else if (opcion == 2) {
                    int semilla, modulo, i;
                    System.out.println("Metodo Potencias Sucesivas");
                    semilla = (int) (Math.random() * 100);
                    modulo = (int) (Math.random() * 100);
                    i = (int) (Math.random() * 100);
                    MetodoPotenciasSucesivas metodo2 = new MetodoPotenciasSucesivas(semilla, modulo, i);
                }
                break;
            case 3:
                System.out.println("Metodo Aditivo\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int semilla, ni, modulo;
                    System.out.println("Metodo Aditivo");
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    System.out.println("Ingrese el valor de ni (constante)");
                    ni = leer.nextInt();
                    MetodoAditivo metodo3 = new MetodoAditivo(ni, modulo, semilla);
                } else if (opcion == 2) {
                    int semilla, ni, modulo;
                    System.out.println("Metodo Aditivo");
                    semilla = (int) (Math.random()*100);
                    ni = (int) (Math.random()*100);
                    modulo = (int) (Math.random()*100);
                    MetodoAditivo metodo3 = new MetodoAditivo(ni, modulo, semilla);
                }
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
        // System.out.println("Metodo Mixto Congruencias");
        // MetodoMixtoCongruencias metodo4 = new MetodoMixtoCongruencias(17, 11, 7, 19);
    }

}
