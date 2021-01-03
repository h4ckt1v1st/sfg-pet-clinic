package in.abhisingh.sfgpetclinic.services;

import in.abhisingh.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
