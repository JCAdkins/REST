package com.PayRoll.Tut;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id){
        super("Could not find employee " + id);
    }
}
