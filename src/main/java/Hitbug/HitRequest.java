package Hitbug;

public class HitRequest {
    private Modificacion hit;
    private EstadoHitRequest estado;
    public HitRequest(Modificacion hit){
        this.hit=hit;
        this.estado=EstadoHitRequest.PENDIENTE;
    }
    public void aprobar(){
        verificoCambioDeEstado(EstadoHitRequest.APROBADO);
        hit.ejecutar();
        estado=EstadoHitRequest.APROBADO;
    }
    public void rechazar(){
        estado=EstadoHitRequest.RECHAZADO;
    }
    public void verificoCambioDeEstado(EstadoHitRequest estate){
       if(estado==estate)
           throw new HitRequestException("No se le puede setear el mismo estado en el que se encuentra el " +
                   "hitRequest!");
    }
}
