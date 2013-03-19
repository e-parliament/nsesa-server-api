package org.nsesa.server.service.api;


import org.nsesa.server.dto.DocumentDTO;

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
public interface DocumentService {
    DocumentDTO getDocument(@WebParam(name="documentID") String documentID);

    void save(DocumentDTO documentDTO);

    List<DocumentDTO> findAll();
}
