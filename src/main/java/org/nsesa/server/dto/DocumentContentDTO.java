/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.server.dto;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

import java.io.Serializable;
import java.util.Calendar;

/**
 * A Data Transfer Object (DTO) for a non-logical document (eg. translation).
 * Date: 26/06/12 19:15
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Dto
public class DocumentContentDTO implements Serializable {

    /**
     * The primary key identifier for this particular document translation.
     */
    @DtoField
    private String documentID;

    /**
     * The name of the document.
     */
    @DtoField
    private String content;

    public DocumentContentDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentContentDTO that = (DocumentContentDTO) o;

        if (!content.equals(that.content)) return false;
        if (!documentID.equals(that.documentID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = documentID.hashCode();
        result = 31 * result + content.hashCode();
        return result;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
