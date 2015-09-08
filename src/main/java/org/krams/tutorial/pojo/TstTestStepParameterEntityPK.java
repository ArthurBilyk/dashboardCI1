package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstTestStepParameterEntityPK implements Serializable {
    private int testStepId;
    private int testCaseParameterId;

    @Column(name = "TEST_STEP_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTestStepId() {
        return testStepId;
    }

    public void setTestStepId(int testStepId) {
        this.testStepId = testStepId;
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

        TstTestStepParameterEntityPK that = (TstTestStepParameterEntityPK) o;

        if (testCaseParameterId != that.testCaseParameterId) return false;
        if (testStepId != that.testStepId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testStepId;
        result = 31 * result + testCaseParameterId;
        return result;
    }
}
