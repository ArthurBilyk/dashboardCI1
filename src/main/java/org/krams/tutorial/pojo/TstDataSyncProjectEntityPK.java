package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstDataSyncProjectEntityPK implements Serializable {
    private int dataSyncSystemId;
    private int projectId;

    @Column(name = "DATA_SYNC_SYSTEM_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getDataSyncSystemId() {
        return dataSyncSystemId;
    }

    public void setDataSyncSystemId(int dataSyncSystemId) {
        this.dataSyncSystemId = dataSyncSystemId;
    }

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncProjectEntityPK that = (TstDataSyncProjectEntityPK) o;

        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (projectId != that.projectId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + projectId;
        return result;
    }
}
