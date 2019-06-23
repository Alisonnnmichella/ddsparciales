package Hitbug.Modificaciones;

import Hitbug.Bag;
import Hitbug.*;

public class QuitarContenido implements Modificacion {
    Bag bag;
    Contenido contenido;
    AgregarContenido deshacer;

    public QuitarContenido(Contenido contenido){
        this.bag= bag;
        this.contenido=contenido;
        deshacer= new AgregarContenido(contenido);
    }
    public void modificarBag(Bag bag) {
        bag.quitarContenido(contenido);
        this.bag=bag;
    }
    public void deshacer(){
       deshacer.modificarBag(bag);
    }

}
