package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_SET_STATUS", schema = "dbo", catalog = "SpiraTeam")
public class TstTestSetStatusEntity {
    private int testSetStatusId;
    private String name;
    private String activeYn;

    @Id
    @Column(name = "TEST_SET_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getTestSetStatusId() {
        return testSetStatusId;
    }

    public void setTestSetStatusId(int testSetStatusId) {
        this.testSetStatusId = testSetStatusId;
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
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestSetStatusEntity that = (TstTestSetStatusEntity) o;

        if (testSetStatusId != that.testSetStatusId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testSetStatusId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        return result;
    }
}
