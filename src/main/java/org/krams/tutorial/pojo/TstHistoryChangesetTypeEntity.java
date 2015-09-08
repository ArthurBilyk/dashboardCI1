package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_HISTORY_CHANGESET_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstHistoryChangesetTypeEntity {
    private int changetypeId;
    private String changeName;

    @Id
    @Column(name = "CHANGETYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getChangetypeId() {
        return changetypeId;
    }

    public void setChangetypeId(int changetypeId) {
        this.changetypeId = changetypeId;
    }

    @Basic
    @Column(name = "CHANGE_NAME", nullable = false, insertable = true, updatable = true)
    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstHistoryChangesetTypeEntity that = (TstHistoryChangesetTypeEntity) o;

        if (changetypeId != that.changetypeId) return false;
        if (changeName != null ? !changeName.equals(that.changeName) : that.changeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = changetypeId;
        result = 31 * result + (changeName != null ? changeName.hashCode() : 0);
        return result;
    }
}
