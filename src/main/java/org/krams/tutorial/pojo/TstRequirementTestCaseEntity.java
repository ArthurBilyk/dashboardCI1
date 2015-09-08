package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_TEST_CASE", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstRequirementTestCaseEntityPK.class)
public class TstRequirementTestCaseEntity {
    private int requirementId;
    private int testCaseId;

    @Id
    @Column(name = "REQUIREMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    @Id
    @Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
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

        TstRequirementTestCaseEntity that = (TstRequirementTestCaseEntity) o;

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
