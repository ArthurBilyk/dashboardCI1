package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_ATTACHMENT_FOLDER", schema = "dbo", catalog = "SpiraTeam")
public class TstProjectAttachmentFolderEntity {
    private int projectAttachmentFolderId;
    private String name;

    @Id
    @Column(name = "PROJECT_ATTACHMENT_FOLDER_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectAttachmentFolderId() {
        return projectAttachmentFolderId;
    }

    public void setProjectAttachmentFolderId(int projectAttachmentFolderId) {
        this.projectAttachmentFolderId = projectAttachmentFolderId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
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

        TstProjectAttachmentFolderEntity that = (TstProjectAttachmentFolderEntity) o;

        if (projectAttachmentFolderId != that.projectAttachmentFolderId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectAttachmentFolderId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
