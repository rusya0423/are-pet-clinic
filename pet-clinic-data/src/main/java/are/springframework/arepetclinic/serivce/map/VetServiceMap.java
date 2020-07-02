package are.springframework.arepetclinic.serivce.map;

import are.springframework.arepetclinic.model.Vet;
import are.springframework.arepetclinic.serivce.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {
       return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
       return super.findById(id);
    }
}
