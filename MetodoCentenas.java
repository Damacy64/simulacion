package simulacion;

/**
 *
 * @author pzx64
 */
import java.util.Scanner;

public class MetodoCentenas {
    int semilla, contador, modulo=0;
    public MetodoCentenas(int semilla, int contador){
        this.semilla = semilla;
        this.contador = contador;
    }
    
    public int modulo(){
        int aux, csemilla = semilla;
        while(csemilla>0){
            aux = csemilla%10;
            modulo += aux;
            csemilla/=10;
        }
        return modulo;
    }
    
    public static void main(String[] args) {
        MetodoCentenas metodo = new MetodoCentenas(1235, 0);
        System.out.println(metodo.modulo());
    }
}
