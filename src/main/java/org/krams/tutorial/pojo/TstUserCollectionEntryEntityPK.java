package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstUserCollectionEntryEntityPK implements Serializable {
    private int userCollectionId;
    private int userId;
    private String entryKey;

    @Column(name = "USER_COLLECTION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserCollectionId() {
        return userCollectionId;
    }

    public void setUserCollectionId(int userCollectionId) {
        this.userCollectionId = userCollectionId;
    }

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

        TstUserCollectionEntryEntityPK that = (TstUserCollectionEntryEntityPK) o;

        if (userCollectionId != that.userCollectionId) return false;
        if (userId != that.userId) return false;
        if (entryKey != null ? !entryKey.equals(that.entryKey) : that.entryKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userCollectionId;
        result = 31 * result + userId;
        result = 31 * result + (entryKey != null ? entryKey.hashCode() : 0);
        return result;
    }
}
