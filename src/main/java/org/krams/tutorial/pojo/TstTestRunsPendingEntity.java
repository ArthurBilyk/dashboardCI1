package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_RUNS_PENDING", schema = "dbo", catalog = "SpiraTeam")
public class TstTestRunsPendingEntity {
    private int testRunsPendingId;
    private String name;
    private Timestamp creationDate;
    private Timestamp lastUpdateDate;
    private int countPassed;
    private int countFailed;
    private int countBlocked;
    private int countCaution;
    private int countNotRun;

    @Id
    @Column(name = "TEST_RUNS_PENDING_ID", nullable = false, insertable = true, updatable = true)
    public int getTestRunsPendingId() {
        return testRunsPendingId;
    }

    public void setTestRunsPendingId(int testRunsPendingId) {
        this.testRunsPendingId = testRunsPendingId;
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
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
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
    @Column(name = "COUNT_PASSED", nullable = false, insertable = true, updatable = true)
    public int getCountPassed() {
        return countPassed;
    }

    public void setCountPassed(int countPassed) {
        this.countPassed = countPassed;
    }

    @Basic
    @Column(name = "COUNT_FAILED", nullable = false, insertable = true, updatable = true)
    public int getCountFailed() {
        return countFailed;
    }

    public void setCountFailed(int countFailed) {
        this.countFailed = countFailed;
    }

    @Basic
    @Column(name = "COUNT_BLOCKED", nullable = false, insertable = true, updatable = true)
    public int getCountBlocked() {
        return countBlocked;
    }

    public void setCountBlocked(int countBlocked) {
        this.countBlocked = countBlocked;
    }

    @Basic
    @Column(name = "COUNT_CAUTION", nullable = false, insertable = true, updatable = true)
    public int getCountCaution() {
        return countCaution;
    }

    public void setCountCaution(int countCaution) {
        this.countCaution = countCaution;
    }

    @Basic
    @Column(name = "COUNT_NOT_RUN", nullable = false, insertable = true, updatable = true)
    public int getCountNotRun() {
        return countNotRun;
    }

    public void setCountNotRun(int countNotRun) {
        this.countNotRun = countNotRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestRunsPendingEntity that = (TstTestRunsPendingEntity) o;

        if (countBlocked != that.countBlocked) return false;
        if (countCaution != that.countCaution) return false;
        if (countFailed != that.countFailed) return false;
        if (countNotRun != that.countNotRun) return false;
        if (countPassed != that.countPassed) return false;
        if (testRunsPendingId != that.testRunsPendingId) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testRunsPendingId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + countPassed;
        result = 31 * result + countFailed;
        result = 31 * result + countBlocked;
        result = 31 * result + countCaution;
        result = 31 * result + countNotRun;
        return result;
    }
}
