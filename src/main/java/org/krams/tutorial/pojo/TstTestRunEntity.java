package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_RUN", schema = "dbo", catalog = "SpiraTeam")
public class TstTestRunEntity {
    private int testRunId;
    private Timestamp startDate;
    private String name;
    private String description;
    private Timestamp endDate;
    private String runnerName;
    private Integer estimatedDuration;
    private Integer actualDuration;
    private Integer runnerAssertCount;
    private String runnerTestName;
    private String runnerMessage;
    private String runnerStackTrace;
    private String attachmentsYn;
    private boolean isDeleted;

    @Id
    @Column(name = "TEST_RUN_ID", nullable = false, insertable = true, updatable = true)
    public int getTestRunId() {
        return testRunId;
    }

    public void setTestRunId(int testRunId) {
        this.testRunId = testRunId;
    }

    @Basic
    @Column(name = "START_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
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
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "RUNNER_NAME", nullable = true, insertable = true, updatable = true)
    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    @Basic
    @Column(name = "ESTIMATED_DURATION", nullable = true, insertable = true, updatable = true)
    public Integer getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Integer estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    @Basic
    @Column(name = "ACTUAL_DURATION", nullable = true, insertable = true, updatable = true)
    public Integer getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Integer actualDuration) {
        this.actualDuration = actualDuration;
    }

    @Basic
    @Column(name = "RUNNER_ASSERT_COUNT", nullable = true, insertable = true, updatable = true)
    public Integer getRunnerAssertCount() {
        return runnerAssertCount;
    }

    public void setRunnerAssertCount(Integer runnerAssertCount) {
        this.runnerAssertCount = runnerAssertCount;
    }

    @Basic
    @Column(name = "RUNNER_TEST_NAME", nullable = true, insertable = true, updatable = true)
    public String getRunnerTestName() {
        return runnerTestName;
    }

    public void setRunnerTestName(String runnerTestName) {
        this.runnerTestName = runnerTestName;
    }

    @Basic
    @Column(name = "RUNNER_MESSAGE", nullable = true, insertable = true, updatable = true)
    public String getRunnerMessage() {
        return runnerMessage;
    }

    public void setRunnerMessage(String runnerMessage) {
        this.runnerMessage = runnerMessage;
    }

    @Basic
    @Column(name = "RUNNER_STACK_TRACE", nullable = true, insertable = true, updatable = true)
    public String getRunnerStackTrace() {
        return runnerStackTrace;
    }

    public void setRunnerStackTrace(String runnerStackTrace) {
        this.runnerStackTrace = runnerStackTrace;
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

        TstTestRunEntity that = (TstTestRunEntity) o;

        if (isDeleted != that.isDeleted) return false;
        if (testRunId != that.testRunId) return false;
        if (actualDuration != null ? !actualDuration.equals(that.actualDuration) : that.actualDuration != null)
            return false;
        if (attachmentsYn != null ? !attachmentsYn.equals(that.attachmentsYn) : that.attachmentsYn != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (estimatedDuration != null ? !estimatedDuration.equals(that.estimatedDuration) : that.estimatedDuration != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (runnerAssertCount != null ? !runnerAssertCount.equals(that.runnerAssertCount) : that.runnerAssertCount != null)
            return false;
        if (runnerMessage != null ? !runnerMessage.equals(that.runnerMessage) : that.runnerMessage != null)
            return false;
        if (runnerName != null ? !runnerName.equals(that.runnerName) : that.runnerName != null) return false;
        if (runnerStackTrace != null ? !runnerStackTrace.equals(that.runnerStackTrace) : that.runnerStackTrace != null)
            return false;
        if (runnerTestName != null ? !runnerTestName.equals(that.runnerTestName) : that.runnerTestName != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testRunId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (runnerName != null ? runnerName.hashCode() : 0);
        result = 31 * result + (estimatedDuration != null ? estimatedDuration.hashCode() : 0);
        result = 31 * result + (actualDuration != null ? actualDuration.hashCode() : 0);
        result = 31 * result + (runnerAssertCount != null ? runnerAssertCount.hashCode() : 0);
        result = 31 * result + (runnerTestName != null ? runnerTestName.hashCode() : 0);
        result = 31 * result + (runnerMessage != null ? runnerMessage.hashCode() : 0);
        result = 31 * result + (runnerStackTrace != null ? runnerStackTrace.hashCode() : 0);
        result = 31 * result + (attachmentsYn != null ? attachmentsYn.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        return result;
    }
}
