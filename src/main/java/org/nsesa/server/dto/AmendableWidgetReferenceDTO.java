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

/**
 * A reference to find the correct
 * widget to amend, and used when passing information when creating a new element.
 * <p/>
 * Date: 10/07/12 22:34
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Dto
public class AmendableWidgetReferenceDTO implements Serializable {

    @DtoField
    private String referenceID;

    /**
     * Boolean flag to see if the reference requires the creation of a new element before injecting
     */
    @DtoField
    private boolean creation;

    /**
     * Boolean flag to see if the this reference is a sibling rather than a child, in case of a <tt>creation</tt>
     */
    @DtoField
    private boolean sibling;
    /**
     * The namespace URI, if any.
     */
    @DtoField
    private String namespaceURI;

    /**
     * The path to the matching node (usually XPath-like).
     */
    @DtoField
    private String path;

    /**
     * The type name of the widget to create.
     */
    @DtoField
    private String type;

    /**
     * The offset at which to create this widget under the parent.
     */
    @DtoField
    private Integer offset;

    public AmendableWidgetReferenceDTO() {
    }

    public AmendableWidgetReferenceDTO(String path) {
        this.path = path;
    }

    public AmendableWidgetReferenceDTO(String path, String namespaceURI) {
        this.path = path;
        this.namespaceURI = namespaceURI;
    }

    public AmendableWidgetReferenceDTO(boolean creation, boolean sibling, String path, String type, int offset) {
        this.creation = creation;
        this.sibling = sibling;
        this.path = path;
        this.type = type;
        this.offset = offset;
    }

    public AmendableWidgetReferenceDTO(boolean creation, boolean sibling, String namespaceURI, String path, String type, int offset) {
        this.creation = creation;
        this.sibling = sibling;
        this.namespaceURI = namespaceURI;
        this.path = path;
        this.type = type;
        this.offset = offset;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isCreation() {
        return creation;
    }

    public void setCreation(boolean creation) {
        this.creation = creation;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public boolean isSibling() {
        return sibling;
    }

    public void setSibling(boolean sibling) {
        this.sibling = sibling;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNamespaceURI() {
        return namespaceURI;
    }

    public void setNamespaceURI(String namespaceURI) {
        this.namespaceURI = namespaceURI;
    }

    public String getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }
}
