package simulacion;

/**
 *
 * @author pzx64
 */
public class NumerosPseudoaleatorios {
    public static void main(String[] args) {
        System.out.println("Metodo Congruencial");
        MetodoCongruencial metodo1 = new MetodoCongruencial(59,26);
        System.out.println("");
        System.out.println("Metodo Potencias Sucesivas");
        MetodoPotenciasSucesivas metodo2 = new MetodoPotenciasSucesivas(7, 23, 10);
        System.out.println("");
        System.out.println("Metodo Aditivo");
        MetodoAditivo metodo3 = new MetodoAditivo(13, 11, 23);
        System.out.println("");
        System.out.println("Metodo Mixto Congruencias");
        MetodoMixtoCongruencias metodo4 = new MetodoMixtoCongruencias(17, 11, 7, 19);
    }
    
}
