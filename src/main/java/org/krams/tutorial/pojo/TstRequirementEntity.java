package org.krams.tutorial.pojo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@javax.persistence.Table(name = "TST_REQUIREMENT", schema = "dbo", catalog = "SpiraTeam")
public class TstRequirementEntity {
    private int requirementId;

    @Id
    @javax.persistence.Column(name = "REQUIREMENT_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
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

    private Timestamp creationDate;

    @Basic
    @javax.persistence.Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
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

    private Timestamp lastUpdateDate;

    @Basic
    @javax.persistence.Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    private boolean isSummary;

    @Basic
    @javax.persistence.Column(name = "IS_SUMMARY", nullable = false, insertable = true, updatable = true)
    public boolean isSummary() {
        return isSummary;
    }

    public void setSummary(boolean isSummary) {
        this.isSummary = isSummary;
    }

    private boolean isAttachments;

    @Basic
    @javax.persistence.Column(name = "IS_ATTACHMENTS", nullable = false, insertable = true, updatable = true)
    public boolean isAttachments() {
        return isAttachments;
    }

    public void setAttachments(boolean isAttachments) {
        this.isAttachments = isAttachments;
    }

    private int coverageCountTotal;

    @Basic
    @javax.persistence.Column(name = "COVERAGE_COUNT_TOTAL", nullable = false, insertable = true, updatable = true)
    public int getCoverageCountTotal() {
        return coverageCountTotal;
    }

    public void setCoverageCountTotal(int coverageCountTotal) {
        this.coverageCountTotal = coverageCountTotal;
    }

    private int coverageCountPassed;

    @Basic
    @javax.persistence.Column(name = "COVERAGE_COUNT_PASSED", nullable = false, insertable = true, updatable = true)
    public int getCoverageCountPassed() {
        return coverageCountPassed;
    }

    public void setCoverageCountPassed(int coverageCountPassed) {
        this.coverageCountPassed = coverageCountPassed;
    }

    private int coverageCountFailed;

    @Basic
    @javax.persistence.Column(name = "COVERAGE_COUNT_FAILED", nullable = false, insertable = true, updatable = true)
    public int getCoverageCountFailed() {
        return coverageCountFailed;
    }

    public void setCoverageCountFailed(int coverageCountFailed) {
        this.coverageCountFailed = coverageCountFailed;
    }

    private int coverageCountCaution;

    @Basic
    @javax.persistence.Column(name = "COVERAGE_COUNT_CAUTION", nullable = false, insertable = true, updatable = true)
    public int getCoverageCountCaution() {
        return coverageCountCaution;
    }

    public void setCoverageCountCaution(int coverageCountCaution) {
        this.coverageCountCaution = coverageCountCaution;
    }

    private int coverageCountBlocked;

    @Basic
    @javax.persistence.Column(name = "COVERAGE_COUNT_BLOCKED", nullable = false, insertable = true, updatable = true)
    public int getCoverageCountBlocked() {
        return coverageCountBlocked;
    }

    public void setCoverageCountBlocked(int coverageCountBlocked) {
        this.coverageCountBlocked = coverageCountBlocked;
    }

    private BigDecimal estimatePoints;

    @Basic
    @javax.persistence.Column(name = "ESTIMATE_POINTS", nullable = true, insertable = true, updatable = true, precision = 1)
    public BigDecimal getEstimatePoints() {
        return estimatePoints;
    }

    public void setEstimatePoints(BigDecimal estimatePoints) {
        this.estimatePoints = estimatePoints;
    }

    private Integer estimatedEffort;

    @Basic
    @javax.persistence.Column(name = "ESTIMATED_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getEstimatedEffort() {
        return estimatedEffort;
    }

    public void setEstimatedEffort(Integer estimatedEffort) {
        this.estimatedEffort = estimatedEffort;
    }

    private int taskCount;

    @Basic
    @javax.persistence.Column(name = "TASK_COUNT", nullable = false, insertable = true, updatable = true)
    public int getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    private Integer taskEstimatedEffort;

    @Basic
    @javax.persistence.Column(name = "TASK_ESTIMATED_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getTaskEstimatedEffort() {
        return taskEstimatedEffort;
    }

    public void setTaskEstimatedEffort(Integer taskEstimatedEffort) {
        this.taskEstimatedEffort = taskEstimatedEffort;
    }

    private Integer taskActualEffort;

    @Basic
    @javax.persistence.Column(name = "TASK_ACTUAL_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getTaskActualEffort() {
        return taskActualEffort;
    }

    public void setTaskActualEffort(Integer taskActualEffort) {
        this.taskActualEffort = taskActualEffort;
    }

    private Integer taskProjectedEffort;

    @Basic
    @javax.persistence.Column(name = "TASK_PROJECTED_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getTaskProjectedEffort() {
        return taskProjectedEffort;
    }

    public void setTaskProjectedEffort(Integer taskProjectedEffort) {
        this.taskProjectedEffort = taskProjectedEffort;
    }

    private Integer taskRemainingEffort;

    @Basic
    @javax.persistence.Column(name = "TASK_REMAINING_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getTaskRemainingEffort() {
        return taskRemainingEffort;
    }

    public void setTaskRemainingEffort(Integer taskRemainingEffort) {
        this.taskRemainingEffort = taskRemainingEffort;
    }

    private int taskPercentOnTime;

    @Basic
    @javax.persistence.Column(name = "TASK_PERCENT_ON_TIME", nullable = false, insertable = true, updatable = true)
    public int getTaskPercentOnTime() {
        return taskPercentOnTime;
    }

    public void setTaskPercentOnTime(int taskPercentOnTime) {
        this.taskPercentOnTime = taskPercentOnTime;
    }

    private int taskPercentLateFinish;

    @Basic
    @javax.persistence.Column(name = "TASK_PERCENT_LATE_FINISH", nullable = false, insertable = true, updatable = true)
    public int getTaskPercentLateFinish() {
        return taskPercentLateFinish;
    }

    public void setTaskPercentLateFinish(int taskPercentLateFinish) {
        this.taskPercentLateFinish = taskPercentLateFinish;
    }

    private int taskPercentNotStart;

    @Basic
    @javax.persistence.Column(name = "TASK_PERCENT_NOT_START", nullable = false, insertable = true, updatable = true)
    public int getTaskPercentNotStart() {
        return taskPercentNotStart;
    }

    public void setTaskPercentNotStart(int taskPercentNotStart) {
        this.taskPercentNotStart = taskPercentNotStart;
    }

    private int taskPercentLateStart;

    @Basic
    @javax.persistence.Column(name = "TASK_PERCENT_LATE_START", nullable = false, insertable = true, updatable = true)
    public int getTaskPercentLateStart() {
        return taskPercentLateStart;
    }

    public void setTaskPercentLateStart(int taskPercentLateStart) {
        this.taskPercentLateStart = taskPercentLateStart;
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

        TstRequirementEntity that = (TstRequirementEntity) o;

        if (coverageCountBlocked != that.coverageCountBlocked) return false;
        if (coverageCountCaution != that.coverageCountCaution) return false;
        if (coverageCountFailed != that.coverageCountFailed) return false;
        if (coverageCountPassed != that.coverageCountPassed) return false;
        if (coverageCountTotal != that.coverageCountTotal) return false;
        if (isAttachments != that.isAttachments) return false;
        if (isDeleted != that.isDeleted) return false;
        if (isSummary != that.isSummary) return false;
        if (requirementId != that.requirementId) return false;
        if (taskCount != that.taskCount) return false;
        if (taskPercentLateFinish != that.taskPercentLateFinish) return false;
        if (taskPercentLateStart != that.taskPercentLateStart) return false;
        if (taskPercentNotStart != that.taskPercentNotStart) return false;
        if (taskPercentOnTime != that.taskPercentOnTime) return false;
        if (concurrencyDate != null ? !concurrencyDate.equals(that.concurrencyDate) : that.concurrencyDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (estimatePoints != null ? !estimatePoints.equals(that.estimatePoints) : that.estimatePoints != null)
            return false;
        if (estimatedEffort != null ? !estimatedEffort.equals(that.estimatedEffort) : that.estimatedEffort != null)
            return false;
        if (indentLevel != null ? !indentLevel.equals(that.indentLevel) : that.indentLevel != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (taskActualEffort != null ? !taskActualEffort.equals(that.taskActualEffort) : that.taskActualEffort != null)
            return false;
        if (taskEstimatedEffort != null ? !taskEstimatedEffort.equals(that.taskEstimatedEffort) : that.taskEstimatedEffort != null)
            return false;
        if (taskProjectedEffort != null ? !taskProjectedEffort.equals(that.taskProjectedEffort) : that.taskProjectedEffort != null)
            return false;
        if (taskRemainingEffort != null ? !taskRemainingEffort.equals(that.taskRemainingEffort) : that.taskRemainingEffort != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (indentLevel != null ? indentLevel.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (isSummary ? 1 : 0);
        result = 31 * result + (isAttachments ? 1 : 0);
        result = 31 * result + coverageCountTotal;
        result = 31 * result + coverageCountPassed;
        result = 31 * result + coverageCountFailed;
        result = 31 * result + coverageCountCaution;
        result = 31 * result + coverageCountBlocked;
        result = 31 * result + (estimatePoints != null ? estimatePoints.hashCode() : 0);
        result = 31 * result + (estimatedEffort != null ? estimatedEffort.hashCode() : 0);
        result = 31 * result + taskCount;
        result = 31 * result + (taskEstimatedEffort != null ? taskEstimatedEffort.hashCode() : 0);
        result = 31 * result + (taskActualEffort != null ? taskActualEffort.hashCode() : 0);
        result = 31 * result + (taskProjectedEffort != null ? taskProjectedEffort.hashCode() : 0);
        result = 31 * result + (taskRemainingEffort != null ? taskRemainingEffort.hashCode() : 0);
        result = 31 * result + taskPercentOnTime;
        result = 31 * result + taskPercentLateFinish;
        result = 31 * result + taskPercentNotStart;
        result = 31 * result + taskPercentLateStart;
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (concurrencyDate != null ? concurrencyDate.hashCode() : 0);
        return result;
    }
}
