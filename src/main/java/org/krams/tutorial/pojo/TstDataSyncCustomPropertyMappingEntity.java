package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_CUSTOM_PROPERTY_MAPPING", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstDataSyncCustomPropertyMappingEntityPK.class)
public class TstDataSyncCustomPropertyMappingEntity {
    private int dataSyncSystemId;
    private int customPropertyId;
    private int projectId;
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
    @Column(name = "CUSTOM_PROPERTY_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyId() {
        return customPropertyId;
    }

    public void setCustomPropertyId(int customPropertyId) {
        this.customPropertyId = customPropertyId;
    }

    @Id
    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
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

        TstDataSyncCustomPropertyMappingEntity that = (TstDataSyncCustomPropertyMappingEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + customPropertyId;
        result = 31 * result + projectId;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        return result;
    }
}
