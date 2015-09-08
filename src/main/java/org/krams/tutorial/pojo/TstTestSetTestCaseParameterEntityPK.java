package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstTestSetTestCaseParameterEntityPK implements Serializable {
    private int testSetTestCaseId;
    private int testCaseParameterId;

    @Column(name = "TEST_SET_TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTestSetTestCaseId() {
        return testSetTestCaseId;
    }

    public void setTestSetTestCaseId(int testSetTestCaseId) {
        this.testSetTestCaseId = testSetTestCaseId;
    }

    @Column(name = "TEST_CASE_PARAMETER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTestCaseParameterId() {
        return testCaseParameterId;
    }

    public void setTestCaseParameterId(int testCaseParameterId) {
        this.testCaseParameterId = testCaseParameterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestSetTestCaseParameterEntityPK that = (TstTestSetTestCaseParameterEntityPK) o;

        if (testCaseParameterId != that.testCaseParameterId) return false;
        if (testSetTestCaseId != that.testSetTestCaseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testSetTestCaseId;
        result = 31 * result + testCaseParameterId;
        return result;
    }
}
