package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_IMPORTANCE", schema = "dbo", catalog = "SpiraTeam")
public class TstImportanceEntity {
    private int importanceId;
    private String name;
    private boolean isActive;

    @Id
    @Column(name = "IMPORTANCE_ID", nullable = false, insertable = true, updatable = true)
    public int getImportanceId() {
        return importanceId;
    }

    public void setImportanceId(int importanceId) {
        this.importanceId = importanceId;
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
    @Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstImportanceEntity that = (TstImportanceEntity) o;

        if (importanceId != that.importanceId) return false;
        if (isActive != that.isActive) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = importanceId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
