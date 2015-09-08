package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstTaskTypeProjectWorkflowEntityPK implements Serializable {
    private int taskWorkflowId;
    private int taskTypeId;

    @Column(name = "TASK_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTaskWorkflowId() {
        return taskWorkflowId;
    }

    public void setTaskWorkflowId(int taskWorkflowId) {
        this.taskWorkflowId = taskWorkflowId;
    }

    @Column(name = "TASK_TYPE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTaskTypeProjectWorkflowEntityPK that = (TstTaskTypeProjectWorkflowEntityPK) o;

        if (taskTypeId != that.taskTypeId) return false;
        if (taskWorkflowId != that.taskWorkflowId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskWorkflowId;
        result = 31 * result + taskTypeId;
        return result;
    }
}
