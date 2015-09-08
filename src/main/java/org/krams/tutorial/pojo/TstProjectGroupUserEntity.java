package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_GROUP_USER", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstProjectGroupUserEntityPK.class)
public class TstProjectGroupUserEntity {
    private int projectGroupId;
    private int userId;
    private int projectGroupRoleId;

    @Id
    @Column(name = "PROJECT_GROUP_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(int projectGroupId) {
        this.projectGroupId = projectGroupId;
    }

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "PROJECT_GROUP_ROLE_ID", nullable = false, insertable = true, updatable = true)
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

        TstProjectGroupUserEntity that = (TstProjectGroupUserEntity) o;

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
