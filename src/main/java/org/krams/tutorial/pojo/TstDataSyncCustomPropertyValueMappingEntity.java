package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_CUSTOM_PROPERTY_VALUE_MAPPING", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstDataSyncCustomPropertyValueMappingEntityPK.class)
public class TstDataSyncCustomPropertyValueMappingEntity {
    private int dataSyncSystemId;
    private int projectId;
    private int customPropertyValueId;
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
    @Column(name = "CUSTOM_PROPERTY_VALUE_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyValueId() {
        return customPropertyValueId;
    }

    public void setCustomPropertyValueId(int customPropertyValueId) {
        this.customPropertyValueId = customPropertyValueId;
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

        TstDataSyncCustomPropertyValueMappingEntity that = (TstDataSyncCustomPropertyValueMappingEntity) o;

        if (customPropertyValueId != that.customPropertyValueId) return false;
        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        result = 31 * result + customPropertyValueId;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        return result;
    }
}
