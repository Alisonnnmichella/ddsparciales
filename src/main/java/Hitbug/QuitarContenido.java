package Hitbug;

public class QuitarContenido extends Hit{
    Bag bag;
    Contenido contenido;
    public QuitarContenido(Bag bag,Contenido contenido){
        this.bag= bag;
        this.contenido=contenido;
    }
    public void ejecutar() {
        bag.quitarContenido(contenido);
        agregarAHistorial();
    }
    public void deshacer(){
        AgregarContenido deshacer=new AgregarContenido(bag,contenido);
        deshacer.ejecutar();
    }
    public Bag getContenedor(){
        return bag;
    }
}
