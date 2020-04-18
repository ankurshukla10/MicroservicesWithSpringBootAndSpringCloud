package com.example.rest.webservices.restfulwebservices.exception;

import java.util.Date;

/****************************************************************************
 * This is the template for all the exceptions thrown from this application
 *
 * @author ankurshukla
 ****************************************************************************/
public class CustomExceptionModeller {
    private Date dateTimeStamp;
    private String message;
    private String details;

    public CustomExceptionModeller(Date dateTimeStamp, String message, String details) {
        this.dateTimeStamp = dateTimeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getDateTimeStamp() {
        return dateTimeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
