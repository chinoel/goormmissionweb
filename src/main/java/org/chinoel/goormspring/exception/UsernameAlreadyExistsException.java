package org.chinoel.goormspring.exception;

public class UsernameAlreadyExistsException extends IllegalArgumentException{
    public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}