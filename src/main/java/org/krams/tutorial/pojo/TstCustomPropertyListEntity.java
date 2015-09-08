package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_CUSTOM_PROPERTY_LIST", schema = "dbo", catalog = "SpiraTeam")
public class TstCustomPropertyListEntity {
    private int customPropertyListId;
    private String name;
    private boolean isActive;
    private boolean isSortedOnValue;

    @Id
    @Column(name = "CUSTOM_PROPERTY_LIST_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyListId() {
        return customPropertyListId;
    }

    public void setCustomPropertyListId(int customPropertyListId) {
        this.customPropertyListId = customPropertyListId;
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

    @Basic
    @Column(name = "IS_SORTED_ON_VALUE", nullable = false, insertable = true, updatable = true)
    public boolean isSortedOnValue() {
        return isSortedOnValue;
    }

    public void setSortedOnValue(boolean isSortedOnValue) {
        this.isSortedOnValue = isSortedOnValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstCustomPropertyListEntity that = (TstCustomPropertyListEntity) o;

        if (customPropertyListId != that.customPropertyListId) return false;
        if (isActive != that.isActive) return false;
        if (isSortedOnValue != that.isSortedOnValue) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyListId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isSortedOnValue ? 1 : 0);
        return result;
    }
}
