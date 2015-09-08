package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_INCIDENT_STATUS", schema = "dbo", catalog = "SpiraTeam")
public class TstIncidentStatusEntity {
    private int incidentStatusId;
    private String name;
    private String activeYn;
    private String openStatusYn;
    private String defaultYn;

    @Id
    @Column(name = "INCIDENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getIncidentStatusId() {
        return incidentStatusId;
    }

    public void setIncidentStatusId(int incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Basic
    @Column(name = "OPEN_STATUS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getOpenStatusYn() {
        return openStatusYn;
    }

    public void setOpenStatusYn(String openStatusYn) {
        this.openStatusYn = openStatusYn;
    }

    @Basic
    @Column(name = "DEFAULT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDefaultYn() {
        return defaultYn;
    }

    public void setDefaultYn(String defaultYn) {
        this.defaultYn = defaultYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstIncidentStatusEntity that = (TstIncidentStatusEntity) o;

        if (incidentStatusId != that.incidentStatusId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (defaultYn != null ? !defaultYn.equals(that.defaultYn) : that.defaultYn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (openStatusYn != null ? !openStatusYn.equals(that.openStatusYn) : that.openStatusYn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = incidentStatusId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (openStatusYn != null ? openStatusYn.hashCode() : 0);
        result = 31 * result + (defaultYn != null ? defaultYn.hashCode() : 0);
        return result;
    }
}
