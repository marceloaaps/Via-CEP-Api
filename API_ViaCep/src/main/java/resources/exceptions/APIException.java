package resources.exceptions;

import java.io.IOException;
import java.io.Serializable;

public class APIException extends RuntimeException {

    public APIException (String message){
        super(message);
    }


}
