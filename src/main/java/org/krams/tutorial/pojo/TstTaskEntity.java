package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK", schema = "dbo", catalog = "SpiraTeam")
public class TstTaskEntity {
    private int taskId;
    private String name;
    private String description;
    private Timestamp creationDate;
    private Timestamp lastUpdateDate;
    private Timestamp startDate;
    private Timestamp endDate;
    private int completionPercent;
    private Integer estimatedEffort;
    private Integer actualEffort;
    private boolean isAttachments;
    private Integer projectedEffort;
    private Integer remainingEffort;
    private boolean isDeleted;
    private Timestamp concurrencyDate;

    @Id
    @Column(name = "TASK_ID", nullable = false, insertable = true, updatable = true)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
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
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
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
    @Column(name = "START_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
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
    @Column(name = "COMPLETION_PERCENT", nullable = false, insertable = true, updatable = true)
    public int getCompletionPercent() {
        return completionPercent;
    }

    public void setCompletionPercent(int completionPercent) {
        this.completionPercent = completionPercent;
    }

    @Basic
    @Column(name = "ESTIMATED_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getEstimatedEffort() {
        return estimatedEffort;
    }

    public void setEstimatedEffort(Integer estimatedEffort) {
        this.estimatedEffort = estimatedEffort;
    }

    @Basic
    @Column(name = "ACTUAL_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getActualEffort() {
        return actualEffort;
    }

    public void setActualEffort(Integer actualEffort) {
        this.actualEffort = actualEffort;
    }

    @Basic
    @Column(name = "IS_ATTACHMENTS", nullable = false, insertable = true, updatable = true)
    public boolean isAttachments() {
        return isAttachments;
    }

    public void setAttachments(boolean isAttachments) {
        this.isAttachments = isAttachments;
    }

    @Basic
    @Column(name = "PROJECTED_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getProjectedEffort() {
        return projectedEffort;
    }

    public void setProjectedEffort(Integer projectedEffort) {
        this.projectedEffort = projectedEffort;
    }

    @Basic
    @Column(name = "REMAINING_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getRemainingEffort() {
        return remainingEffort;
    }

    public void setRemainingEffort(Integer remainingEffort) {
        this.remainingEffort = remainingEffort;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "CONCURRENCY_DATE", nullable = false, insertable = true, updatable = true)
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

        TstTaskEntity that = (TstTaskEntity) o;

        if (completionPercent != that.completionPercent) return false;
        if (isAttachments != that.isAttachments) return false;
        if (isDeleted != that.isDeleted) return false;
        if (taskId != that.taskId) return false;
        if (actualEffort != null ? !actualEffort.equals(that.actualEffort) : that.actualEffort != null) return false;
        if (concurrencyDate != null ? !concurrencyDate.equals(that.concurrencyDate) : that.concurrencyDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (estimatedEffort != null ? !estimatedEffort.equals(that.estimatedEffort) : that.estimatedEffort != null)
            return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (projectedEffort != null ? !projectedEffort.equals(that.projectedEffort) : that.projectedEffort != null)
            return false;
        if (remainingEffort != null ? !remainingEffort.equals(that.remainingEffort) : that.remainingEffort != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + completionPercent;
        result = 31 * result + (estimatedEffort != null ? estimatedEffort.hashCode() : 0);
        result = 31 * result + (actualEffort != null ? actualEffort.hashCode() : 0);
        result = 31 * result + (isAttachments ? 1 : 0);
        result = 31 * result + (projectedEffort != null ? projectedEffort.hashCode() : 0);
        result = 31 * result + (remainingEffort != null ? remainingEffort.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (concurrencyDate != null ? concurrencyDate.hashCode() : 0);
        return result;
    }
}
