package simulacion;

/**
 *
 * @author pzx64
 */
public class MetodoMixtoCongruencias {
    int a, c, semilla, copiasemilla, mod;
    float numero;
    public MetodoMixtoCongruencias(int a, int c, int semilla, int mod){
        this.a = a;
        this.c = c;
        this.semilla = semilla;
        this.mod = mod;
        copiasemilla = semilla;
        
        for(int contador = 1; contador < semilla;contador++){
            if((a*copiasemilla+c) > mod){
                numero = (float) ((a*copiasemilla+c)%mod)/mod;
            } else {
                numero = (float) (a*copiasemilla+c)/mod;
            }
            System.out.println("Numero generado es: " + numero);
            copiasemilla = (a*copiasemilla+c)%mod;
        }
        
    }
}
