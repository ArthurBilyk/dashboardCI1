package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_CUSTOM_SECTION", schema = "dbo", catalog = "SpiraTeam")
public class TstReportCustomSectionEntity {
    private int reportCustomSectionId;
    private String name;
    private String description;
    private String template;
    private String query;
    private boolean isActive;
    private String header;
    private String footer;

    @Id
    @Column(name = "REPORT_CUSTOM_SECTION_ID", nullable = false, insertable = true, updatable = true)
    public int getReportCustomSectionId() {
        return reportCustomSectionId;
    }

    public void setReportCustomSectionId(int reportCustomSectionId) {
        this.reportCustomSectionId = reportCustomSectionId;
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
    @Column(name = "TEMPLATE", nullable = false, insertable = true, updatable = true)
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "QUERY", nullable = false, insertable = true, updatable = true)
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReportCustomSectionEntity that = (TstReportCustomSectionEntity) o;

        if (isActive != that.isActive) return false;
        if (reportCustomSectionId != that.reportCustomSectionId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (footer != null ? !footer.equals(that.footer) : that.footer != null) return false;
        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (template != null ? !template.equals(that.template) : that.template != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportCustomSectionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        result = 31 * result + (query != null ? query.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (footer != null ? footer.hashCode() : 0);
        return result;
    }
}
