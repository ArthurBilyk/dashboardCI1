package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_SAVED", schema = "dbo", catalog = "SpiraTeam")
public class TstReportSavedEntity {
    private int reportSavedId;
    private String name;
    private String parameters;
    private boolean isShared;

    @Id
    @Column(name = "REPORT_SAVED_ID", nullable = false, insertable = true, updatable = true)
    public int getReportSavedId() {
        return reportSavedId;
    }

    public void setReportSavedId(int reportSavedId) {
        this.reportSavedId = reportSavedId;
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
    @Column(name = "PARAMETERS", nullable = true, insertable = true, updatable = true)
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @Basic
    @Column(name = "IS_SHARED", nullable = false, insertable = true, updatable = true)
    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean isShared) {
        this.isShared = isShared;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportSavedEntity that = (TstReportSavedEntity) o;

        if (isShared != that.isShared) return false;
        if (reportSavedId != that.reportSavedId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parameters != null ? !parameters.equals(that.parameters) : that.parameters != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportSavedId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (isShared ? 1 : 0);
        return result;
    }
}
