package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_GENERATED", schema = "dbo", catalog = "SpiraTeam")
public class TstReportGeneratedEntity {
    private int reportGeneratedId;

    @Id
    @Column(name = "REPORT_GENERATED_ID", nullable = false, insertable = true, updatable = true)
    public int getReportGeneratedId() {
        return reportGeneratedId;
    }

    public void setReportGeneratedId(int reportGeneratedId) {
        this.reportGeneratedId = reportGeneratedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportGeneratedEntity that = (TstReportGeneratedEntity) o;

        if (reportGeneratedId != that.reportGeneratedId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return reportGeneratedId;
    }
}
