package Hitbug;

public class AgregarContenido extends Hit{
    Bag bag;
    Contenido contenido;
    public AgregarContenido(Bag bag,Contenido contenido){
        this.bag= bag;
        this.contenido=contenido;
    }
    public void ejecutar() {
        bag.agregarContenido(contenido);
        agregarAHistorial();
    }
    public void deshacer(){
        QuitarContenido deshacer=new QuitarContenido(bag,contenido);
        deshacer.ejecutar();
    }
    public Bag getContenedor(){
        return bag;
    }
}
