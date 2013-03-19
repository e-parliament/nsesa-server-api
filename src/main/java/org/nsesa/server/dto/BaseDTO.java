package org.nsesa.server.dto;

import java.io.Serializable;

/**
 * Date: 11/03/13 15:30
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class BaseDTO implements Serializable {

    private String id;

    private long lockVersion;

    private long creationStamp;
    private long modificationStamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(long lockVersion) {
        this.lockVersion = lockVersion;
    }

    public long getCreationStamp() {
        return creationStamp;
    }

    public void setCreationStamp(long creationStamp) {
        this.creationStamp = creationStamp;
    }

    public long getModificationStamp() {
        return modificationStamp;
    }

    public void setModificationStamp(long modificationStamp) {
        this.modificationStamp = modificationStamp;
    }
}
