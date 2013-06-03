package org.nsesa.server.exception;

import javax.xml.ws.WebFault;
import java.io.Serializable;

/**
 * Date: 13/05/13 11:28
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebFault(name = "StaleResourceException")
public class StaleResourceException extends Exception implements Serializable {
    public StaleResourceException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public StaleResourceException(String s) {
        super(s);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public StaleResourceException(String s, Throwable throwable) {
        super(s, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public StaleResourceException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
