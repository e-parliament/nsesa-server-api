package org.nsesa.server.service.api;


import org.nsesa.server.dto.DocumentContentDTO;

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
public interface DocumentContentService {

    DocumentContentDTO getDocumentContent(@WebParam(name = "documentID") String documentID);

    void saveDocumentContent(@WebParam(name = "documentContentDTO") DocumentContentDTO documentContentDTO);

    List<DocumentContentDTO> list(@WebParam(name = "offset") int offset, @WebParam(name = "rows") int rows);
}
