package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK_WORKFLOW_CUSTOM_PROPERTY", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstTaskWorkflowCustomPropertyEntityPK.class)
public class TstTaskWorkflowCustomPropertyEntity {
    private int taskWorkflowId;
    private int taskStatusId;
    private int workflowFieldStateId;
    private int customPropertyId;

    @Id
    @Column(name = "TASK_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getTaskWorkflowId() {
        return taskWorkflowId;
    }

    public void setTaskWorkflowId(int taskWorkflowId) {
        this.taskWorkflowId = taskWorkflowId;
    }

    @Id
    @Column(name = "TASK_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(int taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    @Id
    @Column(name = "WORKFLOW_FIELD_STATE_ID", nullable = false, insertable = true, updatable = true)
    public int getWorkflowFieldStateId() {
        return workflowFieldStateId;
    }

    public void setWorkflowFieldStateId(int workflowFieldStateId) {
        this.workflowFieldStateId = workflowFieldStateId;
    }

    @Id
    @Column(name = "CUSTOM_PROPERTY_ID", nullable = false, insertable = true, updatable = true)
    public int getCustomPropertyId() {
        return customPropertyId;
    }

    public void setCustomPropertyId(int customPropertyId) {
        this.customPropertyId = customPropertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTaskWorkflowCustomPropertyEntity that = (TstTaskWorkflowCustomPropertyEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (taskStatusId != that.taskStatusId) return false;
        if (taskWorkflowId != that.taskWorkflowId) return false;
        if (workflowFieldStateId != that.workflowFieldStateId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskWorkflowId;
        result = 31 * result + taskStatusId;
        result = 31 * result + workflowFieldStateId;
        result = 31 * result + customPropertyId;
        return result;
    }
}
