package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstTaskWorkflowFieldEntityPK implements Serializable {
    private int taskWorkflowId;

    @Column(name = "TASK_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTaskWorkflowId() {
        return taskWorkflowId;
    }

    public void setTaskWorkflowId(int taskWorkflowId) {
        this.taskWorkflowId = taskWorkflowId;
    }

    private int taskStatusId;

    @Column(name = "TASK_STATUS_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(int taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    private int workflowFieldStateId;

    @Column(name = "WORKFLOW_FIELD_STATE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getWorkflowFieldStateId() {
        return workflowFieldStateId;
    }

    public void setWorkflowFieldStateId(int workflowFieldStateId) {
        this.workflowFieldStateId = workflowFieldStateId;
    }

    private int artifactFieldId;

    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTaskWorkflowFieldEntityPK that = (TstTaskWorkflowFieldEntityPK) o;

        if (artifactFieldId != that.artifactFieldId) return false;
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
        result = 31 * result + artifactFieldId;
        return result;
    }
}
