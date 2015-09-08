package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstDataSyncArtifactMappingEntityPK implements Serializable {
    private int dataSyncSystemId;

    @Column(name = "DATA_SYNC_SYSTEM_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getDataSyncSystemId() {
        return dataSyncSystemId;
    }

    public void setDataSyncSystemId(int dataSyncSystemId) {
        this.dataSyncSystemId = dataSyncSystemId;
    }

    private int projectId;

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    private int artifactTypeId;

    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    private int artifactId;

    @Column(name = "ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncArtifactMappingEntityPK that = (TstDataSyncArtifactMappingEntityPK) o;

        if (artifactId != that.artifactId) return false;
        if (artifactTypeId != that.artifactTypeId) return false;
        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        result = 31 * result + artifactTypeId;
        result = 31 * result + artifactId;
        return result;
    }
}
