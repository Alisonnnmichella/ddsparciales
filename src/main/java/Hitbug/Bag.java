package Hitbug;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Bag {
    private LinkedList<Bag> bagsReferenciados;
    private Set<Contenido> contenidos;
    private Set <Hit> hits;
    private Set<HitRequest> hitRequests;
    private Usuario duenio;
    private Set<Usuario> colaboradores;
    public Bag(){
        bagsReferenciados=new LinkedList<>();
        contenidos= new HashSet<>();
    }

    public void agregarColaborador(Usuario usuario){
        colaboradores.add(usuario);
    }

    public void quitarColaborador(Usuario usuario){
        colaboradores.remove(usuario);
    }

    public void agregarHit(Hit hit){
        hits.add(hit);
    }

    public void agregarBagReferenciado(Bag bag){
        bagsReferenciados.add(bag);
    }

    public void quitarReferenciado(Bag bag){
        bagsReferenciados.remove(bag);
    }

    public void agregarContenido(Contenido contenido){
        contenidos.add(contenido);
    }

    public void quitarContenido(Contenido contenido){
        contenidos.remove(contenido);
    }

    public boolean puedeEditar(final Usuario usuario){
        if(duenio==usuario)
            return true;
        return colaboradores.stream().anyMatch(user->user==usuario);
    }

}
