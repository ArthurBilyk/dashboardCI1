package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstProjectAttachmentTagsEntityPK implements Serializable {
    private int projectId;
    private String name;

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectAttachmentTagsEntityPK that = (TstProjectAttachmentTagsEntityPK) o;

        if (projectId != that.projectId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
