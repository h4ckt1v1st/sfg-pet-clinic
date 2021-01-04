package in.abhisingh.sfgpetclinic.services;

import in.abhisingh.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
