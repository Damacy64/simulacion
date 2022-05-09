package simulacion;

/**
 *
 * @author pzx64
 */
public class MetodoAditivo {
    int a, mod, ni,copiani;
    float numero;
    public MetodoAditivo(int a, int mod, int ni){
        this.a = a;
        this.mod = mod;
        this.ni = ni;
        copiani = ni;
        
        for(int contador = 1;contador < ni;contador++){
            if((a+ni) > mod){
                numero = (float) ((a+copiani)%mod)/mod;
            }else{
                numero = (float) (a+ni)/mod;
            }
            System.out.println("Numero generado es: " + numero);
            copiani = (a+copiani)%mod;
        }
    }
}
