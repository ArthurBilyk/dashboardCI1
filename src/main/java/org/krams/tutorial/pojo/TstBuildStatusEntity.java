package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_BUILD_STATUS", schema = "dbo", catalog = "SpiraTeam")
public class TstBuildStatusEntity {
    private int buildStatusId;
    private String name;
    private boolean isActive;

    @Id
    @Column(name = "BUILD_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getBuildStatusId() {
        return buildStatusId;
    }

    public void setBuildStatusId(int buildStatusId) {
        this.buildStatusId = buildStatusId;
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

        TstBuildStatusEntity that = (TstBuildStatusEntity) o;

        if (buildStatusId != that.buildStatusId) return false;
        if (isActive != that.isActive) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildStatusId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
