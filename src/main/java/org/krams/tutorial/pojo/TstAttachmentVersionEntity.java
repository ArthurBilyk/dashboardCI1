package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ATTACHMENT_VERSION", schema = "dbo", catalog = "SpiraTeam")
public class TstAttachmentVersionEntity {
    private int attachmentVersionId;
    private String filename;
    private String description;
    private Timestamp uploadDate;
    private int size;
    private String versionNumber;
    private String currentYn;

    @Id
    @Column(name = "ATTACHMENT_VERSION_ID", nullable = false, insertable = true, updatable = true)
    public int getAttachmentVersionId() {
        return attachmentVersionId;
    }

    public void setAttachmentVersionId(int attachmentVersionId) {
        this.attachmentVersionId = attachmentVersionId;
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
    @Column(name = "SIZE", nullable = false, insertable = true, updatable = true)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "VERSION_NUMBER", nullable = false, insertable = true, updatable = true)
    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Basic
    @Column(name = "CURRENT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getCurrentYn() {
        return currentYn;
    }

    public void setCurrentYn(String currentYn) {
        this.currentYn = currentYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstAttachmentVersionEntity that = (TstAttachmentVersionEntity) o;

        if (attachmentVersionId != that.attachmentVersionId) return false;
        if (size != that.size) return false;
        if (currentYn != null ? !currentYn.equals(that.currentYn) : that.currentYn != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (uploadDate != null ? !uploadDate.equals(that.uploadDate) : that.uploadDate != null) return false;
        if (versionNumber != null ? !versionNumber.equals(that.versionNumber) : that.versionNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attachmentVersionId;
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (uploadDate != null ? uploadDate.hashCode() : 0);
        result = 31 * result + size;
        result = 31 * result + (versionNumber != null ? versionNumber.hashCode() : 0);
        result = 31 * result + (currentYn != null ? currentYn.hashCode() : 0);
        return result;
    }
}
