package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_ARTIFACT_FIELD_VALUE_MAPPING", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstDataSyncArtifactFieldValueMappingEntityPK.class)
public class TstDataSyncArtifactFieldValueMappingEntity {
    private int dataSyncSystemId;
    private int projectId;
    private int artifactFieldId;
    private int artifactFieldValue;
    private String externalKey;
    private String primaryYn;

    @Id
    @Column(name = "DATA_SYNC_SYSTEM_ID", nullable = false, insertable = true, updatable = true)
    public int getDataSyncSystemId() {
        return dataSyncSystemId;
    }

    public void setDataSyncSystemId(int dataSyncSystemId) {
        this.dataSyncSystemId = dataSyncSystemId;
    }

    @Id
    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Id
    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
    }

    @Id
    @Column(name = "ARTIFACT_FIELD_VALUE", nullable = false, insertable = true, updatable = true)
    public int getArtifactFieldValue() {
        return artifactFieldValue;
    }

    public void setArtifactFieldValue(int artifactFieldValue) {
        this.artifactFieldValue = artifactFieldValue;
    }

    @Basic
    @Column(name = "EXTERNAL_KEY", nullable = false, insertable = true, updatable = true)
    public String getExternalKey() {
        return externalKey;
    }

    public void setExternalKey(String externalKey) {
        this.externalKey = externalKey;
    }

    @Basic
    @Column(name = "PRIMARY_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getPrimaryYn() {
        return primaryYn;
    }

    public void setPrimaryYn(String primaryYn) {
        this.primaryYn = primaryYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncArtifactFieldValueMappingEntity that = (TstDataSyncArtifactFieldValueMappingEntity) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (artifactFieldValue != that.artifactFieldValue) return false;
        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) return false;
        if (primaryYn != null ? !primaryYn.equals(that.primaryYn) : that.primaryYn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        result = 31 * result + artifactFieldId;
        result = 31 * result + artifactFieldValue;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        result = 31 * result + (primaryYn != null ? primaryYn.hashCode() : 0);
        return result;
    }
}
