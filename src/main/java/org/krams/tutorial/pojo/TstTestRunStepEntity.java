package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_RUN_STEP", schema = "dbo", catalog = "SpiraTeam")
public class TstTestRunStepEntity {
    private int testRunStepId;
    private String description;
    private int position;
    private String expectedResult;
    private String sampleData;
    private String actualResult;

    @Id
    @Column(name = "TEST_RUN_STEP_ID", nullable = false, insertable = true, updatable = true)
    public int getTestRunStepId() {
        return testRunStepId;
    }

    public void setTestRunStepId(int testRunStepId) {
        this.testRunStepId = testRunStepId;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "POSITION", nullable = false, insertable = true, updatable = true)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Basic
    @Column(name = "EXPECTED_RESULT", nullable = true, insertable = true, updatable = true)
    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Basic
    @Column(name = "SAMPLE_DATA", nullable = true, insertable = true, updatable = true)
    public String getSampleData() {
        return sampleData;
    }

    public void setSampleData(String sampleData) {
        this.sampleData = sampleData;
    }

    @Basic
    @Column(name = "ACTUAL_RESULT", nullable = true, insertable = true, updatable = true)
    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestRunStepEntity that = (TstTestRunStepEntity) o;

        if (position != that.position) return false;
        if (testRunStepId != that.testRunStepId) return false;
        if (actualResult != null ? !actualResult.equals(that.actualResult) : that.actualResult != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (expectedResult != null ? !expectedResult.equals(that.expectedResult) : that.expectedResult != null)
            return false;
        if (sampleData != null ? !sampleData.equals(that.sampleData) : that.sampleData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testRunStepId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + position;
        result = 31 * result + (expectedResult != null ? expectedResult.hashCode() : 0);
        result = 31 * result + (sampleData != null ? sampleData.hashCode() : 0);
        result = 31 * result + (actualResult != null ? actualResult.hashCode() : 0);
        return result;
    }
}
