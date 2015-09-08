package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_USER", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstRequirementUserEntityPK.class)
public class TstRequirementUserEntity {
    private int requirementId;
    private int userId;
    private boolean isExpanded;
    private boolean isVisible;

    @Id
    @Column(name = "REQUIREMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "IS_EXPANDED", nullable = false, insertable = true, updatable = true)
    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    @Basic
    @Column(name = "IS_VISIBLE", nullable = false, insertable = true, updatable = true)
    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementUserEntity that = (TstRequirementUserEntity) o;

        if (isExpanded != that.isExpanded) return false;
        if (isVisible != that.isVisible) return false;
        if (requirementId != that.requirementId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementId;
        result = 31 * result + userId;
        result = 31 * result + (isExpanded ? 1 : 0);
        result = 31 * result + (isVisible ? 1 : 0);
        return result;
    }
}
