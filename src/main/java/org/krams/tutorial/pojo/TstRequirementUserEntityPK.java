package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstRequirementUserEntityPK implements Serializable {
    private int requirementId;
    private int userId;

    @Column(name = "REQUIREMENT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementUserEntityPK that = (TstRequirementUserEntityPK) o;

        if (requirementId != that.requirementId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementId;
        result = 31 * result + userId;
        return result;
    }
}
