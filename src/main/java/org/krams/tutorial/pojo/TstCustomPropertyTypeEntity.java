package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_CUSTOM_PROPERTY_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstCustomPropertyTypeEntity {
    private int customPropertyTypeId;
    private String name;
    private String systemType;
    private boolean isActive;

    @Id
    @Column(name = "CUSTOM_PROPERTY_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyTypeId() {
        return customPropertyTypeId;
    }

    public void setCustomPropertyTypeId(int customPropertyTypeId) {
        this.customPropertyTypeId = customPropertyTypeId;
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
    @Column(name = "SYSTEM_TYPE", nullable = true, insertable = true, updatable = true)
    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
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

        TstCustomPropertyTypeEntity that = (TstCustomPropertyTypeEntity) o;

        if (customPropertyTypeId != that.customPropertyTypeId) return false;
        if (isActive != that.isActive) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (systemType != null ? !systemType.equals(that.systemType) : that.systemType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (systemType != null ? systemType.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
