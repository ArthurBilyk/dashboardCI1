package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_ATTACHMENT", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstProjectAttachmentEntityPK.class)
public class TstProjectAttachmentEntity {
    private int attachmentId;
    private int projectId;

    @Id
    @Column(name = "ATTACHMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Id
    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
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

        TstProjectAttachmentEntity that = (TstProjectAttachmentEntity) o;

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
