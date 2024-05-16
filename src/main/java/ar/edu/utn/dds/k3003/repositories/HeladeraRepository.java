package ar.edu.utn.dds.k3003.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import ar.edu.utn.dds.k3003.model.Heladera;

public class HeladeraRepository {
    private static AtomicInteger seqId = new AtomicInteger();
    private Collection<Heladera > heladeras;

    public HeladeraRepository() {
        this.heladeras = new ArrayList<>();
    }
    
    public Heladera save(Heladera heladera) {
        if (Objects.isNull(heladera.getId())) {
            heladera.setId(seqId.incrementAndGet());;
        }
        this.heladeras.add(heladera);
        return heladera;
    }

    public Heladera findById(Integer id) {
        Optional<Heladera> first = this.heladeras.stream().filter(x -> x.getId().equals(id)).findFirst();
        return first.orElseThrow(() -> new NoSuchElementException(
            String.format("No hay una heladera de id: %s", id)
        ));
    }
}
