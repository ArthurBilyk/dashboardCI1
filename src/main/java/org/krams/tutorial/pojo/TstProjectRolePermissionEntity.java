package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_ROLE_PERMISSION", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstProjectRolePermissionEntityPK.class)
public class TstProjectRolePermissionEntity {
    private int projectRoleId;
    private int artifactTypeId;
    private int permissionId;

    @Id
    @Column(name = "PROJECT_ROLE_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectRoleId() {
        return projectRoleId;
    }

    public void setProjectRoleId(int projectRoleId) {
        this.projectRoleId = projectRoleId;
    }

    @Id
    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    @Id
    @Column(name = "PERMISSION_ID", nullable = false, insertable = true, updatable = true)
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectRolePermissionEntity that = (TstProjectRolePermissionEntity) o;

        if (artifactTypeId != that.artifactTypeId) return false;
        if (permissionId != that.permissionId) return false;
        if (projectRoleId != that.projectRoleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectRoleId;
        result = 31 * result + artifactTypeId;
        result = 31 * result + permissionId;
        return result;
    }
}
