package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ARTIFACT_LINK", schema = "dbo", catalog = "SpiraTeam")
public class TstArtifactLinkEntity {
    private int artifactLinkId;
    private int sourceArtifactId;
    private int destArtifactId;
    private Timestamp creationDate;
    private String comment;

    @Id
    @Column(name = "ARTIFACT_LINK_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactLinkId() {
        return artifactLinkId;
    }

    public void setArtifactLinkId(int artifactLinkId) {
        this.artifactLinkId = artifactLinkId;
    }

    @Basic
    @Column(name = "SOURCE_ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getSourceArtifactId() {
        return sourceArtifactId;
    }

    public void setSourceArtifactId(int sourceArtifactId) {
        this.sourceArtifactId = sourceArtifactId;
    }

    @Basic
    @Column(name = "DEST_ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getDestArtifactId() {
        return destArtifactId;
    }

    public void setDestArtifactId(int destArtifactId) {
        this.destArtifactId = destArtifactId;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "COMMENT", nullable = true, insertable = true, updatable = true)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstArtifactLinkEntity that = (TstArtifactLinkEntity) o;

        if (artifactLinkId != that.artifactLinkId) return false;
        if (destArtifactId != that.destArtifactId) return false;
        if (sourceArtifactId != that.sourceArtifactId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactLinkId;
        result = 31 * result + sourceArtifactId;
        result = 31 * result + destArtifactId;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
