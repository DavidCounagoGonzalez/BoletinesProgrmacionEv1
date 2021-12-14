
package biblioteca;


public class Publicacion {
    
    private String codigo;
    private String titulo;
    private int anoPublicacion;

    public Publicacion() {
    }

    public Publicacion(String codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }


    @Override
    public String toString() {
        return "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion;
    }
    
    

}
