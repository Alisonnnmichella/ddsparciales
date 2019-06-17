package Hitbug;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    Set<Bag> bags;

    public Usuario() {
        bags=new HashSet<Bag>();
    }
    public void crearBag(){
        bags.add(new Bag());
    }
    public void añadirColaborador(Bag bag,Usuario usuario){
        bag.agregarColaborador(usuario);
    }
    public void removerColaborador(Bag bag,Usuario usuario){
        bag.quitarColaborador(usuario);
    }
    public void ejecutarHit(Hit hit){
        hit.ejecutar();
    }
}

