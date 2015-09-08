package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_AUTOMATION_HOST", schema = "dbo", catalog = "SpiraTeam")
public class TstAutomationHostEntity {
    private int automationHostId;
    private String name;
    private String description;
    private String token;
    private String activeYn;
    private String attachmentsYn;
    private Timestamp lastUpdateDate;
    private boolean isDeleted;

    @Id
    @Column(name = "AUTOMATION_HOST_ID", nullable = false, insertable = true, updatable = true)
    public int getAutomationHostId() {
        return automationHostId;
    }

    public void setAutomationHostId(int automationHostId) {
        this.automationHostId = automationHostId;
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
    @Column(name = "TOKEN", nullable = false, insertable = true, updatable = true)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Basic
    @Column(name = "ATTACHMENTS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAttachmentsYn() {
        return attachmentsYn;
    }

    public void setAttachmentsYn(String attachmentsYn) {
        this.attachmentsYn = attachmentsYn;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstAutomationHostEntity that = (TstAutomationHostEntity) o;

        if (automationHostId != that.automationHostId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (attachmentsYn != null ? !attachmentsYn.equals(that.attachmentsYn) : that.attachmentsYn != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = automationHostId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (attachmentsYn != null ? attachmentsYn.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        return result;
    }
}
