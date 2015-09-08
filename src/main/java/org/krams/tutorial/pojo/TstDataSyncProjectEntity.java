package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_PROJECT", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstDataSyncProjectEntityPK.class)
public class TstDataSyncProjectEntity {
    private int dataSyncSystemId;
    private int projectId;
    private String externalKey;
    private String activeYn;

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

    @Basic
    @Column(name = "EXTERNAL_KEY", nullable = false, insertable = true, updatable = true)
    public String getExternalKey() {
        return externalKey;
    }

    public void setExternalKey(String externalKey) {
        this.externalKey = externalKey;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncProjectEntity that = (TstDataSyncProjectEntity) o;

        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        return result;
    }
}
