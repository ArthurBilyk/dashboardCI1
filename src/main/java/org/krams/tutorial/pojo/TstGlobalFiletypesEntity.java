package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_GLOBAL_FILETYPES", schema = "dbo", catalog = "SpiraTeam")
public class TstGlobalFiletypesEntity {
    private int filetypeId;
    private String filetypeMime;
    private String filetypeIcon;
    private String fileExtension;
    private String fileDescription;

    @Id
    @Column(name = "FILETYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(int filetypeId) {
        this.filetypeId = filetypeId;
    }

    @Basic
    @Column(name = "FILETYPE_MIME", nullable = false, insertable = true, updatable = true)
    public String getFiletypeMime() {
        return filetypeMime;
    }

    public void setFiletypeMime(String filetypeMime) {
        this.filetypeMime = filetypeMime;
    }

    @Basic
    @Column(name = "FILETYPE_ICON", nullable = false, insertable = true, updatable = true)
    public String getFiletypeIcon() {
        return filetypeIcon;
    }

    public void setFiletypeIcon(String filetypeIcon) {
        this.filetypeIcon = filetypeIcon;
    }

    @Basic
    @Column(name = "FILE_EXTENSION", nullable = false, insertable = true, updatable = true)
    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Basic
    @Column(name = "FILE_DESCRIPTION", nullable = false, insertable = true, updatable = true)
    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstGlobalFiletypesEntity that = (TstGlobalFiletypesEntity) o;

        if (filetypeId != that.filetypeId) return false;
        if (fileDescription != null ? !fileDescription.equals(that.fileDescription) : that.fileDescription != null)
            return false;
        if (fileExtension != null ? !fileExtension.equals(that.fileExtension) : that.fileExtension != null)
            return false;
        if (filetypeIcon != null ? !filetypeIcon.equals(that.filetypeIcon) : that.filetypeIcon != null) return false;
        if (filetypeMime != null ? !filetypeMime.equals(that.filetypeMime) : that.filetypeMime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filetypeId;
        result = 31 * result + (filetypeMime != null ? filetypeMime.hashCode() : 0);
        result = 31 * result + (filetypeIcon != null ? filetypeIcon.hashCode() : 0);
        result = 31 * result + (fileExtension != null ? fileExtension.hashCode() : 0);
        result = 31 * result + (fileDescription != null ? fileDescription.hashCode() : 0);
        return result;
    }
}
