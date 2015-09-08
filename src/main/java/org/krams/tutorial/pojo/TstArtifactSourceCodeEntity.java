package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ARTIFACT_SOURCE_CODE", schema = "dbo", catalog = "SpiraTeam")
public class TstArtifactSourceCodeEntity {
    private int artifactSourceCodeId;
    private int artifactId;
    private String fileKey;
    private String comment;
    private Timestamp creationDate;

    @Id
    @Column(name = "ARTIFACT_SOURCE_CODE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactSourceCodeId() {
        return artifactSourceCodeId;
    }

    public void setArtifactSourceCodeId(int artifactSourceCodeId) {
        this.artifactSourceCodeId = artifactSourceCodeId;
    }

    @Basic
    @Column(name = "ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    @Basic
    @Column(name = "FILE_KEY", nullable = false, insertable = true, updatable = true)
    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    @Basic
    @Column(name = "COMMENT", nullable = true, insertable = true, updatable = true)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstArtifactSourceCodeEntity that = (TstArtifactSourceCodeEntity) o;

        if (artifactId != that.artifactId) return false;
        if (artifactSourceCodeId != that.artifactSourceCodeId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (fileKey != null ? !fileKey.equals(that.fileKey) : that.fileKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactSourceCodeId;
        result = 31 * result + artifactId;
        result = 31 * result + (fileKey != null ? fileKey.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
