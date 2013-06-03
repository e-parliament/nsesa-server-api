package org.nsesa.server.exception;

import javax.xml.ws.WebFault;
import java.io.Serializable;

/**
 * Date: 13/05/13 11:28
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebFault(name = "ResourceNotFoundException")
public class ResourceNotFoundException extends Exception implements Serializable {
    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }

    public ResourceNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ResourceNotFoundException(Throwable throwable) {
        super(throwable);
    }
}
