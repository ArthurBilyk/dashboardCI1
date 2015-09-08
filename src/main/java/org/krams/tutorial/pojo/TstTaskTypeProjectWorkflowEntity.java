package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK_TYPE_PROJECT_WORKFLOW", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstTaskTypeProjectWorkflowEntityPK.class)
public class TstTaskTypeProjectWorkflowEntity {
    private int taskWorkflowId;
    private int taskTypeId;

    @Id
    @Column(name = "TASK_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getTaskWorkflowId() {
        return taskWorkflowId;
    }

    public void setTaskWorkflowId(int taskWorkflowId) {
        this.taskWorkflowId = taskWorkflowId;
    }

    @Id
    @Column(name = "TASK_TYPE_ID", nullable = false, insertable = true, updatable = true)
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

        TstTaskTypeProjectWorkflowEntity that = (TstTaskTypeProjectWorkflowEntity) o;

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
