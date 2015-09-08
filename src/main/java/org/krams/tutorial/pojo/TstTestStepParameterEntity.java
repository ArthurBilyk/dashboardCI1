package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_STEP_PARAMETER", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstTestStepParameterEntityPK.class)
public class TstTestStepParameterEntity {
    private int testStepId;
    private int testCaseParameterId;
    private String value;

    @Id
    @Column(name = "TEST_STEP_ID", nullable = false, insertable = true, updatable = true)
    public int getTestStepId() {
        return testStepId;
    }

    public void setTestStepId(int testStepId) {
        this.testStepId = testStepId;
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

        TstTestStepParameterEntity that = (TstTestStepParameterEntity) o;

        if (testCaseParameterId != that.testCaseParameterId) return false;
        if (testStepId != that.testStepId) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testStepId;
        result = 31 * result + testCaseParameterId;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
