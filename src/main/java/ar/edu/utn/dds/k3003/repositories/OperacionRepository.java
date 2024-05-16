package ar.edu.utn.dds.k3003.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import ar.edu.utn.dds.k3003.model.Operacion;

public class OperacionRepository {
    private static AtomicLong seqId = new AtomicLong();
    private Collection<Operacion> operaciones;

    public OperacionRepository() {
        this.operaciones = new ArrayList<>();
    }

    public Operacion save(Operacion operacion) {
        if (Objects.isNull(operacion.getId())) {
            operacion.setId(seqId.incrementAndGet());;
            // this.operaciones.add(operacion);
        }
        this.operaciones.add(operacion);
        return operacion;
    }

    public Operacion findById(Long id) {
        Optional<Operacion> first = this.operaciones.stream().filter(x -> x.getId().equals(id)).findFirst();
        return first.orElseThrow(() -> new NoSuchElementException(
            String.format("No hay una operacion de id: %s", id)
        ));
    }
}
