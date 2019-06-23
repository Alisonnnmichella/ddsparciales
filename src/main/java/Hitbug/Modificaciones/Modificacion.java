package Hitbug.Modificaciones;

import Hitbug.Bag;

public interface Modificacion {
        void modificarBag(Bag bag);
        void deshacer();
        //boolean sePuedeEjecutar();
    }
