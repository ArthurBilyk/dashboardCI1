package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstProjectRolePermissionEntityPK implements Serializable {
    private int projectRoleId;
    private int artifactTypeId;
    private int permissionId;

    @Column(name = "PROJECT_ROLE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectRoleId() {
        return projectRoleId;
    }

    public void setProjectRoleId(int projectRoleId) {
        this.projectRoleId = projectRoleId;
    }

    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    @Column(name = "PERMISSION_ID", nullable = false, insertable = true, updatable = true)
    @Id
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

        TstProjectRolePermissionEntityPK that = (TstProjectRolePermissionEntityPK) o;

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
