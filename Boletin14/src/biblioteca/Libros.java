
package biblioteca;

public class Libros extends Publicacion{
    private boolean prestado= false;
    

    public Libros() {
    }

    public Libros(boolean prestado, String codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "prestado=" + prestado ;
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
