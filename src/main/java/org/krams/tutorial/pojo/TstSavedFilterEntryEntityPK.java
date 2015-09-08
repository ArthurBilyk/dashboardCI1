package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstSavedFilterEntryEntityPK implements Serializable {
    private int savedFilterId;
    private String entryKey;

    @Column(name = "SAVED_FILTER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getSavedFilterId() {
        return savedFilterId;
    }

    public void setSavedFilterId(int savedFilterId) {
        this.savedFilterId = savedFilterId;
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

        TstSavedFilterEntryEntityPK that = (TstSavedFilterEntryEntityPK) o;

        if (savedFilterId != that.savedFilterId) return false;
        if (entryKey != null ? !entryKey.equals(that.entryKey) : that.entryKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = savedFilterId;
        result = 31 * result + (entryKey != null ? entryKey.hashCode() : 0);
        return result;
    }
}
