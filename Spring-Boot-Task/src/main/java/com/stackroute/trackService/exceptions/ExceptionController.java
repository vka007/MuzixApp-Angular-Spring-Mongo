package com.stackroute.trackService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

//Global Exception Handler Class
@ControllerAdvice
public class ExceptionController {
    //Handling Exception of Track Not Found
    @ExceptionHandler(TrackNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody
    Errormsg handleTracknotFoundException(final TrackNotFoundException e, final HttpServletRequest request) {
        Errormsg errorClass = new Errormsg();
        errorClass.setErrormessage(e.getMessage());
        errorClass.setRequestedURI(request.getRequestURI());
        return errorClass;
    }

    //Handling Exception of Track Already Exist
    @ExceptionHandler(TrackAlreadyExistException.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    public @ResponseBody
    Errormsg handleTrackAlreadyExists(final TrackAlreadyExistException e, final HttpServletRequest request) {
        Errormsg errorClass = new Errormsg();
        errorClass.setErrormessage(e.getMessage());
        errorClass.setRequestedURI(request.getRequestURI());
        return errorClass;

    }
}