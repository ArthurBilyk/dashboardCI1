package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT", schema = "dbo", catalog = "SpiraTeam")
public class TstReportEntity {
    private int reportId;
    private String token;
    private String name;
    private String description;
    private String header;
    private String footer;
    private boolean isActive;

    @Id
    @Column(name = "REPORT_ID", nullable = false, insertable = true, updatable = true)
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "TOKEN", nullable = true, insertable = true, updatable = true)
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

        TstReportEntity that = (TstReportEntity) o;

        if (isActive != that.isActive) return false;
        if (reportId != that.reportId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (footer != null ? !footer.equals(that.footer) : that.footer != null) return false;
        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (footer != null ? footer.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
