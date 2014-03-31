package org.nsesa.server.dto;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

import java.io.Serializable;

/**
 * DTO object for a group.
 * Created by Philip Luppens on 18/03/14 19:41.
 */
@Dto
public class GroupDTO implements Serializable {
    @DtoField
    String groupID;

    @DtoField
    String name;

    public GroupDTO() {
    }

    public GroupDTO(String groupID, String name) {
        this.groupID = groupID;
        this.name = name;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
