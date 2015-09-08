package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_GROUP", schema = "dbo", catalog = "SpiraTeam")
public class TstProjectGroupEntity {
    private int projectGroupId;
    private String name;
    private String description;
    private String activeYn;
    private String defaultYn;
    private String website;

    @Id
    @Column(name = "PROJECT_GROUP_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(int projectGroupId) {
        this.projectGroupId = projectGroupId;
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
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Basic
    @Column(name = "DEFAULT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDefaultYn() {
        return defaultYn;
    }

    public void setDefaultYn(String defaultYn) {
        this.defaultYn = defaultYn;
    }

    @Basic
    @Column(name = "WEBSITE", nullable = true, insertable = true, updatable = true)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectGroupEntity that = (TstProjectGroupEntity) o;

        if (projectGroupId != that.projectGroupId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (defaultYn != null ? !defaultYn.equals(that.defaultYn) : that.defaultYn != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectGroupId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (defaultYn != null ? defaultYn.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        return result;
    }
}
