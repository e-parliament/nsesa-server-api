package org.nsesa.server.service.api;


import org.nsesa.server.dto.PersonDTO;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Date: 11/03/13 15:38
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebService
public interface PersonService {

    PersonDTO getPerson(@WebParam(name = "personID") String personID);

    PersonDTO getPersonByUsername(@WebParam(name = "username") String username);

    void save(@WebParam(name = "personDTO") PersonDTO personDTO);
}
