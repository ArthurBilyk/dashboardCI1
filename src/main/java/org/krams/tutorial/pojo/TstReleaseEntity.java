package org.krams.tutorial.pojo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@javax.persistence.Table(name = "TST_RELEASE", schema = "dbo", catalog = "SpiraTeam")
public class TstReleaseEntity {
    private int releaseId;

    @Id
    @javax.persistence.Column(name = "RELEASE_ID", nullable = false, insertable = true, updatable = true)
    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
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

    private String versionNumber;

    @Basic
    @javax.persistence.Column(name = "VERSION_NUMBER", nullable = false, insertable = true, updatable = true)
    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
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

    private String indentLevel;

    @Basic
    @javax.persistence.Column(name = "INDENT_LEVEL", nullable = false, insertable = true, updatable = true)
    public String getIndentLevel() {
        return indentLevel;
    }

    public void setIndentLevel(String indentLevel) {
        this.indentLevel = indentLevel;
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

    private String activeYn;

    @Basic
    @javax.persistence.Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    private String summaryYn;

    @Basic
    @javax.persistence.Column(name = "SUMMARY_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getSummaryYn() {
        return summaryYn;
    }

    public void setSummaryYn(String summaryYn) {
        this.summaryYn = summaryYn;
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

    private String iterationYn;

    @Basic
    @javax.persistence.Column(name = "ITERATION_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIterationYn() {
        return iterationYn;
    }

    public void setIterationYn(String iterationYn) {
        this.iterationYn = iterationYn;
    }

    private Timestamp startDate;

    @Basic
    @javax.persistence.Column(name = "START_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    private Timestamp endDate;

    @Basic
    @javax.persistence.Column(name = "END_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    private int resourceCount;

    @Basic
    @javax.persistence.Column(name = "RESOURCE_COUNT", nullable = false, insertable = true, updatable = true)
    public int getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(int resourceCount) {
        this.resourceCount = resourceCount;
    }

    private int daysNonWorking;

    @Basic
    @javax.persistence.Column(name = "DAYS_NON_WORKING", nullable = false, insertable = true, updatable = true)
    public int getDaysNonWorking() {
        return daysNonWorking;
    }

    public void setDaysNonWorking(int daysNonWorking) {
        this.daysNonWorking = daysNonWorking;
    }

    private int plannedEffort;

    @Basic
    @javax.persistence.Column(name = "PLANNED_EFFORT", nullable = false, insertable = true, updatable = true)
    public int getPlannedEffort() {
        return plannedEffort;
    }

    public void setPlannedEffort(int plannedEffort) {
        this.plannedEffort = plannedEffort;
    }

    private int availableEffort;

    @Basic
    @javax.persistence.Column(name = "AVAILABLE_EFFORT", nullable = false, insertable = true, updatable = true)
    public int getAvailableEffort() {
        return availableEffort;
    }

    public void setAvailableEffort(int availableEffort) {
        this.availableEffort = availableEffort;
    }

    private int countBlocked;

    @Basic
    @javax.persistence.Column(name = "COUNT_BLOCKED", nullable = false, insertable = true, updatable = true)
    public int getCountBlocked() {
        return countBlocked;
    }

    public void setCountBlocked(int countBlocked) {
        this.countBlocked = countBlocked;
    }

    private int countCaution;

    @Basic
    @javax.persistence.Column(name = "COUNT_CAUTION", nullable = false, insertable = true, updatable = true)
    public int getCountCaution() {
        return countCaution;
    }

    public void setCountCaution(int countCaution) {
        this.countCaution = countCaution;
    }

    private int countFailed;

    @Basic
    @javax.persistence.Column(name = "COUNT_FAILED", nullable = false, insertable = true, updatable = true)
    public int getCountFailed() {
        return countFailed;
    }

    public void setCountFailed(int countFailed) {
        this.countFailed = countFailed;
    }

    private int countNotApplicable;

    @Basic
    @javax.persistence.Column(name = "COUNT_NOT_APPLICABLE", nullable = false, insertable = true, updatable = true)
    public int getCountNotApplicable() {
        return countNotApplicable;
    }

    public void setCountNotApplicable(int countNotApplicable) {
        this.countNotApplicable = countNotApplicable;
    }

    private int countNotRun;

    @Basic
    @javax.persistence.Column(name = "COUNT_NOT_RUN", nullable = false, insertable = true, updatable = true)
    public int getCountNotRun() {
        return countNotRun;
    }

    public void setCountNotRun(int countNotRun) {
        this.countNotRun = countNotRun;
    }

    private int countPassed;

    @Basic
    @javax.persistence.Column(name = "COUNT_PASSED", nullable = false, insertable = true, updatable = true)
    public int getCountPassed() {
        return countPassed;
    }

    public void setCountPassed(int countPassed) {
        this.countPassed = countPassed;
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

    private boolean isDeleted;

    @Basic
    @javax.persistence.Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
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

        TstReleaseEntity that = (TstReleaseEntity) o;

        if (availableEffort != that.availableEffort) return false;
        if (countBlocked != that.countBlocked) return false;
        if (countCaution != that.countCaution) return false;
        if (countFailed != that.countFailed) return false;
        if (countNotApplicable != that.countNotApplicable) return false;
        if (countNotRun != that.countNotRun) return false;
        if (countPassed != that.countPassed) return false;
        if (daysNonWorking != that.daysNonWorking) return false;
        if (isDeleted != that.isDeleted) return false;
        if (plannedEffort != that.plannedEffort) return false;
        if (releaseId != that.releaseId) return false;
        if (resourceCount != that.resourceCount) return false;
        if (taskCount != that.taskCount) return false;
        if (taskPercentLateFinish != that.taskPercentLateFinish) return false;
        if (taskPercentLateStart != that.taskPercentLateStart) return false;
        if (taskPercentNotStart != that.taskPercentNotStart) return false;
        if (taskPercentOnTime != that.taskPercentOnTime) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (attachmentsYn != null ? !attachmentsYn.equals(that.attachmentsYn) : that.attachmentsYn != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (indentLevel != null ? !indentLevel.equals(that.indentLevel) : that.indentLevel != null) return false;
        if (iterationYn != null ? !iterationYn.equals(that.iterationYn) : that.iterationYn != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (summaryYn != null ? !summaryYn.equals(that.summaryYn) : that.summaryYn != null) return false;
        if (taskActualEffort != null ? !taskActualEffort.equals(that.taskActualEffort) : that.taskActualEffort != null)
            return false;
        if (taskEstimatedEffort != null ? !taskEstimatedEffort.equals(that.taskEstimatedEffort) : that.taskEstimatedEffort != null)
            return false;
        if (taskProjectedEffort != null ? !taskProjectedEffort.equals(that.taskProjectedEffort) : that.taskProjectedEffort != null)
            return false;
        if (taskRemainingEffort != null ? !taskRemainingEffort.equals(that.taskRemainingEffort) : that.taskRemainingEffort != null)
            return false;
        if (versionNumber != null ? !versionNumber.equals(that.versionNumber) : that.versionNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = releaseId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (versionNumber != null ? versionNumber.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (indentLevel != null ? indentLevel.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (summaryYn != null ? summaryYn.hashCode() : 0);
        result = 31 * result + (attachmentsYn != null ? attachmentsYn.hashCode() : 0);
        result = 31 * result + (iterationYn != null ? iterationYn.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + resourceCount;
        result = 31 * result + daysNonWorking;
        result = 31 * result + plannedEffort;
        result = 31 * result + availableEffort;
        result = 31 * result + countBlocked;
        result = 31 * result + countCaution;
        result = 31 * result + countFailed;
        result = 31 * result + countNotApplicable;
        result = 31 * result + countNotRun;
        result = 31 * result + countPassed;
        result = 31 * result + taskCount;
        result = 31 * result + taskPercentOnTime;
        result = 31 * result + taskPercentLateFinish;
        result = 31 * result + taskPercentNotStart;
        result = 31 * result + taskPercentLateStart;
        result = 31 * result + (taskEstimatedEffort != null ? taskEstimatedEffort.hashCode() : 0);
        result = 31 * result + (taskActualEffort != null ? taskActualEffort.hashCode() : 0);
        result = 31 * result + (taskProjectedEffort != null ? taskProjectedEffort.hashCode() : 0);
        result = 31 * result + (taskRemainingEffort != null ? taskRemainingEffort.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        return result;
    }
}
