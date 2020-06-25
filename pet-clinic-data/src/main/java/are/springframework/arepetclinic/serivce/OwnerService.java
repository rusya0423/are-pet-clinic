package are.springframework.arepetclinic.serivce;

import are.springframework.arepetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
