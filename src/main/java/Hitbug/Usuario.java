package Hitbug;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    Set<Bag> bagsPropios;
    private Set<HitRequest> hitRequests;

    public Usuario() {
        bagsPropios=new HashSet<Bag>();
    }

    public void crearBag(){
        bagsPropios.add(new Bag());
    }

    public void verificarPermisosDuenio(Bag bag){
        if(!bagsPropios.stream().anyMatch(b->b==bag))
            throw new UsuarioException("No tiene los permisos necesarios!");
    }

    public void añadirColaborador(Bag bag,Usuario usuario){
        verificarPermisosDuenio(bag);
        bag.agregarColaborador(usuario);
    }

    public void removerColaborador(Bag bag,Usuario usuario){
        verificarPermisosDuenio(bag);
        bag.quitarColaborador(usuario);
    }

    public void ejecutarHit(Modificacion hit){
        hit.ejecutar();
    }

    public void agregarHitRequest(HitRequest hitRequest){
        hitRequests.add(hitRequest);
    }
    public void aprobarHitRequest(HitRequest hitRequest){
        hitRequest.aprobar();
    }
    public void rechazarHitRequest(HitRequest hitRequest){
        hitRequest.rechazar();
    }
    public void verBagEnHit(Bag bag, Modificacion hit){

    }
}

