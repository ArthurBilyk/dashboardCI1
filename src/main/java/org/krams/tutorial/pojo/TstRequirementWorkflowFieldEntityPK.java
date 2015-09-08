package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstRequirementWorkflowFieldEntityPK implements Serializable {
    private int requirementWorkflowId;

    @Column(name = "REQUIREMENT_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getRequirementWorkflowId() {
        return requirementWorkflowId;
    }

    public void setRequirementWorkflowId(int requirementWorkflowId) {
        this.requirementWorkflowId = requirementWorkflowId;
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

    private int workflowFieldStateId;

    @Column(name = "WORKFLOW_FIELD_STATE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getWorkflowFieldStateId() {
        return workflowFieldStateId;
    }

    public void setWorkflowFieldStateId(int workflowFieldStateId) {
        this.workflowFieldStateId = workflowFieldStateId;
    }

    private int requirementStatusId;

    @Column(name = "REQUIREMENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getRequirementStatusId() {
        return requirementStatusId;
    }

    public void setRequirementStatusId(int requirementStatusId) {
        this.requirementStatusId = requirementStatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementWorkflowFieldEntityPK that = (TstRequirementWorkflowFieldEntityPK) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (requirementStatusId != that.requirementStatusId) return false;
        if (requirementWorkflowId != that.requirementWorkflowId) return false;
        if (workflowFieldStateId != that.workflowFieldStateId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementWorkflowId;
        result = 31 * result + artifactFieldId;
        result = 31 * result + workflowFieldStateId;
        result = 31 * result + requirementStatusId;
        return result;
    }
}
