package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstReportAvailableFormatEntityPK implements Serializable {
    private int reportId;
    private int reportFormatId;

    @Column(name = "REPORT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Column(name = "REPORT_FORMAT_ID", nullable = false, insertable = true, updatable = true)
    @Id
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

        TstReportAvailableFormatEntityPK that = (TstReportAvailableFormatEntityPK) o;

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
