package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_SET_TEST_CASE", schema = "dbo", catalog = "SpiraTeam")
public class TstTestSetTestCaseEntity {
    private int testSetTestCaseId;
    private int position;

    @Id
    @Column(name = "TEST_SET_TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    public int getTestSetTestCaseId() {
        return testSetTestCaseId;
    }

    public void setTestSetTestCaseId(int testSetTestCaseId) {
        this.testSetTestCaseId = testSetTestCaseId;
    }

    @Basic
    @Column(name = "POSITION", nullable = false, insertable = true, updatable = true)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestSetTestCaseEntity that = (TstTestSetTestCaseEntity) o;

        if (position != that.position) return false;
        if (testSetTestCaseId != that.testSetTestCaseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testSetTestCaseId;
        result = 31 * result + position;
        return result;
    }
}
