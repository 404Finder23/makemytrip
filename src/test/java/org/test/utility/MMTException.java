package org.test.utility;

public class MMTException extends Exception{
    public <T>MMTException(T message){
        super("Exception related to value :: "
                +message.toString()+" of type "
                +message.getClass().getName());
    }
}
