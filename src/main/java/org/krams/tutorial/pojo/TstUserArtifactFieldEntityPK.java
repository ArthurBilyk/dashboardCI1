package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstUserArtifactFieldEntityPK implements Serializable {
    private int artifactFieldId;
    private int projectId;
    private int userId;

    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
    }

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstUserArtifactFieldEntityPK that = (TstUserArtifactFieldEntityPK) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (projectId != that.projectId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactFieldId;
        result = 31 * result + projectId;
        result = 31 * result + userId;
        return result;
    }
}
