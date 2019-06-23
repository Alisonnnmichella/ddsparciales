package Hitbug;

import Hitbug.Excepciones.BagException;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Bag{
    private Set<Bag> bagsReferenciados;
    private Set<Contenido> contenidos;
    private LinkedList <Hit> historial;
    private Usuario duenio;
    private Set<Usuario> colaboradores;
    public Bag(Usuario duenio){
        this.duenio=duenio;
        bagsReferenciados=new HashSet<>();
        contenidos= new HashSet<>();
        historial= new LinkedList<>();
    }

    public void agregarColaborador(Usuario usuario,Usuario duenio){
        verificoPermisosDeDuenio(duenio);
        colaboradores.add(usuario);
    }

    public void quitarColaborador(Usuario usuario,Usuario duenio){
        verificoPermisosDeDuenio(duenio);
        colaboradores.remove(usuario);
    }

    public void agregarCambio(Hit hit){
        historial.add(hit);
    }
    public void quitarCambio(Hit hit){historial.remove(hit);}
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

    public boolean tieneContenido(Contenido contenido){
        return contenidos.stream().anyMatch(contenidoPropio->contenidoPropio==contenido);
    }
    public boolean puedeEditar(Usuario usuario){
        if(duenio==usuario)
            return true;
        return colaboradores.stream().anyMatch(user->user==usuario);
    }
    public void volverNBags(int cantidadDeBags){
        if(cantidadDeBags>historial.size())
            throw new BagException("La cantidad de hits que desea regresar es mayor a los hits" +
                    "realizados actualmente");


    }
    public boolean perteneceElHit(Hit hit){
        return historial.stream().anyMatch(hitspropios->hitspropios==hit);
    }
    public void verificoPermisosDeDuenio(Usuario usuario){
        if(usuario!=duenio)
            throw new BagException("No posee los permisos suficientes");
    }

}
