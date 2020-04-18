/*
 * (c) Copyright ThinkAnalytics Ltd 2020. All rights reserved. No part of
 * this program may be photocopied reproduced or translated to another
 * program language without prior written consent of ThinkAnalytics Ltd.
 */
package com.example.rest.webservices.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/****************************************************************************
 * This class handles Delete Exceptions
 *
 * @author ankurshukla
 ****************************************************************************/
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CannotDeleteException extends Throwable {
    public CannotDeleteException(String message) {
        super(message);
    }
}
