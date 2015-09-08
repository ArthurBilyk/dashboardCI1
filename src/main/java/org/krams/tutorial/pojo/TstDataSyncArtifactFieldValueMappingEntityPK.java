package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstDataSyncArtifactFieldValueMappingEntityPK implements Serializable {
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

    private int artifactFieldId;

    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
    }

    private int artifactFieldValue;

    @Column(name = "ARTIFACT_FIELD_VALUE", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactFieldValue() {
        return artifactFieldValue;
    }

    public void setArtifactFieldValue(int artifactFieldValue) {
        this.artifactFieldValue = artifactFieldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncArtifactFieldValueMappingEntityPK that = (TstDataSyncArtifactFieldValueMappingEntityPK) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (artifactFieldValue != that.artifactFieldValue) return false;
        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        result = 31 * result + artifactFieldId;
        result = 31 * result + artifactFieldValue;
        return result;
    }
}
