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
import com.inspiresoftware.lib.dto.geda.annotations.DtoVirtualField;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * A Data Transfer Object (DTO) for an Amendment entity.
 * Date: 24/06/12 21:51
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Dto
public class AmendmentContainerDTO implements Serializable {

    /**
     * A reference to the person ID this amendment was made on.
     */
    @DtoVirtualField(converter = "personIDConvertor")
    private String personID;

    /**
     * A reference to the document ID this amendment was made on.
     */
    @DtoVirtualField(converter = "documentIDConvertor")
    private String documentID;

    /**
     * The primary key that identifies a logical amendment container.
     */
    @DtoField
    private String amendmentContainerID;

    /**
     * A ordered set of reference to the bundled amendment containers.
     */
    @DtoVirtualField(converter = "bundledAmendmentContainerConvertor")
    private String[] bundledAmendmentContainerIDs;

    /**
     * A revision key that uniquely identifies this version.
     */
    @DtoField
    private String revisionID;

    /**
     * The two letter ISO code of the (primary) language this amendment is created in.
     */
    @DtoField
    private String languageISO;

    /**
     * The type of action of this amendment (modification, deletion, creation, move, ...)
     */
    @DtoVirtualField(converter = "amendmentActionConvertor")
    private AmendmentAction amendmentAction;

    /**
     * The status of an amendment. The initial status of an amendment is 'candidate'. Left as a String for
     * easier extension.
     */
    @DtoField
    private String amendmentContainerStatus = "candidate";

    /**
     * The serialized body/payload of this amendment. Can be XML or JSON, depending on what your backend provides.
     */
    @DtoField
    private String body;

    /**
     * A reference to the source of this this amendment (meaning, the place where the amendment should be injected upon)
     */
    @DtoVirtualField(converter = "amendableWidgetReferenceConvertor")
    private AmendableWidgetReferenceDTO sourceReference;

    /**
     * A list of one or more target references - which will be impacted by this amendment. For example, if an amendment
     * is made on a &lt;DEFINITION&gt; element, the target references would be every widget where the redefined
     * element is used.
     * <p/>
     * TODO the target references are not yet supported
     */
    private ArrayList<AmendableWidgetReferenceDTO> targetReferences = new ArrayList<AmendableWidgetReferenceDTO>();

    /**
     * Set of groups this amendment is shared with.
     */
    @DtoVirtualField(converter = "groupConvertor")
    private Set<GroupDTO> groups = new HashSet<GroupDTO>();

    public AmendmentContainerDTO() {
    }

    public AmendmentAction getAmendmentAction() {
        return amendmentAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmendmentContainerDTO that = (AmendmentContainerDTO) o;

        if (amendmentAction != that.amendmentAction) return false;
        if (!amendmentContainerStatus.equals(that.amendmentContainerStatus)) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (!amendmentContainerID.equals(that.amendmentContainerID)) return false;
        if (languageISO != null ? !languageISO.equals(that.languageISO) : that.languageISO != null)
            return false;
        if (!revisionID.equals(that.revisionID)) return false;
        if (sourceReference != null ? !sourceReference.equals(that.sourceReference) : that.sourceReference != null)
            return false;
        if (targetReferences != null ? !targetReferences.equals(that.targetReferences) : that.targetReferences != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amendmentContainerID.hashCode();
        result = 31 * result + (revisionID != null ? revisionID.hashCode() : 0);
        result = 31 * result + (languageISO != null ? languageISO.hashCode() : 0);
        result = 31 * result + (amendmentAction != null ? amendmentAction.hashCode() : 0);
        result = 31 * result + (amendmentContainerStatus != null ? amendmentContainerStatus.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (sourceReference != null ? sourceReference.hashCode() : 0);
        result = 31 * result + (targetReferences != null ? targetReferences.hashCode() : 0);
        return result;
    }

    public void setAmendmentAction(AmendmentAction amendmentAction) {
        this.amendmentAction = amendmentAction;
    }

    public String getAmendmentContainerStatus() {
        return amendmentContainerStatus;
    }

    public void setAmendmentContainerStatus(String amendmentContainerStatus) {
        this.amendmentContainerStatus = amendmentContainerStatus;
    }

    public AmendableWidgetReferenceDTO getSourceReference() {
        return sourceReference;
    }

    public void setSourceReference(AmendableWidgetReferenceDTO sourceReference) {
        this.sourceReference = sourceReference;
    }

    public ArrayList<AmendableWidgetReferenceDTO> getTargetReferences() {
        return targetReferences;
    }

    public void setTargetReferences(ArrayList<AmendableWidgetReferenceDTO> targetReferences) {
        this.targetReferences = targetReferences;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAmendmentContainerID() {
        return amendmentContainerID;
    }

    public void setAmendmentContainerID(String amendmentContainerID) {
        this.amendmentContainerID = amendmentContainerID;
    }

    public String getLanguageISO() {
        return languageISO;
    }

    public void setLanguageISO(String languageISO) {
        this.languageISO = languageISO;
    }

    public String getRevisionID() {
        return revisionID;
    }

    public void setRevisionID(String revisionID) {
        this.revisionID = revisionID;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String[] getBundledAmendmentContainerIDs() {
        return bundledAmendmentContainerIDs;
    }

    public void setBundledAmendmentContainerIDs(String[] bundledAmendmentContainerIDs) {
        this.bundledAmendmentContainerIDs = bundledAmendmentContainerIDs;
    }

    public Set<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(Set<GroupDTO> groups) {
        this.groups = groups;
    }
}
