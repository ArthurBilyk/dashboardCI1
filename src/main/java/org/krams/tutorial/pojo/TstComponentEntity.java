package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_COMPONENT", schema = "dbo", catalog = "SpiraTeam")
public class TstComponentEntity {
    private int componentId;
    private String name;
    private boolean isDeleted;
    private boolean isActive;

    @Id
    @Column(name = "COMPONENT_ID", nullable = false, insertable = true, updatable = true)
    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
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
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
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

        TstComponentEntity that = (TstComponentEntity) o;

        if (componentId != that.componentId) return false;
        if (isActive != that.isActive) return false;
        if (isDeleted != that.isDeleted) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = componentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
