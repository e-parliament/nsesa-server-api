package org.nsesa.server.service.api;


import org.nsesa.server.dto.AmendmentContainerDTO;
import org.nsesa.server.exception.ResourceNotFoundException;
import org.nsesa.server.exception.StaleResourceException;
import org.nsesa.server.exception.ValidationException;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Date: 11/03/13 15:38
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebService
public interface AmendmentService {

    AmendmentContainerDTO getAmendmentContainer(@WebParam(name = "amendmentContainerID") String amendmentContainerID);

    AmendmentContainerDTO getAmendmentContainerVersion(@WebParam(name = "revisionID") String revisionID);

    List<AmendmentContainerDTO> getAmendmentContainersByDocumentAndPerson(
            @WebParam(name = "documentID") String documentID,
            @WebParam(name = "personID") String personID);

    List<AmendmentContainerDTO> getAmendmentContainersByDocument(@WebParam(name = "documentID") String documentID);

    List<String> getAmendmentContainerVersions(@WebParam(name = "amendmentContainerID") String amendmentContainerID);

    AmendmentContainerDTO save(@WebParam(name = "amendmentContainer") AmendmentContainerDTO amendmentContainer)
            throws StaleResourceException, ResourceNotFoundException, ValidationException;

    void delete(final @WebParam(name = "amendmentContainerID") String amendmentContainerID);
}
