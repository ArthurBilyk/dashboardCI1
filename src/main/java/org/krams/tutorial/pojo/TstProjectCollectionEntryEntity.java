package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_COLLECTION_ENTRY", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstProjectCollectionEntryEntityPK.class)
public class TstProjectCollectionEntryEntity {
    private int userId;
    private int projectId;
    private int projectCollectionId;
    private String entryKey;
    private String entryValue;
    private int entryTypeCode;

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Id
    @Column(name = "PROJECT_COLLECTION_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectCollectionId() {
        return projectCollectionId;
    }

    public void setProjectCollectionId(int projectCollectionId) {
        this.projectCollectionId = projectCollectionId;
    }

    @Id
    @Column(name = "ENTRY_KEY", nullable = false, insertable = true, updatable = true)
    public String getEntryKey() {
        return entryKey;
    }

    public void setEntryKey(String entryKey) {
        this.entryKey = entryKey;
    }

    @Basic
    @Column(name = "ENTRY_VALUE", nullable = false, insertable = true, updatable = true)
    public String getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(String entryValue) {
        this.entryValue = entryValue;
    }

    @Basic
    @Column(name = "ENTRY_TYPE_CODE", nullable = false, insertable = true, updatable = true)
    public int getEntryTypeCode() {
        return entryTypeCode;
    }

    public void setEntryTypeCode(int entryTypeCode) {
        this.entryTypeCode = entryTypeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectCollectionEntryEntity that = (TstProjectCollectionEntryEntity) o;

        if (entryTypeCode != that.entryTypeCode) return false;
        if (projectCollectionId != that.projectCollectionId) return false;
        if (projectId != that.projectId) return false;
        if (userId != that.userId) return false;
        if (entryKey != null ? !entryKey.equals(that.entryKey) : that.entryKey != null) return false;
        if (entryValue != null ? !entryValue.equals(that.entryValue) : that.entryValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + projectId;
        result = 31 * result + projectCollectionId;
        result = 31 * result + (entryKey != null ? entryKey.hashCode() : 0);
        result = 31 * result + (entryValue != null ? entryValue.hashCode() : 0);
        result = 31 * result + entryTypeCode;
        return result;
    }
}
