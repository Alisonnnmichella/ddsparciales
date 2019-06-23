package Hitbug;

import Hitbug.Modificaciones.Modificacion;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    Set<Bag> bagsPropios;
    private Set<HitRequest> hitRequests;

    public Usuario() {
        bagsPropios=new HashSet<Bag>();
    }
    public void crearBag(){
        bagsPropios.add(new Bag(this));
    }



    public void añadirColaborador(Bag bag,Usuario usuario){
        bag.agregarColaborador(usuario,this);
    }

    public void removerColaborador(Bag bag,Usuario usuario){
        bag.quitarColaborador(usuario,this);
    }

    public void ejecutarHit(Hit hit){
        hit.ejecutar(this);
    }

    public void agregarHitRequest(HitRequest hitRequest){
        hitRequests.add(hitRequest);
    }

    public void aprobarHitRequest(HitRequest hitRequest){
        hitRequest.aprobar(this);
    }

    public void rechazarHitRequest(HitRequest hitRequest){
        hitRequest.rechazar();
    }

    public void verBagEnHit(Bag bag, Modificacion hit){

    }
}

