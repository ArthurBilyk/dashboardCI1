package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstRequirementTypeEntity {
    private int requirementTypeId;
    private String name;
    private String icon;
    private boolean isActive;

    @Id
    @Column(name = "REQUIREMENT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(int requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
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
    @Column(name = "ICON", nullable = false, insertable = true, updatable = true)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

        TstRequirementTypeEntity that = (TstRequirementTypeEntity) o;

        if (isActive != that.isActive) return false;
        if (requirementTypeId != that.requirementTypeId) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
