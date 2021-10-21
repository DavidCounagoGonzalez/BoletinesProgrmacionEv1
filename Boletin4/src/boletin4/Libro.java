
package boletin4;

public class Libro {
    
    private String titulo;
    private String autor;
    private int año;
    private short numPaginas;
    private float valoracion;
    
    //Constructores
    public Libro(){
    }
    
    public Libro(String tit, String aut, int a, short nump){
        titulo = tit;
        autor = aut;
        año = a;
        numPaginas = nump;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor (String autor){
    this.autor = autor;
    }
        
    public int getAño(){
        return año;
    }  
    
    public void setAño (int año){
        this.año = año;
    }
    
    public short getNump(){
        return numPaginas;
    }
    public void setNump(short numPaginas){
        this.numPaginas = numPaginas;
    }  
   
    public void amosar(){
        System.out.println("Titulo: "+titulo+"\n autor: "+ autor + "\n año: "+ año + "\n Número de Páginas: "+ numPaginas);
    }
    
    
}
