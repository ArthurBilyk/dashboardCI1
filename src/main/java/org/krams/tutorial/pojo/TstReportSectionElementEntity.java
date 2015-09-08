package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_SECTION_ELEMENT", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstReportSectionElementEntityPK.class)
public class TstReportSectionElementEntity {
    private int reportSectionId;
    private int reportElementId;

    @Id
    @Column(name = "REPORT_SECTION_ID", nullable = false, insertable = true, updatable = true)
    public int getReportSectionId() {
        return reportSectionId;
    }

    public void setReportSectionId(int reportSectionId) {
        this.reportSectionId = reportSectionId;
    }

    @Id
    @Column(name = "REPORT_ELEMENT_ID", nullable = false, insertable = true, updatable = true)
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

        TstReportSectionElementEntity that = (TstReportSectionElementEntity) o;

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
