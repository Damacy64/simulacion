package simulacion;

/**
 *
 * @author pzx64
 */
import javax.swing.JOptionPane;

public class Practica4 {

    public static void main(String[] args) {
        int opcion;
        ProcesoIndustrial x = new ProcesoIndustrial();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Un Sistema De Produccion" + "\n1 - Paletas Magnum" + "\n2 - Crayolas" + "\n3 - Pan De Caja"));
            switch (opcion) {
                case 1:
                    System.out.println("Este Programa Somula La Elaboracion De La Paleta Magnum");
                    int numeroDeProcesos = x.numProceso();
                    x.procesosI();
                    break;

                case 2:
                    System.out.println("Este Programa Somula La Elaboracion De La Crayola");
                    int numeroDeProcesos2 = x.numProceso();
                    x.procesosI();
                    break;

                case 3:
                    System.out.println("Este Programa Somula La Elaboracion Del Pan De Caja");
                    int numeroDeProcesos3 = x.numProceso();
                    x.procesosI();
                    break;
            }
        } while (opcion > 3 || opcion < 1);
    }

}
