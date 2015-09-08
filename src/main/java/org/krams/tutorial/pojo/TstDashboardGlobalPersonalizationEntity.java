package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DASHBOARD_GLOBAL_PERSONALIZATION", schema = "dbo", catalog = "SpiraTeam")
public class TstDashboardGlobalPersonalizationEntity {
    private int dashboardId;
    private byte[] pageSettings;
    private Timestamp lastUpdateDate;

    @Id
    @Column(name = "DASHBOARD_ID", nullable = false, insertable = true, updatable = true)
    public int getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(int dashboardId) {
        this.dashboardId = dashboardId;
    }

    @Basic
    @Column(name = "PAGE_SETTINGS", nullable = false, insertable = true, updatable = true)
    public byte[] getPageSettings() {
        return pageSettings;
    }

    public void setPageSettings(byte[] pageSettings) {
        this.pageSettings = pageSettings;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDashboardGlobalPersonalizationEntity that = (TstDashboardGlobalPersonalizationEntity) o;

        if (dashboardId != that.dashboardId) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (!Arrays.equals(pageSettings, that.pageSettings)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dashboardId;
        result = 31 * result + (pageSettings != null ? Arrays.hashCode(pageSettings) : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        return result;
    }
}
