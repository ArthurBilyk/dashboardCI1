package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_SET", schema = "dbo", catalog = "SpiraTeam")
public class TstTestSetEntity {
    private int testSetId;
    private String name;
    private String description;
    private String indentLevel;
    private Timestamp creationDate;
    private Timestamp plannedDate;
    private Timestamp lastUpdateDate;
    private String folderYn;
    private String attachmentsYn;
    private boolean isDeleted;
    private Timestamp concurrencyDate;

    @Id
    @Column(name = "TEST_SET_ID", nullable = false, insertable = true, updatable = true)
    public int getTestSetId() {
        return testSetId;
    }

    public void setTestSetId(int testSetId) {
        this.testSetId = testSetId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "INDENT_LEVEL", nullable = false, insertable = true, updatable = true)
    public String getIndentLevel() {
        return indentLevel;
    }

    public void setIndentLevel(String indentLevel) {
        this.indentLevel = indentLevel;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "PLANNED_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPlannedDate() {
        return plannedDate;
    }

    public void setPlannedDate(Timestamp plannedDate) {
        this.plannedDate = plannedDate;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "FOLDER_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getFolderYn() {
        return folderYn;
    }

    public void setFolderYn(String folderYn) {
        this.folderYn = folderYn;
    }

    @Basic
    @Column(name = "ATTACHMENTS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAttachmentsYn() {
        return attachmentsYn;
    }

    public void setAttachmentsYn(String attachmentsYn) {
        this.attachmentsYn = attachmentsYn;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "CONCURRENCY_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getConcurrencyDate() {
        return concurrencyDate;
    }

    public void setConcurrencyDate(Timestamp concurrencyDate) {
        this.concurrencyDate = concurrencyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestSetEntity that = (TstTestSetEntity) o;

        if (isDeleted != that.isDeleted) return false;
        if (testSetId != that.testSetId) return false;
        if (attachmentsYn != null ? !attachmentsYn.equals(that.attachmentsYn) : that.attachmentsYn != null)
            return false;
        if (concurrencyDate != null ? !concurrencyDate.equals(that.concurrencyDate) : that.concurrencyDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (folderYn != null ? !folderYn.equals(that.folderYn) : that.folderYn != null) return false;
        if (indentLevel != null ? !indentLevel.equals(that.indentLevel) : that.indentLevel != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (plannedDate != null ? !plannedDate.equals(that.plannedDate) : that.plannedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testSetId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (indentLevel != null ? indentLevel.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (plannedDate != null ? plannedDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (folderYn != null ? folderYn.hashCode() : 0);
        result = 31 * result + (attachmentsYn != null ? attachmentsYn.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (concurrencyDate != null ? concurrencyDate.hashCode() : 0);
        return result;
    }
}
