package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ARTIFACT_ATTACHMENT", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstArtifactAttachmentEntityPK.class)
public class TstArtifactAttachmentEntity {
    private int artifactTypeId;
    private int artifactId;
    private int attachmentId;

    @Id
    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    @Id
    @Column(name = "ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    @Id
    @Column(name = "ATTACHMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstArtifactAttachmentEntity that = (TstArtifactAttachmentEntity) o;

        if (artifactId != that.artifactId) return false;
        if (artifactTypeId != that.artifactTypeId) return false;
        if (attachmentId != that.attachmentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactTypeId;
        result = 31 * result + artifactId;
        result = 31 * result + attachmentId;
        return result;
    }
}
