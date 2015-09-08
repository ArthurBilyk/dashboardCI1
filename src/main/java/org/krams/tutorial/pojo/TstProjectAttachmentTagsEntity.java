package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_ATTACHMENT_TAGS", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstProjectAttachmentTagsEntityPK.class)
public class TstProjectAttachmentTagsEntity {
    private int projectId;
    private String name;
    private int frequency;

    @Id
    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Id
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "FREQUENCY", nullable = false, insertable = true, updatable = true)
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectAttachmentTagsEntity that = (TstProjectAttachmentTagsEntity) o;

        if (frequency != that.frequency) return false;
        if (projectId != that.projectId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + frequency;
        return result;
    }
}
