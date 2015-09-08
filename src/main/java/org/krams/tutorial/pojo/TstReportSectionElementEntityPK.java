package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstReportSectionElementEntityPK implements Serializable {
    private int reportSectionId;
    private int reportElementId;

    @Column(name = "REPORT_SECTION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReportSectionId() {
        return reportSectionId;
    }

    public void setReportSectionId(int reportSectionId) {
        this.reportSectionId = reportSectionId;
    }

    @Column(name = "REPORT_ELEMENT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReportElementId() {
        return reportElementId;
    }

    public void setReportElementId(int reportElementId) {
        this.reportElementId = reportElementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportSectionElementEntityPK that = (TstReportSectionElementEntityPK) o;

        if (reportElementId != that.reportElementId) return false;
        if (reportSectionId != that.reportSectionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportSectionId;
        result = 31 * result + reportElementId;
        return result;
    }
}
