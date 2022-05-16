/*
 * Metodo para generar un numero pseudoaleatorio
 * usando el metodo multiplicativo binario
 */
package simulacion;

/**
 *
 * @author pzx64
 */
public class MetodoMultiplicativoBinario {
    int t, semilla, b, contador;
    float resultado;
    public MetodoMultiplicativoBinario(int t, int semilla, int b, int contador){
        this.t = t;
        this.semilla = semilla;
        this.b = b;
        this.contador = contador;
        int numero;
        String binario = "";
        int a = (8*t)+semilla;
        for(;contador > 0; contador--){
            numero = a * semilla;
            if(numero > 0){
                while(numero > 0){
                    if(numero%2 == 0){
                        binario = "0" + binario;
                    } else{
                        binario = "1" + binario;
                    }
                    numero = (int) numero/2;
                }
            } else if (numero == 0){
                binario = "0";
            } else{
                binario = "No se puede convertir el numero.";
            }
            System.out.println("El numero convertido a binario es: " + binario);
            int nbinario = Integer.parseInt(binario);
        }
    }
}
