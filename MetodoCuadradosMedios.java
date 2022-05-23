package simulacion;

/**
 *
 * @author pzx64
 */
public class MetodoCuadradosMedios {
    int semilla, contador,nsemilla;
    float resultado=0;
    
    public MetodoCuadradosMedios(int semilla, int contador){
        this.contador = contador;
        this.semilla = semilla;
    }
    
    public int NuevaSemilla(){
        semilla = semilla*semilla;
        String Ssemilla = Integer.toString(semilla);
        int longitud = Ssemilla.length()-1;
        nsemilla = Integer.parseInt(Ssemilla.substring(1, longitud));
        return nsemilla;
    }
    
    public float Metodo(){
        int nsemilla = semilla^2;
        
        return resultado;
    }
    
    public static void main(String[] args) {
        MetodoCuadradosMedios metodo = new MetodoCuadradosMedios(38809, 0);
        System.out.println(metodo.NuevaSemilla());
    }
}
