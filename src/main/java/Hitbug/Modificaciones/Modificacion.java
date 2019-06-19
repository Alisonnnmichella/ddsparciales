package Hitbug;

public abstract class Modificacion {
    public abstract void ejecutar();
    public abstract void deshacer();
    public abstract Bag getContenedor();
    
    public void verificaPermisos(Usuario usuario){
        if(getContenedor().puedeEditar(usuario))
            throw new UsuarioException("No tiene los permisos para editar el contenido");
    }
    public void agregarAHistorial(){
        getContenedor().agregarCambio(this);
    }
}
