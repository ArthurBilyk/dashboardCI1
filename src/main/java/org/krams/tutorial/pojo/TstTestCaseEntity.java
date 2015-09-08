package org.krams.tutorial.pojo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@javax.persistence.Table(name = "TST_TEST_CASE", schema = "dbo", catalog = "SpiraTeam")
public class TstTestCaseEntity {
    private int testCaseId;

    @Id
    @javax.persistence.Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String indentLevel;

    @Basic
    @javax.persistence.Column(name = "INDENT_LEVEL", nullable = false, insertable = true, updatable = true)
    public String getIndentLevel() {
        return indentLevel;
    }

    public void setIndentLevel(String indentLevel) {
        this.indentLevel = indentLevel;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Timestamp executionDate;

    @Basic
    @javax.persistence.Column(name = "EXECUTION_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Timestamp executionDate) {
        this.executionDate = executionDate;
    }

    private Timestamp creationDate;

    @Basic
    @javax.persistence.Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    private Timestamp lastUpdateDate;

    @Basic
    @javax.persistence.Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    private String folderYn;

    @Basic
    @javax.persistence.Column(name = "FOLDER_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getFolderYn() {
        return folderYn;
    }

    public void setFolderYn(String folderYn) {
        this.folderYn = folderYn;
    }

    private String activeYn;

    @Basic
    @javax.persistence.Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    private Integer folderCountPassed;

    @Basic
    @javax.persistence.Column(name = "FOLDER_COUNT_PASSED", nullable = true, insertable = true, updatable = true)
    public Integer getFolderCountPassed() {
        return folderCountPassed;
    }

    public void setFolderCountPassed(Integer folderCountPassed) {
        this.folderCountPassed = folderCountPassed;
    }

    private Integer folderCountFailed;

    @Basic
    @javax.persistence.Column(name = "FOLDER_COUNT_FAILED", nullable = true, insertable = true, updatable = true)
    public Integer getFolderCountFailed() {
        return folderCountFailed;
    }

    public void setFolderCountFailed(Integer folderCountFailed) {
        this.folderCountFailed = folderCountFailed;
    }

    private String attachmentsYn;

    @Basic
    @javax.persistence.Column(name = "ATTACHMENTS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAttachmentsYn() {
        return attachmentsYn;
    }

    public void setAttachmentsYn(String attachmentsYn) {
        this.attachmentsYn = attachmentsYn;
    }

    private String testStepsYn;

    @Basic
    @javax.persistence.Column(name = "TEST_STEPS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getTestStepsYn() {
        return testStepsYn;
    }

    public void setTestStepsYn(String testStepsYn) {
        this.testStepsYn = testStepsYn;
    }

    private Integer folderCountCaution;

    @Basic
    @javax.persistence.Column(name = "FOLDER_COUNT_CAUTION", nullable = true, insertable = true, updatable = true)
    public Integer getFolderCountCaution() {
        return folderCountCaution;
    }

    public void setFolderCountCaution(Integer folderCountCaution) {
        this.folderCountCaution = folderCountCaution;
    }

    private Integer folderCountBlocked;

    @Basic
    @javax.persistence.Column(name = "FOLDER_COUNT_BLOCKED", nullable = true, insertable = true, updatable = true)
    public Integer getFolderCountBlocked() {
        return folderCountBlocked;
    }

    public void setFolderCountBlocked(Integer folderCountBlocked) {
        this.folderCountBlocked = folderCountBlocked;
    }

    private Integer folderCountNotRun;

    @Basic
    @javax.persistence.Column(name = "FOLDER_COUNT_NOT_RUN", nullable = true, insertable = true, updatable = true)
    public Integer getFolderCountNotRun() {
        return folderCountNotRun;
    }

    public void setFolderCountNotRun(Integer folderCountNotRun) {
        this.folderCountNotRun = folderCountNotRun;
    }

    private Integer folderCountNotApplicable;

    @Basic
    @javax.persistence.Column(name = "FOLDER_COUNT_NOT_APPLICABLE", nullable = true, insertable = true, updatable = true)
    public Integer getFolderCountNotApplicable() {
        return folderCountNotApplicable;
    }

    public void setFolderCountNotApplicable(Integer folderCountNotApplicable) {
        this.folderCountNotApplicable = folderCountNotApplicable;
    }

    private Integer estimatedDuration;

    @Basic
    @javax.persistence.Column(name = "ESTIMATED_DURATION", nullable = true, insertable = true, updatable = true)
    public Integer getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Integer estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    private boolean isDeleted;

    @Basic
    @javax.persistence.Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    private Timestamp concurrencyDate;

    @Basic
    @javax.persistence.Column(name = "CONCURRENCY_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getConcurrencyDate() {
        return concurrencyDate;
    }

    public void setConcurrencyDate(Timestamp concurrencyDate) {
        this.concurrencyDate = concurrencyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestCaseEntity that = (TstTestCaseEntity) o;

        if (isDeleted != that.isDeleted) return false;
        if (testCaseId != that.testCaseId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (attachmentsYn != null ? !attachmentsYn.equals(that.attachmentsYn) : that.attachmentsYn != null)
            return false;
        if (concurrencyDate != null ? !concurrencyDate.equals(that.concurrencyDate) : that.concurrencyDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (estimatedDuration != null ? !estimatedDuration.equals(that.estimatedDuration) : that.estimatedDuration != null)
            return false;
        if (executionDate != null ? !executionDate.equals(that.executionDate) : that.executionDate != null)
            return false;
        if (folderCountBlocked != null ? !folderCountBlocked.equals(that.folderCountBlocked) : that.folderCountBlocked != null)
            return false;
        if (folderCountCaution != null ? !folderCountCaution.equals(that.folderCountCaution) : that.folderCountCaution != null)
            return false;
        if (folderCountFailed != null ? !folderCountFailed.equals(that.folderCountFailed) : that.folderCountFailed != null)
            return false;
        if (folderCountNotApplicable != null ? !folderCountNotApplicable.equals(that.folderCountNotApplicable) : that.folderCountNotApplicable != null)
            return false;
        if (folderCountNotRun != null ? !folderCountNotRun.equals(that.folderCountNotRun) : that.folderCountNotRun != null)
            return false;
        if (folderCountPassed != null ? !folderCountPassed.equals(that.folderCountPassed) : that.folderCountPassed != null)
            return false;
        if (folderYn != null ? !folderYn.equals(that.folderYn) : that.folderYn != null) return false;
        if (indentLevel != null ? !indentLevel.equals(that.indentLevel) : that.indentLevel != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (testStepsYn != null ? !testStepsYn.equals(that.testStepsYn) : that.testStepsYn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testCaseId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (indentLevel != null ? indentLevel.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (executionDate != null ? executionDate.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (folderYn != null ? folderYn.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (folderCountPassed != null ? folderCountPassed.hashCode() : 0);
        result = 31 * result + (folderCountFailed != null ? folderCountFailed.hashCode() : 0);
        result = 31 * result + (attachmentsYn != null ? attachmentsYn.hashCode() : 0);
        result = 31 * result + (testStepsYn != null ? testStepsYn.hashCode() : 0);
        result = 31 * result + (folderCountCaution != null ? folderCountCaution.hashCode() : 0);
        result = 31 * result + (folderCountBlocked != null ? folderCountBlocked.hashCode() : 0);
        result = 31 * result + (folderCountNotRun != null ? folderCountNotRun.hashCode() : 0);
        result = 31 * result + (folderCountNotApplicable != null ? folderCountNotApplicable.hashCode() : 0);
        result = 31 * result + (estimatedDuration != null ? estimatedDuration.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (concurrencyDate != null ? concurrencyDate.hashCode() : 0);
        return result;
    }
}
