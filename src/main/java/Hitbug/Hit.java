package Hitbug;

public abstract class Hit {
    public abstract void ejecutar();
    public abstract void deshacer();
    public abstract Bag getContenedor();
    public void verificaPermisos(Usuario usuario){
        if(getContenedor().puedeEditar(usuario))
            throw new UsuarioException("No tiene los permisos para editar el contenido");
    }
    public void agregarAHistorial(){
        getContenedor().agregarHit(this);
    }
}
