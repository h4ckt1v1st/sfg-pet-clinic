package in.abhisingh.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
//    It is a hibernate recommendation to use box type rather than primitive type.
//    Since box types can be null but primitive types can't.
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
