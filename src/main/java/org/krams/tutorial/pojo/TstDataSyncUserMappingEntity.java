package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_USER_MAPPING", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstDataSyncUserMappingEntityPK.class)
public class TstDataSyncUserMappingEntity {
    private int dataSyncSystemId;
    private int userId;
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
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

        TstDataSyncUserMappingEntity that = (TstDataSyncUserMappingEntity) o;

        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (userId != that.userId) return false;
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + userId;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        return result;
    }
}
