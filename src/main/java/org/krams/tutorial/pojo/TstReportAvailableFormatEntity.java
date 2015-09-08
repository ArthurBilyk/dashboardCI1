package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_AVAILABLE_FORMAT", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstReportAvailableFormatEntityPK.class)
public class TstReportAvailableFormatEntity {
    private int reportId;
    private int reportFormatId;

    @Id
    @Column(name = "REPORT_ID", nullable = false, insertable = true, updatable = true)
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Id
    @Column(name = "REPORT_FORMAT_ID", nullable = false, insertable = true, updatable = true)
    public int getReportFormatId() {
        return reportFormatId;
    }

    public void setReportFormatId(int reportFormatId) {
        this.reportFormatId = reportFormatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportAvailableFormatEntity that = (TstReportAvailableFormatEntity) o;

        if (reportFormatId != that.reportFormatId) return false;
        if (reportId != that.reportId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + reportFormatId;
        return result;
    }
}
