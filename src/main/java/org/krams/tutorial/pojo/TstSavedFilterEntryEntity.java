package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_SAVED_FILTER_ENTRY", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstSavedFilterEntryEntityPK.class)
public class TstSavedFilterEntryEntity {
    private int savedFilterId;
    private String entryKey;
    private String entryValue;
    private int entryTypeCode;

    @Id
    @Column(name = "SAVED_FILTER_ID", nullable = false, insertable = true, updatable = true)
    public int getSavedFilterId() {
        return savedFilterId;
    }

    public void setSavedFilterId(int savedFilterId) {
        this.savedFilterId = savedFilterId;
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

        TstSavedFilterEntryEntity that = (TstSavedFilterEntryEntity) o;

        if (entryTypeCode != that.entryTypeCode) return false;
        if (savedFilterId != that.savedFilterId) return false;
        if (entryKey != null ? !entryKey.equals(that.entryKey) : that.entryKey != null) return false;
        if (entryValue != null ? !entryValue.equals(that.entryValue) : that.entryValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = savedFilterId;
        result = 31 * result + (entryKey != null ? entryKey.hashCode() : 0);
        result = 31 * result + (entryValue != null ? entryValue.hashCode() : 0);
        result = 31 * result + entryTypeCode;
        return result;
    }
}
