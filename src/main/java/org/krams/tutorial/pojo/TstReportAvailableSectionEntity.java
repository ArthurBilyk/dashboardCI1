package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_AVAILABLE_SECTION", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstReportAvailableSectionEntityPK.class)
public class TstReportAvailableSectionEntity {
    private int reportId;
    private int reportSectionId;
    private String header;
    private String footer;
    private String template;

    @Id
    @Column(name = "REPORT_ID", nullable = false, insertable = true, updatable = true)
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Id
    @Column(name = "REPORT_SECTION_ID", nullable = false, insertable = true, updatable = true)
    public int getReportSectionId() {
        return reportSectionId;
    }

    public void setReportSectionId(int reportSectionId) {
        this.reportSectionId = reportSectionId;
    }

    @Basic
    @Column(name = "HEADER", nullable = true, insertable = true, updatable = true)
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Basic
    @Column(name = "FOOTER", nullable = true, insertable = true, updatable = true)
    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Basic
    @Column(name = "TEMPLATE", nullable = true, insertable = true, updatable = true)
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportAvailableSectionEntity that = (TstReportAvailableSectionEntity) o;

        if (reportId != that.reportId) return false;
        if (reportSectionId != that.reportSectionId) return false;
        if (footer != null ? !footer.equals(that.footer) : that.footer != null) return false;
        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (template != null ? !template.equals(that.template) : that.template != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + reportSectionId;
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (footer != null ? footer.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        return result;
    }
}
