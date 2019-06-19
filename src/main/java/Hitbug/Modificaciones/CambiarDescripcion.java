package Hitbug.Modificaciones;

import Hitbug.Bag;
import Hitbug.Contenido;
import Hitbug.Excepciones.HitRequestException;

public class CambiarDescripcion implements Modificacion {
    private Contenido contenido;
    private String descripcion;
    private CambiarDescripcion deshacer;
    private Bag bag;

    public CambiarDescripcion(Contenido contenido,String descripcion){
        this.contenido=contenido;
        this.descripcion=descripcion;
        deshacer= new CambiarDescripcion(contenido,contenido.getDescripcion());
    }
    public void modificarBag(Bag bag){
        elContenidoPerteneceALBag(bag);
        this.bag=bag;
        contenido.modificarDescripcion(descripcion);

    }
    public void deshacer(){
        deshacer.modificarBag(bag);
    }

    private void elContenidoPerteneceALBag(Bag bag){
     if(!bag.getContenidos().stream().anyMatch(conten->conten==contenido))
         throw new HitRequestException("El contenido que desea modificar no pertenece al bag");
    }



    }


