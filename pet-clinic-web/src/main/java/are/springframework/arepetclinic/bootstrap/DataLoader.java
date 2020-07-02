package are.springframework.arepetclinic.bootstrap;

import are.springframework.arepetclinic.model.Owner;
import are.springframework.arepetclinic.model.Vet;
import are.springframework.arepetclinic.serivce.OwnerService;
import are.springframework.arepetclinic.serivce.VetService;
import are.springframework.arepetclinic.serivce.map.OwnerServiceMap;
import are.springframework.arepetclinic.serivce.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap(); {
        }
    }

    @Override
    public void run(String... args) throws Exception {
        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("Rus");
        o1.setLastName("Assylkhan");
        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("Fara");
        o2.setLastName("Oshurbayev");
        ownerService.save(o2);

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Maha");
        v1.setLastName("Oshurbayev");
        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setId(2L);
        v2.setFirstName("Miha");
        v2.setLastName("Asen");
        vetService.save(v2);
    }
}
