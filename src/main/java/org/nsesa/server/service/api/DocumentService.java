package org.nsesa.server.service.api;


import org.nsesa.server.dto.DocumentDTO;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * General service for {@link DocumentDTO}s.
 * Date: 11/03/13 15:38
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@WebService
public interface DocumentService {

    /**
     * Get a document via its <tt>documentID</tt>.
     *
     * @param documentID the public document ID
     * @return the documentDTO, or <tt>null</tt> if it cannot be found.
     */
    DocumentDTO getDocument(@WebParam(name = "documentID") String documentID);

    /**
     * Save a document DTO. This does normally not create a new revision.
     *
     * @param documentDTO the document DTO
     * @return the new document DTO
     */
    DocumentDTO saveDocument(@WebParam(name = "documentDTO") DocumentDTO documentDTO);

    /**
     * Lists all documents in the backend. Paging available via <tt>offset</tt> and <tt>rows</tt>.
     *
     * @param offset the paging offset
     * @param rows   the number of documents to return
     * @return the list of documents
     */
    List<DocumentDTO> list(@WebParam(name = "offset") int offset, @WebParam(name = "rows") int rows);

    /**
     * Returns all available translations for a given document identified by <tt>documentID</tt>.
     *
     * @param documentID the document ID
     * @return the list of available translations
     */
    List<DocumentDTO> getAvailableTranslations(@WebParam(name = "documentID") String documentID);

    /**
     * Returns all available related documents for a given document identified by <tt>documentID</tt>.
     *
     * @param documentID the document ID
     * @return the list of related documents
     */
    List<DocumentDTO> getRelatedDocuments(@WebParam(name = "documentID") String documentID);
}
