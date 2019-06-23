package Hitbug;

import Hitbug.Excepciones.HitRequestException;
import Hitbug.Modificaciones.Modificacion;

public class HitRequest {
    private Hit hit;
    private EstadoHitRequest estado;
    public HitRequest(Hit hit){
        this.hit=hit;
        this.estado=EstadoHitRequest.PENDIENTE;
    }
    public void aprobar(Usuario usuario){
        verificoCambioDeEstado(EstadoHitRequest.APROBADO);
        hit.ejecutar(usuario);
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
