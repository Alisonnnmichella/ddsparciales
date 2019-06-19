package Hitbug;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Bag implements Cloneable{
    private Set<Bag> bagsReferenciados;
    private Set<Contenido> contenidos;
    private LinkedList <Modificacion> historial;
    private Usuario duenio;
    private Set<Usuario> colaboradores;
    public Bag(){
        bagsReferenciados=new HashSet<>();
        contenidos= new HashSet<>();
        historial= new LinkedList<>();
    }

    public void agregarColaborador(Usuario usuario){
        colaboradores.add(usuario);
    }

    public void quitarColaborador(Usuario usuario){
        colaboradores.remove(usuario);
    }

    public void agregarCambio(Modificacion hit){
        historial.add(hit);
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

}
