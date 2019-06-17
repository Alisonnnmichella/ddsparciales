package Hitbug;

public class HitRequest {
    private Hit hit;
    private EstadoHitRequest estado;
    public HitRequest(Hit hit){
        this.hit=hit;
        this.estado=EstadoHitRequest.PENDIENTE;
    }
    public void aprobar(){
        hit.ejecutar();
    }



}
