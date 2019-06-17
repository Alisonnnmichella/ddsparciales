package Hitbug;

public class Contenido {
  private String titulo;
  private String descripcion;
  private Bag contenedor;
   public Contenido(Bag contenedor,String titulo, String descripcion) {
      this.contenedor=contenedor;
      this.titulo = titulo;
      this.descripcion = descripcion;
   }

   public String getDescripcion(){
      return descripcion;
   }
   public String getTitulo(){
      return titulo;
   }
   public Bag getContenedor(){
      return contenedor;
   }
   public  void modificarTitulo(String titulo){
      this.titulo=titulo;
   }
   public void modificarDescripcion(String descripcion){
      this.descripcion=descripcion;
   }

}
