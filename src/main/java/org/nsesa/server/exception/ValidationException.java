package org.nsesa.server.exception;

import javax.xml.ws.WebFault;
import java.io.Serializable;

/**
 * Date: 13/05/13 11:28
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebFault(name = "ValidationException")
public class ValidationException extends Exception implements Serializable {
    public ValidationException() {
    }

    public ValidationException(String s) {
        super(s);
    }

    public ValidationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ValidationException(Throwable throwable) {
        super(throwable);
    }
}
