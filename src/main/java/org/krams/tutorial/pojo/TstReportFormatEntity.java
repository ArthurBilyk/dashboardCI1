package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REPORT_FORMAT", schema = "dbo", catalog = "SpiraTeam")
public class TstReportFormatEntity {
    private int reportFormatId;
    private String token;
    private String name;
    private String description;
    private String iconFilename;
    private String contentType;
    private String contentDisposition;
    private boolean isActive;

    @Id
    @Column(name = "REPORT_FORMAT_ID", nullable = false, insertable = true, updatable = true)
    public int getReportFormatId() {
        return reportFormatId;
    }

    public void setReportFormatId(int reportFormatId) {
        this.reportFormatId = reportFormatId;
    }

    @Basic
    @Column(name = "TOKEN", nullable = false, insertable = true, updatable = true)
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
    @Column(name = "ICON_FILENAME", nullable = false, insertable = true, updatable = true)
    public String getIconFilename() {
        return iconFilename;
    }

    public void setIconFilename(String iconFilename) {
        this.iconFilename = iconFilename;
    }

    @Basic
    @Column(name = "CONTENT_TYPE", nullable = false, insertable = true, updatable = true)
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Basic
    @Column(name = "CONTENT_DISPOSITION", nullable = true, insertable = true, updatable = true)
    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
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

        TstReportFormatEntity that = (TstReportFormatEntity) o;

        if (isActive != that.isActive) return false;
        if (reportFormatId != that.reportFormatId) return false;
        if (contentDisposition != null ? !contentDisposition.equals(that.contentDisposition) : that.contentDisposition != null)
            return false;
        if (contentType != null ? !contentType.equals(that.contentType) : that.contentType != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (iconFilename != null ? !iconFilename.equals(that.iconFilename) : that.iconFilename != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportFormatId;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (iconFilename != null ? iconFilename.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (contentDisposition != null ? contentDisposition.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
