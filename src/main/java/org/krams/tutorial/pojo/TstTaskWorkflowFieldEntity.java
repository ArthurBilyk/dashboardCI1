package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK_WORKFLOW_FIELD", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstTaskWorkflowFieldEntityPK.class)
public class TstTaskWorkflowFieldEntity {
    private int taskWorkflowId;
    private int taskStatusId;
    private int workflowFieldStateId;
    private int artifactFieldId;

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
    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
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

        TstTaskWorkflowFieldEntity that = (TstTaskWorkflowFieldEntity) o;

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
