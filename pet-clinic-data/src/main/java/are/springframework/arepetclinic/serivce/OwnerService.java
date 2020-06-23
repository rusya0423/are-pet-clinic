package are.springframework.arepetclinic.serivce;

import are.springframework.arepetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);

}
