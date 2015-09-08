package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstRequirementTestCaseEntityPK implements Serializable {
    private int requirementId;
    private int testCaseId;

    @Column(name = "REQUIREMENT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    @Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementTestCaseEntityPK that = (TstRequirementTestCaseEntityPK) o;

        if (requirementId != that.requirementId) return false;
        if (testCaseId != that.testCaseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementId;
        result = 31 * result + testCaseId;
        return result;
    }
}
