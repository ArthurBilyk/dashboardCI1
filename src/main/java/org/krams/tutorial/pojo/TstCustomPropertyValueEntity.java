package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_CUSTOM_PROPERTY_VALUE", schema = "dbo", catalog = "SpiraTeam")
public class TstCustomPropertyValueEntity {
    private int customPropertyValueId;
    private String name;

    @Id
    @Column(name = "CUSTOM_PROPERTY_VALUE_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyValueId() {
        return customPropertyValueId;
    }

    public void setCustomPropertyValueId(int customPropertyValueId) {
        this.customPropertyValueId = customPropertyValueId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstCustomPropertyValueEntity that = (TstCustomPropertyValueEntity) o;

        if (customPropertyValueId != that.customPropertyValueId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyValueId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
