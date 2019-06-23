package Hitbug;

import Hitbug.Excepciones.HitException;
import Hitbug.Modificaciones.Modificacion;

import java.util.LinkedList;

public class Hit {
    LinkedList<Modificacion> modificaciones;
    Bag bag;
    public Hit(Bag bag,LinkedList<Modificacion>modificaciones){
        this.modificaciones=modificaciones;
        this.bag=bag;
    }
    public void ejecutar(Usuario usuario)
    {   verificoPermisosDeUsuario(usuario);
        modificaciones.forEach(modificacion -> modificacion.modificarBag(bag));
        bag.agregarCambio(this);
    }
    public void deshacer(Usuario usuario){
        verificoPermisosDeUsuario(usuario);
        verifacionEjecucionAnteriorDelHit();
        modificaciones.forEach(modificacion -> modificacion.deshacer());
        bag.quitarCambio(this);
    }
    private void verifacionEjecucionAnteriorDelHit(){
        if(!bag.perteneceElHit(this))
            throw new HitException("No puede deshacer un hit que jamas se ejecuto!");
    }
    private void verificoPermisosDeUsuario(Usuario usuario){
        bag.puedeEditar(usuario);
    }
}
