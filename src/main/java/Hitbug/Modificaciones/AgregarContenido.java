package Hitbug.Modificaciones;

import Hitbug.*;

public class AgregarContenido implements Modificacion {
    Bag bag;
    Contenido contenido;
    public AgregarContenido(Contenido contenido){
        this.contenido=contenido;
    }
    public void modificarBag(Bag bag) {
        bag.agregarContenido(contenido);
        }
    public void deshacer(){
        QuitarContenido deshacer=new QuitarContenido(contenido);
        deshacer.modificarBag(bag);
    }
    public Bag getContenedor(){
        return bag;
    }
}
