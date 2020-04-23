package com.example.rest.webservices.restfulwebservices.versioning;

/****************************************************************************
 * This class models Person dependent on Name.
 *
 * @author ankurshukla
 ****************************************************************************/
public class PersonV2 {
    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
