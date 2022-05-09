package simulacion;


/**
 *
 * @author pzx64
 */
public class MetodoCongruencial {
    int a = 0, mod = 0;
    float respuesta;

    public MetodoCongruencial(int a, int mod){
        this.a = a;
        this.mod = mod;
        if(a < mod){
            respuesta = (float) a/mod;
        }
        else{
            respuesta = (float) (a%mod)/mod;
        }
        System.out.println("Numero generado es: " + respuesta);
    }
}
