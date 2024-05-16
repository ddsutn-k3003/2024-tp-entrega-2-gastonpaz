package ar.edu.utn.dds.k3003.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Heladera {
    private Integer id;
    private String nombre;
    private Double longitud;
    private Double latitud;
    private String direccion;
    private Integer ocupacion; // cantidad de viandas que hay en la heladera
    private Integer capacidad; // cantidad de viandas maxima de la heladera
    private Integer temperaturaMaxima;
    private Integer temperaturaMinima;
    private Integer temperaturaActual;
    private LocalDateTime fechaCreacion;
    private Boolean activa;

    public Heladera (String nombre) {
        this.nombre = nombre;
        this.ocupacion = 0;
        this.fechaCreacion = LocalDateTime.now();
        this.activa = true;
    }

    public Heladera(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.ocupacion = 0;
        this.fechaCreacion = LocalDateTime.now();
        this.activa = true;
    }
}
