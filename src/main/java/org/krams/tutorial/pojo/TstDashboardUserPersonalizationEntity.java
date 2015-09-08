package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DASHBOARD_USER_PERSONALIZATION", schema = "dbo", catalog = "SpiraTeam")
public class TstDashboardUserPersonalizationEntity {
    private int dashboardUserId;
    private byte[] pageSettings;
    private Timestamp lastUpdateDate;

    @Id
    @Column(name = "DASHBOARD_USER_ID", nullable = false, insertable = true, updatable = true)
    public int getDashboardUserId() {
        return dashboardUserId;
    }

    public void setDashboardUserId(int dashboardUserId) {
        this.dashboardUserId = dashboardUserId;
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

        TstDashboardUserPersonalizationEntity that = (TstDashboardUserPersonalizationEntity) o;

        if (dashboardUserId != that.dashboardUserId) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (!Arrays.equals(pageSettings, that.pageSettings)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dashboardUserId;
        result = 31 * result + (pageSettings != null ? Arrays.hashCode(pageSettings) : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        return result;
    }
}
