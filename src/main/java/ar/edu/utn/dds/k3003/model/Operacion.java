package ar.edu.utn.dds.k3003.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operacion {
    private Long id;
    private Integer heladeraId;
    private String qrVianda;
    private LocalDateTime fecha;

    public Operacion(Integer heladeraId, String qrVianda) {
        this.heladeraId = heladeraId;
        this.qrVianda = qrVianda;
        this.fecha = LocalDateTime.now();
    }
}
