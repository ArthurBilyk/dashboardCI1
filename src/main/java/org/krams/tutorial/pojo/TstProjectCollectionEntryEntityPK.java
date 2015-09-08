package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstProjectCollectionEntryEntityPK implements Serializable {
    private int userId;

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int projectId;

    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    private int projectCollectionId;

    @Column(name = "PROJECT_COLLECTION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectCollectionId() {
        return projectCollectionId;
    }

    public void setProjectCollectionId(int projectCollectionId) {
        this.projectCollectionId = projectCollectionId;
    }

    private String entryKey;

    @Column(name = "ENTRY_KEY", nullable = false, insertable = true, updatable = true)
    @Id
    public String getEntryKey() {
        return entryKey;
    }

    public void setEntryKey(String entryKey) {
        this.entryKey = entryKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectCollectionEntryEntityPK that = (TstProjectCollectionEntryEntityPK) o;

        if (projectCollectionId != that.projectCollectionId) return false;
        if (projectId != that.projectId) return false;
        if (userId != that.userId) return false;
        if (entryKey != null ? !entryKey.equals(that.entryKey) : that.entryKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + projectId;
        result = 31 * result + projectCollectionId;
        result = 31 * result + (entryKey != null ? entryKey.hashCode() : 0);
        return result;
    }
}
