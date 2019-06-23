package Hitbug.Modificaciones;
import Hitbug.*;
import Hitbug.Excepciones.HitRequestException;

public class CambiarTituloContenido implements Modificacion {
    private Contenido contenido;
    private CambiarTituloContenido deshacer;
    private String titulo;
    private Bag bag;
    public CambiarTituloContenido(Contenido contenido,String titulo){
        this.contenido=contenido;
        this.titulo=titulo;
        deshacer= new CambiarTituloContenido(contenido,contenido.getTitulo());
    }
    public void modificarBag(Bag bag){
        elContenidoPerteneceALBag(bag);
        this.bag=bag;
        contenido.modificarTitulo(titulo);

    }
    public void deshacer(){
        deshacer.modificarBag(bag);
    }
    private void elContenidoPerteneceALBag(Bag bag){
        if(!bag.tieneContenido(contenido))
            throw new HitRequestException("El contenido que desea modificar no pertenece al bag");
    }

}
