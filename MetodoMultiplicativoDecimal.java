package simulacion;

/**
 *
 * @author pzx64
 */
public class MetodoMultiplicativoDecimal {
    int a, semilla, modulo, contador;
    float resultado;
    public MetodoMultiplicativoDecimal(int a, int semilla, int modulo,int contador){
        this.a = a;
        this.semilla = semilla;
        this.modulo = modulo;
        this.contador = contador;
        int multiplicacion;
        
        for(;contador>0;contador--){
            multiplicacion = a * semilla;
            if (multiplicacion/modulo > 0){
                semilla = ((int) multiplicacion/modulo);
                resultado =(float) (multiplicacion/modulo)/modulo;
            } else {
                semilla = a * semilla;
                resultado = (float) (semilla/modulo);
            }
            System.out.println(resultado);
        }
        
    }
}
