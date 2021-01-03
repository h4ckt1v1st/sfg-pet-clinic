package in.abhisingh.sfgpetclinic.services;

import in.abhisingh.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
