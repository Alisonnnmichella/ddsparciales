package Hitbug;

public class CambiarDescripcion extends Hit{
    private Contenido contenido;
    private String titulo;
    private String descripcionOriginal;

    public CambiarDescripcion(Contenido contenido,String titulo){
        this.contenido=contenido;
        this.titulo=titulo;
        this.descripcionOriginal=contenido.getDescripcion();
    }
    public void ejecutar(){
        contenido.modificarTitulo(titulo);
        agregarAHistorial();
    }
    public void deshacer(){
        CambiarTituloContenido deshacer= new CambiarTituloContenido(contenido,descripcionOriginal);
        deshacer.ejecutar();
    }
    public Bag getContenedor(){
        return contenido.getContenedor();
    }
}

