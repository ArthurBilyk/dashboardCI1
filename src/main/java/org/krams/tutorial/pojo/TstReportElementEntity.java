package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_ELEMENT", schema = "dbo", catalog = "SpiraTeam")
public class TstReportElementEntity {
    private int reportElementId;
    private String token;
    private String name;
    private String description;
    private boolean isActive;

    @Id
    @Column(name = "REPORT_ELEMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getReportElementId() {
        return reportElementId;
    }

    public void setReportElementId(int reportElementId) {
        this.reportElementId = reportElementId;
    }

    @Basic
    @Column(name = "TOKEN", nullable = false, insertable = true, updatable = true)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportElementEntity that = (TstReportElementEntity) o;

        if (isActive != that.isActive) return false;
        if (reportElementId != that.reportElementId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportElementId;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
