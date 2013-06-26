package org.nsesa.server.service.api;


import org.nsesa.server.dto.DocumentContentDTO;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * General service interface for {@link DocumentContentDTO}s.
 * Date: 11/03/13 15:38
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebService
public interface DocumentContentService {

    /**
     * Retrieve a single {@link DocumentContentDTO} via its <tt>documentID</tt>.
     *
     * @param documentID the public document ID
     * @return the document content DTO, or <tt>null</tt> if it cannot be found
     */
    DocumentContentDTO getDocumentContent(@WebParam(name = "documentID") String documentID);

    /**
     * Save the given <tt>documentContentDTO</tt> to the backend.
     *
     * @param documentContentDTO the document content DTO
     */
    void saveDocumentContent(@WebParam(name = "documentContentDTO") DocumentContentDTO documentContentDTO);

    /**
     * List all the document content via paging.
     *
     * @param offset the paging offset
     * @param rows   the number of document content objects to return
     * @return the list of document contents
     */
    List<DocumentContentDTO> list(@WebParam(name = "offset") int offset, @WebParam(name = "rows") int rows);

    /**
     * Get an XML fragment identified by <tt>xpathExpression</tt>.
     *
     * @param documentID      the document ID
     * @param xpathExpression the xpath expression
     * @return the fragment as XML string, or <tt>null</tt> if it cannot be found.
     */
    String getDocumentFragment(@WebParam(name = "documentID") String documentID, @WebParam(name = "xpathExpression") String xpathExpression);
}
