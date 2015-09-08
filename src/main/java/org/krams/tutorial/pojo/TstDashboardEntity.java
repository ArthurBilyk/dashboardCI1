package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DASHBOARD", schema = "dbo", catalog = "SpiraTeam")
public class TstDashboardEntity {
    private int dashboardId;
    private String path;
    private String loweredPath;

    @Id
    @Column(name = "DASHBOARD_ID", nullable = false, insertable = true, updatable = true)
    public int getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(int dashboardId) {
        this.dashboardId = dashboardId;
    }

    @Basic
    @Column(name = "PATH", nullable = true, insertable = true, updatable = true)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "LOWERED_PATH", nullable = true, insertable = true, updatable = true)
    public String getLoweredPath() {
        return loweredPath;
    }

    public void setLoweredPath(String loweredPath) {
        this.loweredPath = loweredPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDashboardEntity that = (TstDashboardEntity) o;

        if (dashboardId != that.dashboardId) return false;
        if (loweredPath != null ? !loweredPath.equals(that.loweredPath) : that.loweredPath != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dashboardId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (loweredPath != null ? loweredPath.hashCode() : 0);
        return result;
    }
}
