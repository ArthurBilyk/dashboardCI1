package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstProjectGroupUserEntityPK implements Serializable {
    private int projectGroupId;
    private int userId;
    private int projectGroupRoleId;

    @Column(name = "PROJECT_GROUP_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(int projectGroupId) {
        this.projectGroupId = projectGroupId;
    }

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "PROJECT_GROUP_ROLE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectGroupRoleId() {
        return projectGroupRoleId;
    }

    public void setProjectGroupRoleId(int projectGroupRoleId) {
        this.projectGroupRoleId = projectGroupRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectGroupUserEntityPK that = (TstProjectGroupUserEntityPK) o;

        if (projectGroupId != that.projectGroupId) return false;
        if (projectGroupRoleId != that.projectGroupRoleId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectGroupId;
        result = 31 * result + userId;
        result = 31 * result + projectGroupRoleId;
        return result;
    }
}
