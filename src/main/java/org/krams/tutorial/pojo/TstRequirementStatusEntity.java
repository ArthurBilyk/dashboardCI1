package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_STATUS", schema = "dbo", catalog = "SpiraTeam")
public class TstRequirementStatusEntity {
    private int requirementStatusId;
    private String name;
    private int position;
    private boolean isActive;

    @Id
    @Column(name = "REQUIREMENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementStatusId() {
        return requirementStatusId;
    }

    public void setRequirementStatusId(int requirementStatusId) {
        this.requirementStatusId = requirementStatusId;
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
    @Column(name = "POSITION", nullable = false, insertable = true, updatable = true)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

        TstRequirementStatusEntity that = (TstRequirementStatusEntity) o;

        if (isActive != that.isActive) return false;
        if (position != that.position) return false;
        if (requirementStatusId != that.requirementStatusId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementStatusId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + position;
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
