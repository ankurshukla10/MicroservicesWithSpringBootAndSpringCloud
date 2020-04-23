package com.example.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/****************************************************************************
 * This class explains different ways versioning can be achieved.
 *
 * @author ankurshukla
 ****************************************************************************/
@RestController
public class PersonVersioningController {

    // By creating distinct URI
    @GetMapping("/v1/person")
    public PersonV1 personV1(){
      return  new PersonV1("Ankur Shukla");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Ankur", "Shukla"));
    }

    // By using params
    @GetMapping(value = "/person/params", params = "version=1")
    public PersonV1 personParamsV1(){
        return  new PersonV1("Ankur Shukla");
    }

    @GetMapping(value = "/person/params", params = "version=2")
    public PersonV2 personParamsV2(){
        return new PersonV2(new Name("Ankur", "Shukla"));
    }

    //By using headers
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 personHeadersV1(){
        return  new PersonV1("Ankur Shukla");
    }

    @GetMapping(value = "/person/header", headers ="X-API-VERSION=2" )
    public PersonV2 personHeadersV2(){
        return new PersonV2(new Name("Ankur", "Shukla"));
    }

    //By using produces
    @GetMapping(value = "/person/header", produces = "application/v1json")
    public PersonV1 personProducesV1(){
        return  new PersonV1("Ankur Shukla");
    }

    @GetMapping(value = "/person/header", produces = "application/v2json" )
    public PersonV2 personProducesV2(){
        return new PersonV2(new Name("Ankur", "Shukla"));
    }


}
