package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_SET_TEST_CASE_PARAMETER", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstTestSetTestCaseParameterEntityPK.class)
public class TstTestSetTestCaseParameterEntity {
    private int testSetTestCaseId;
    private int testCaseParameterId;
    private String value;

    @Id
    @Column(name = "TEST_SET_TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    public int getTestSetTestCaseId() {
        return testSetTestCaseId;
    }

    public void setTestSetTestCaseId(int testSetTestCaseId) {
        this.testSetTestCaseId = testSetTestCaseId;
    }

    @Id
    @Column(name = "TEST_CASE_PARAMETER_ID", nullable = false, insertable = true, updatable = true)
    public int getTestCaseParameterId() {
        return testCaseParameterId;
    }

    public void setTestCaseParameterId(int testCaseParameterId) {
        this.testCaseParameterId = testCaseParameterId;
    }

    @Basic
    @Column(name = "VALUE", nullable = false, insertable = true, updatable = true)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestSetTestCaseParameterEntity that = (TstTestSetTestCaseParameterEntity) o;

        if (testCaseParameterId != that.testCaseParameterId) return false;
        if (testSetTestCaseId != that.testSetTestCaseId) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testSetTestCaseId;
        result = 31 * result + testCaseParameterId;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
