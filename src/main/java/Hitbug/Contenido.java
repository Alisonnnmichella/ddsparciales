package Hitbug;

public class Contenido {
  private String titulo;
  private String descripcion;

   public Contenido(String titulo, String descripcion) {

      this.titulo = titulo;
      this.descripcion = descripcion;
   }

   public String getDescripcion(){
      return descripcion;
   }
   public String getTitulo(){
      return titulo;
   }

   public  void modificarTitulo(String titulo){
      this.titulo=titulo;
   }
   public void modificarDescripcion(String descripcion){
      this.descripcion=descripcion;
   }

}
