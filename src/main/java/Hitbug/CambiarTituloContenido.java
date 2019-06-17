package Hitbug;

public class CambiarTituloContenido extends Hit{
    private Contenido contenido;
    private String titulo;
    private String tituloOriginal;

    public CambiarTituloContenido(Contenido contenido,String titulo){
        this.contenido=contenido;
        this.titulo=titulo;
        this.tituloOriginal=contenido.getTitulo();
    }
    public void ejecutar(){
        contenido.modificarTitulo(titulo);
        agregarAHistorial();
    }
    public void deshacer(){
        CambiarTituloContenido deshacer= new CambiarTituloContenido(contenido,tituloOriginal);
        deshacer.ejecutar();
    }
    public Bag getContenedor(){
        return contenido.getContenedor();
    }
}
