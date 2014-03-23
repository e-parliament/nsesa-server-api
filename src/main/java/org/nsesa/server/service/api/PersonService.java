package org.nsesa.server.service.api;


import org.nsesa.server.dto.GroupDTO;
import org.nsesa.server.dto.PersonDTO;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Date: 11/03/13 15:38
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebService
public interface PersonService {

    PersonDTO getPerson(@WebParam(name = "personID") String personID);

    PersonDTO getPersonByUsername(@WebParam(name = "username") String username);

    List<PersonDTO> getPersons(@WebParam(name = "personQuery") String personQuery, int start, int limit);

    void save(@WebParam(name = "personDTO") PersonDTO personDTO);

    List<GroupDTO> getGroups(@WebParam(name = "personID") String personID);
}
