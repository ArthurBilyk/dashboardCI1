package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_USER_CUSTOM_PROPERTY", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstUserCustomPropertyEntityPK.class)
public class TstUserCustomPropertyEntity {
    private int userId;
    private int customPropertyId;
    private boolean isVisible;
    private Integer listPosition;

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    @Column(name = "IS_VISIBLE", nullable = false, insertable = true, updatable = true)
    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Basic
    @Column(name = "LIST_POSITION", nullable = true, insertable = true, updatable = true)
    public Integer getListPosition() {
        return listPosition;
    }

    public void setListPosition(Integer listPosition) {
        this.listPosition = listPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstUserCustomPropertyEntity that = (TstUserCustomPropertyEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (isVisible != that.isVisible) return false;
        if (userId != that.userId) return false;
        if (listPosition != null ? !listPosition.equals(that.listPosition) : that.listPosition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + customPropertyId;
        result = 31 * result + (isVisible ? 1 : 0);
        result = 31 * result + (listPosition != null ? listPosition.hashCode() : 0);
        return result;
    }
}
