package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_INCIDENT_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstIncidentTypeEntity {
    private int incidentTypeId;
    private String name;
    private String activeYn;
    private String issueYn;
    private String riskYn;
    private String defaultYn;

    @Id
    @Column(name = "INCIDENT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getIncidentTypeId() {
        return incidentTypeId;
    }

    public void setIncidentTypeId(int incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
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
    @Column(name = "ISSUE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIssueYn() {
        return issueYn;
    }

    public void setIssueYn(String issueYn) {
        this.issueYn = issueYn;
    }

    @Basic
    @Column(name = "RISK_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getRiskYn() {
        return riskYn;
    }

    public void setRiskYn(String riskYn) {
        this.riskYn = riskYn;
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

        TstIncidentTypeEntity that = (TstIncidentTypeEntity) o;

        if (incidentTypeId != that.incidentTypeId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (defaultYn != null ? !defaultYn.equals(that.defaultYn) : that.defaultYn != null) return false;
        if (issueYn != null ? !issueYn.equals(that.issueYn) : that.issueYn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (riskYn != null ? !riskYn.equals(that.riskYn) : that.riskYn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = incidentTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (issueYn != null ? issueYn.hashCode() : 0);
        result = 31 * result + (riskYn != null ? riskYn.hashCode() : 0);
        result = 31 * result + (defaultYn != null ? defaultYn.hashCode() : 0);
        return result;
    }
}
