package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstReportAvailableSectionEntityPK implements Serializable {
    private int reportId;
    private int reportSectionId;

    @Column(name = "REPORT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Column(name = "REPORT_SECTION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReportSectionId() {
        return reportSectionId;
    }

    public void setReportSectionId(int reportSectionId) {
        this.reportSectionId = reportSectionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportAvailableSectionEntityPK that = (TstReportAvailableSectionEntityPK) o;

        if (reportId != that.reportId) return false;
        if (reportSectionId != that.reportSectionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + reportSectionId;
        return result;
    }
}
