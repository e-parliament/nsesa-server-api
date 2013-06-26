package org.nsesa.server.service.api;


import org.nsesa.server.dto.AmendmentContainerDTO;
import org.nsesa.server.dto.RevisionDTO;
import org.nsesa.server.exception.ResourceNotFoundException;
import org.nsesa.server.exception.StaleResourceException;
import org.nsesa.server.exception.ValidationException;

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
public interface AmendmentService {

    AmendmentContainerDTO getAmendmentContainer(@WebParam(name = "amendmentContainerID") String amendmentContainerID) throws ResourceNotFoundException;

    AmendmentContainerDTO getAmendmentContainerVersion(@WebParam(name = "revisionID") String revisionID) throws ResourceNotFoundException;

    List<AmendmentContainerDTO> getAmendmentContainersByDocumentAndPerson(
            @WebParam(name = "documentID") String documentID,
            @WebParam(name = "personID") String personID) throws ResourceNotFoundException;

    List<AmendmentContainerDTO> getAmendmentContainersByDocument(@WebParam(name = "documentID") String documentID) throws ResourceNotFoundException;

    List<RevisionDTO> getAmendmentContainerVersions(@WebParam(name = "amendmentContainerID") String amendmentContainerID);

    AmendmentContainerDTO save(@WebParam(name = "amendmentContainer") AmendmentContainerDTO amendmentContainer)
            throws StaleResourceException, ResourceNotFoundException, ValidationException;

    void delete(@WebParam(name = "amendmentContainerID") String amendmentContainerID);

    String updateStatus(@WebParam(name = "revisionID") String revisionID, @WebParam(name = "newStatus") String newStatus) throws StaleResourceException, ResourceNotFoundException;
}
