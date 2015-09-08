package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_CUSTOM_PROPERTY", schema = "dbo", catalog = "SpiraTeam")
public class TstCustomPropertyEntity {
    private int customPropertyId;
    private String name;
    private int propertyNumber;
    private boolean isDeleted;
    private String legacyName;

    @Id
    @Column(name = "CUSTOM_PROPERTY_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyId() {
        return customPropertyId;
    }

    public void setCustomPropertyId(int customPropertyId) {
        this.customPropertyId = customPropertyId;
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
    @Column(name = "PROPERTY_NUMBER", nullable = false, insertable = true, updatable = true)
    public int getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(int propertyNumber) {
        this.propertyNumber = propertyNumber;
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
    @Column(name = "LEGACY_NAME", nullable = true, insertable = true, updatable = true)
    public String getLegacyName() {
        return legacyName;
    }

    public void setLegacyName(String legacyName) {
        this.legacyName = legacyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstCustomPropertyEntity that = (TstCustomPropertyEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (propertyNumber != that.propertyNumber) return false;
        if (legacyName != null ? !legacyName.equals(that.legacyName) : that.legacyName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + propertyNumber;
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (legacyName != null ? legacyName.hashCode() : 0);
        return result;
    }
}
