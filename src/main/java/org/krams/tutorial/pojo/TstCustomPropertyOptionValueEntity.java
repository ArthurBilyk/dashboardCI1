package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_CUSTOM_PROPERTY_OPTION_VALUE", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstCustomPropertyOptionValueEntityPK.class)
public class TstCustomPropertyOptionValueEntity {
    private int customPropertyOptionId;
    private int customPropertyId;
    private String value;

    @Id
    @Column(name = "CUSTOM_PROPERTY_OPTION_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyOptionId() {
        return customPropertyOptionId;
    }

    public void setCustomPropertyOptionId(int customPropertyOptionId) {
        this.customPropertyOptionId = customPropertyOptionId;
    }

    @Id
    @Column(name = "CUSTOM_PROPERTY_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyId() {
        return customPropertyId;
    }

    public void setCustomPropertyId(int customPropertyId) {
        this.customPropertyId = customPropertyId;
    }

    @Basic
    @Column(name = "VALUE", nullable = false, insertable = true, updatable = true)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstCustomPropertyOptionValueEntity that = (TstCustomPropertyOptionValueEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (customPropertyOptionId != that.customPropertyOptionId) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyOptionId;
        result = 31 * result + customPropertyId;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
