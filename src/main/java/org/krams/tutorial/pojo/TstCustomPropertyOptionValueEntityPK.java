package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstCustomPropertyOptionValueEntityPK implements Serializable {
    private int customPropertyOptionId;
    private int customPropertyId;

    @Column(name = "CUSTOM_PROPERTY_OPTION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCustomPropertyOptionId() {
        return customPropertyOptionId;
    }

    public void setCustomPropertyOptionId(int customPropertyOptionId) {
        this.customPropertyOptionId = customPropertyOptionId;
    }

    @Column(name = "CUSTOM_PROPERTY_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCustomPropertyId() {
        return customPropertyId;
    }

    public void setCustomPropertyId(int customPropertyId) {
        this.customPropertyId = customPropertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstCustomPropertyOptionValueEntityPK that = (TstCustomPropertyOptionValueEntityPK) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (customPropertyOptionId != that.customPropertyOptionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyOptionId;
        result = 31 * result + customPropertyId;
        return result;
    }
}
