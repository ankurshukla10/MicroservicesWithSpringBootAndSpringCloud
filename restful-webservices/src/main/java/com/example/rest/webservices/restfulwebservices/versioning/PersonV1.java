package com.example.rest.webservices.restfulwebservices.versioning;

/****************************************************************************
 * This class models Person having property 'name'
 *
 * @author ankurshukla
 ****************************************************************************/
public class PersonV1 {
    private String name;

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
