package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_CUSTOM_PROPERTY_OPTION", schema = "dbo", catalog = "SpiraTeam")
public class TstCustomPropertyOptionEntity {
    private int customPropertyOptionId;
    private String name;
    private boolean isActive;

    @Id
    @Column(name = "CUSTOM_PROPERTY_OPTION_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyOptionId() {
        return customPropertyOptionId;
    }

    public void setCustomPropertyOptionId(int customPropertyOptionId) {
        this.customPropertyOptionId = customPropertyOptionId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstCustomPropertyOptionEntity that = (TstCustomPropertyOptionEntity) o;

        if (customPropertyOptionId != that.customPropertyOptionId) return false;
        if (isActive != that.isActive) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customPropertyOptionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
