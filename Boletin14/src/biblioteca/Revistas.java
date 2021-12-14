
package biblioteca;

public class Revistas extends Publicacion{
    
    private int numero;

    public Revistas() {
    }
    
    public Revistas(int numero, String codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }
    
    public int getNumero( int numero){
        this.numero=numero;
        return numero;
    }

    @Override
    public String toString() {
        return "numero=" + numero;
    }
    @Override
    public String getCodigo(){
        return super.getCodigo();
    }
    @Override
    public int getAnoPublicacion(){
        return super.getAnoPublicacion();
    }
    
    
    
}
