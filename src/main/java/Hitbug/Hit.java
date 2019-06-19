package Hitbug;

import java.util.LinkedList;

public class Hit {
    LinkedList<Modificacion> modificaciones;
    public Hit(){
        modificaciones= new LinkedList<>();
    }
    void agregarModificacion(Modificacion modificacion){
        modificaciones.add(modificacion);
    }

}
