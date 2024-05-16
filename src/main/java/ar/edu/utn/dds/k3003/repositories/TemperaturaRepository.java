package ar.edu.utn.dds.k3003.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

import ar.edu.utn.dds.k3003.model.Temperatura;

public class TemperaturaRepository {
    private static AtomicLong seqId = new AtomicLong();
    private Collection<Temperatura> temperaturas;

    public TemperaturaRepository() {
        this.temperaturas = new ArrayList<>();
    }

    public Temperatura save(Temperatura temperatura) {
        if (Objects.isNull(temperatura.getId())) {
            temperatura.setId(seqId.incrementAndGet());;
            this.temperaturas.add(temperatura);
        }
        return temperatura;
    }

    public Collection<Temperatura> findByheladeraId(Integer heladeraId) {
        return this.temperaturas.stream().filter(x -> x.getHeladeraId().equals(heladeraId))
                                            .sorted(Comparator.comparing(Temperatura::getFecha).reversed())
                                            .toList();
    }
}
