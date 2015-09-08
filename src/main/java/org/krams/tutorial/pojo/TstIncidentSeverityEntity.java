package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_INCIDENT_SEVERITY", schema = "dbo", catalog = "SpiraTeam")
public class TstIncidentSeverityEntity {
    private int severityId;
    private String name;
    private String color;
    private String activeYn;

    @Id
    @Column(name = "SEVERITY_ID", nullable = false, insertable = true, updatable = true)
    public int getSeverityId() {
        return severityId;
    }

    public void setSeverityId(int severityId) {
        this.severityId = severityId;
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
    @Column(name = "COLOR", nullable = false, insertable = true, updatable = true)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

        TstIncidentSeverityEntity that = (TstIncidentSeverityEntity) o;

        if (severityId != that.severityId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = severityId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        return result;
    }
}
