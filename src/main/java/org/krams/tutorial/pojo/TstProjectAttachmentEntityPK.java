package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstProjectAttachmentEntityPK implements Serializable {
    private int attachmentId;
    private int projectId;

    @Column(name = "ATTACHMENT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectAttachmentEntityPK that = (TstProjectAttachmentEntityPK) o;

        if (attachmentId != that.attachmentId) return false;
        if (projectId != that.projectId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attachmentId;
        result = 31 * result + projectId;
        return result;
    }
}
