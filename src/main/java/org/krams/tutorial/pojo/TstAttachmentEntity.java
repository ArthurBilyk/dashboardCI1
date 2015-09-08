package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ATTACHMENT", schema = "dbo", catalog = "SpiraTeam")
public class TstAttachmentEntity {
    private int attachmentId;
    private String filename;
    private String description;
    private Timestamp uploadDate;
    private Timestamp editedDate;
    private int size;
    private String currentVersion;
    private String tags;

    @Id
    @Column(name = "ATTACHMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Basic
    @Column(name = "FILENAME", nullable = false, insertable = true, updatable = true)
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "UPLOAD_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Timestamp uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Basic
    @Column(name = "EDITED_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getEditedDate() {
        return editedDate;
    }

    public void setEditedDate(Timestamp editedDate) {
        this.editedDate = editedDate;
    }

    @Basic
    @Column(name = "SIZE", nullable = false, insertable = true, updatable = true)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "CURRENT_VERSION", nullable = false, insertable = true, updatable = true)
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Basic
    @Column(name = "TAGS", nullable = true, insertable = true, updatable = true)
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstAttachmentEntity that = (TstAttachmentEntity) o;

        if (attachmentId != that.attachmentId) return false;
        if (size != that.size) return false;
        if (currentVersion != null ? !currentVersion.equals(that.currentVersion) : that.currentVersion != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (editedDate != null ? !editedDate.equals(that.editedDate) : that.editedDate != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (uploadDate != null ? !uploadDate.equals(that.uploadDate) : that.uploadDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attachmentId;
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (uploadDate != null ? uploadDate.hashCode() : 0);
        result = 31 * result + (editedDate != null ? editedDate.hashCode() : 0);
        result = 31 * result + size;
        result = 31 * result + (currentVersion != null ? currentVersion.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }
}
