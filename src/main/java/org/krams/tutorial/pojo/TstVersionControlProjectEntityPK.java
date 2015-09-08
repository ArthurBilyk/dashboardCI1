package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstVersionControlProjectEntityPK implements Serializable {
    private int versionControlSystemId;
    private int projectId;

    @Column(name = "VERSION_CONTROL_SYSTEM_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getVersionControlSystemId() {
        return versionControlSystemId;
    }

    public void setVersionControlSystemId(int versionControlSystemId) {
        this.versionControlSystemId = versionControlSystemId;
    }

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstVersionControlProjectEntityPK that = (TstVersionControlProjectEntityPK) o;

        if (projectId != that.projectId) return false;
        if (versionControlSystemId != that.versionControlSystemId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = versionControlSystemId;
        result = 31 * result + projectId;
        return result;
    }
}
