package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_SAVED_FILTER", schema = "dbo", catalog = "SpiraTeam")
public class TstSavedFilterEntity {
    private int savedFilterId;
    private String name;
    private boolean isShared;

    @Id
    @Column(name = "SAVED_FILTER_ID", nullable = false, insertable = true, updatable = true)
    public int getSavedFilterId() {
        return savedFilterId;
    }

    public void setSavedFilterId(int savedFilterId) {
        this.savedFilterId = savedFilterId;
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
    @Column(name = "IS_SHARED", nullable = false, insertable = true, updatable = true)
    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean isShared) {
        this.isShared = isShared;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstSavedFilterEntity that = (TstSavedFilterEntity) o;

        if (isShared != that.isShared) return false;
        if (savedFilterId != that.savedFilterId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = savedFilterId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isShared ? 1 : 0);
        return result;
    }
}
