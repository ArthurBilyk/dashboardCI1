package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_STEP", schema = "dbo", catalog = "SpiraTeam")
public class TstTestStepEntity {
    private int testStepId;
    private String description;
    private int position;
    private String expectedResult;
    private String sampleData;
    private String attachmentsYn;
    private Timestamp lastUpdateDate;
    private boolean isDeleted;

    @Id
    @Column(name = "TEST_STEP_ID", nullable = false, insertable = true, updatable = true)
    public int getTestStepId() {
        return testStepId;
    }

    public void setTestStepId(int testStepId) {
        this.testStepId = testStepId;
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
    @Column(name = "ATTACHMENTS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAttachmentsYn() {
        return attachmentsYn;
    }

    public void setAttachmentsYn(String attachmentsYn) {
        this.attachmentsYn = attachmentsYn;
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
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestStepEntity that = (TstTestStepEntity) o;

        if (isDeleted != that.isDeleted) return false;
        if (position != that.position) return false;
        if (testStepId != that.testStepId) return false;
        if (attachmentsYn != null ? !attachmentsYn.equals(that.attachmentsYn) : that.attachmentsYn != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (expectedResult != null ? !expectedResult.equals(that.expectedResult) : that.expectedResult != null)
            return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (sampleData != null ? !sampleData.equals(that.sampleData) : that.sampleData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testStepId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + position;
        result = 31 * result + (expectedResult != null ? expectedResult.hashCode() : 0);
        result = 31 * result + (sampleData != null ? sampleData.hashCode() : 0);
        result = 31 * result + (attachmentsYn != null ? attachmentsYn.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        return result;
    }
}
