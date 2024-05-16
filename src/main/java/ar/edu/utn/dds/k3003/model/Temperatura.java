package ar.edu.utn.dds.k3003.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Temperatura {
    private Long id;
    private Integer heladeraId;
    private Integer temperatura;
    private LocalDateTime fecha;

    public Temperatura(Integer heladeraId, Integer temperaturaMedida, LocalDateTime fechaMedicion) {
        this.heladeraId = heladeraId;
        this.temperatura = temperaturaMedida;
        this.fecha = fechaMedicion;
    }
}
