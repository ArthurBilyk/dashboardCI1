package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstUserCustomPropertyEntityPK implements Serializable {
    private int userId;
    private int customPropertyId;

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

        TstUserCustomPropertyEntityPK that = (TstUserCustomPropertyEntityPK) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + customPropertyId;
        return result;
    }
}
