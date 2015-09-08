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
@javax.persistence.Table(name = "TST_PROJECT", schema = "dbo", catalog = "SpiraTeam")
public class TstProjectEntity {
    private int projectId;

    @Id
    @javax.persistence.Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
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

    private String description;

    @Basic
    @javax.persistence.Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    private String website;

    @Basic
    @javax.persistence.Column(name = "WEBSITE", nullable = true, insertable = true, updatable = true)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    private boolean isActive;

    @Basic
    @javax.persistence.Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    private int workingHours;

    @Basic
    @javax.persistence.Column(name = "WORKING_HOURS", nullable = false, insertable = true, updatable = true)
    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    private int workingDays;

    @Basic
    @javax.persistence.Column(name = "WORKING_DAYS", nullable = false, insertable = true, updatable = true)
    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    private int nonWorkingHours;

    @Basic
    @javax.persistence.Column(name = "NON_WORKING_HOURS", nullable = false, insertable = true, updatable = true)
    public int getNonWorkingHours() {
        return nonWorkingHours;
    }

    public void setNonWorkingHours(int nonWorkingHours) {
        this.nonWorkingHours = nonWorkingHours;
    }

    private boolean isTimeTrackIncidents;

    @Basic
    @javax.persistence.Column(name = "IS_TIME_TRACK_INCIDENTS", nullable = false, insertable = true, updatable = true)
    public boolean isTimeTrackIncidents() {
        return isTimeTrackIncidents;
    }

    public void setTimeTrackIncidents(boolean isTimeTrackIncidents) {
        this.isTimeTrackIncidents = isTimeTrackIncidents;
    }

    private boolean isTimeTrackTasks;

    @Basic
    @javax.persistence.Column(name = "IS_TIME_TRACK_TASKS", nullable = false, insertable = true, updatable = true)
    public boolean isTimeTrackTasks() {
        return isTimeTrackTasks;
    }

    public void setTimeTrackTasks(boolean isTimeTrackTasks) {
        this.isTimeTrackTasks = isTimeTrackTasks;
    }

    private boolean isEffortIncidents;

    @Basic
    @javax.persistence.Column(name = "IS_EFFORT_INCIDENTS", nullable = false, insertable = true, updatable = true)
    public boolean isEffortIncidents() {
        return isEffortIncidents;
    }

    public void setEffortIncidents(boolean isEffortIncidents) {
        this.isEffortIncidents = isEffortIncidents;
    }

    private boolean isEffortTasks;

    @Basic
    @javax.persistence.Column(name = "IS_EFFORT_TASKS", nullable = false, insertable = true, updatable = true)
    public boolean isEffortTasks() {
        return isEffortTasks;
    }

    public void setEffortTasks(boolean isEffortTasks) {
        this.isEffortTasks = isEffortTasks;
    }

    private boolean isTasksAutoCreate;

    @Basic
    @javax.persistence.Column(name = "IS_TASKS_AUTO_CREATE", nullable = false, insertable = true, updatable = true)
    public boolean isTasksAutoCreate() {
        return isTasksAutoCreate;
    }

    public void setTasksAutoCreate(boolean isTasksAutoCreate) {
        this.isTasksAutoCreate = isTasksAutoCreate;
    }

    private BigDecimal reqDefaultEstimate;

    @Basic
    @javax.persistence.Column(name = "REQ_DEFAULT_ESTIMATE", nullable = true, insertable = true, updatable = true, precision = 1)
    public BigDecimal getReqDefaultEstimate() {
        return reqDefaultEstimate;
    }

    public void setReqDefaultEstimate(BigDecimal reqDefaultEstimate) {
        this.reqDefaultEstimate = reqDefaultEstimate;
    }

    private int reqPointEffort;

    @Basic
    @javax.persistence.Column(name = "REQ_POINT_EFFORT", nullable = false, insertable = true, updatable = true)
    public int getReqPointEffort() {
        return reqPointEffort;
    }

    public void setReqPointEffort(int reqPointEffort) {
        this.reqPointEffort = reqPointEffort;
    }

    private Integer taskDefaultEffort;

    @Basic
    @javax.persistence.Column(name = "TASK_DEFAULT_EFFORT", nullable = true, insertable = true, updatable = true)
    public Integer getTaskDefaultEffort() {
        return taskDefaultEffort;
    }

    public void setTaskDefaultEffort(Integer taskDefaultEffort) {
        this.taskDefaultEffort = taskDefaultEffort;
    }

    private boolean isReqStatusByTasks;

    @Basic
    @javax.persistence.Column(name = "IS_REQ_STATUS_BY_TASKS", nullable = false, insertable = true, updatable = true)
    public boolean isReqStatusByTasks() {
        return isReqStatusByTasks;
    }

    public void setReqStatusByTasks(boolean isReqStatusByTasks) {
        this.isReqStatusByTasks = isReqStatusByTasks;
    }

    private boolean isReqStatusByTestCases;

    @Basic
    @javax.persistence.Column(name = "IS_REQ_STATUS_BY_TEST_CASES", nullable = false, insertable = true, updatable = true)
    public boolean isReqStatusByTestCases() {
        return isReqStatusByTestCases;
    }

    public void setReqStatusByTestCases(boolean isReqStatusByTestCases) {
        this.isReqStatusByTestCases = isReqStatusByTestCases;
    }

    private boolean isEffortTestCases;

    @Basic
    @javax.persistence.Column(name = "IS_EFFORT_TEST_CASES", nullable = false, insertable = true, updatable = true)
    public boolean isEffortTestCases() {
        return isEffortTestCases;
    }

    public void setEffortTestCases(boolean isEffortTestCases) {
        this.isEffortTestCases = isEffortTestCases;
    }

    private boolean isReqStatusAutoPlanned;

    @Basic
    @javax.persistence.Column(name = "IS_REQ_STATUS_AUTO_PLANNED", nullable = false, insertable = true, updatable = true)
    public boolean isReqStatusAutoPlanned() {
        return isReqStatusAutoPlanned;
    }

    public void setReqStatusAutoPlanned(boolean isReqStatusAutoPlanned) {
        this.isReqStatusAutoPlanned = isReqStatusAutoPlanned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectEntity that = (TstProjectEntity) o;

        if (isActive != that.isActive) return false;
        if (isEffortIncidents != that.isEffortIncidents) return false;
        if (isEffortTasks != that.isEffortTasks) return false;
        if (isEffortTestCases != that.isEffortTestCases) return false;
        if (isReqStatusAutoPlanned != that.isReqStatusAutoPlanned) return false;
        if (isReqStatusByTasks != that.isReqStatusByTasks) return false;
        if (isReqStatusByTestCases != that.isReqStatusByTestCases) return false;
        if (isTasksAutoCreate != that.isTasksAutoCreate) return false;
        if (isTimeTrackIncidents != that.isTimeTrackIncidents) return false;
        if (isTimeTrackTasks != that.isTimeTrackTasks) return false;
        if (nonWorkingHours != that.nonWorkingHours) return false;
        if (projectId != that.projectId) return false;
        if (reqPointEffort != that.reqPointEffort) return false;
        if (workingDays != that.workingDays) return false;
        if (workingHours != that.workingHours) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (reqDefaultEstimate != null ? !reqDefaultEstimate.equals(that.reqDefaultEstimate) : that.reqDefaultEstimate != null)
            return false;
        if (taskDefaultEffort != null ? !taskDefaultEffort.equals(that.taskDefaultEffort) : that.taskDefaultEffort != null)
            return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + workingHours;
        result = 31 * result + workingDays;
        result = 31 * result + nonWorkingHours;
        result = 31 * result + (isTimeTrackIncidents ? 1 : 0);
        result = 31 * result + (isTimeTrackTasks ? 1 : 0);
        result = 31 * result + (isEffortIncidents ? 1 : 0);
        result = 31 * result + (isEffortTasks ? 1 : 0);
        result = 31 * result + (isTasksAutoCreate ? 1 : 0);
        result = 31 * result + (reqDefaultEstimate != null ? reqDefaultEstimate.hashCode() : 0);
        result = 31 * result + reqPointEffort;
        result = 31 * result + (taskDefaultEffort != null ? taskDefaultEffort.hashCode() : 0);
        result = 31 * result + (isReqStatusByTasks ? 1 : 0);
        result = 31 * result + (isReqStatusByTestCases ? 1 : 0);
        result = 31 * result + (isEffortTestCases ? 1 : 0);
        result = 31 * result + (isReqStatusAutoPlanned ? 1 : 0);
        return result;
    }
}
