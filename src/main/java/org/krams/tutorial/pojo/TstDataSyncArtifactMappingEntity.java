package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_ARTIFACT_MAPPING", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstDataSyncArtifactMappingEntityPK.class)
public class TstDataSyncArtifactMappingEntity {
    private int dataSyncSystemId;
    private int projectId;
    private int artifactTypeId;
    private int artifactId;
    private String externalKey;

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

    @Basic
    @Column(name = "EXTERNAL_KEY", nullable = false, insertable = true, updatable = true)
    public String getExternalKey() {
        return externalKey;
    }

    public void setExternalKey(String externalKey) {
        this.externalKey = externalKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncArtifactMappingEntity that = (TstDataSyncArtifactMappingEntity) o;

        if (artifactId != that.artifactId) return false;
        if (artifactTypeId != that.artifactTypeId) return false;
        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        result = 31 * result + artifactTypeId;
        result = 31 * result + artifactId;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        return result;
    }
}
