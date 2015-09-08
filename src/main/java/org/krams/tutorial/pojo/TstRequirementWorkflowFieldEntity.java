package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_WORKFLOW_FIELD", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstRequirementWorkflowFieldEntityPK.class)
public class TstRequirementWorkflowFieldEntity {
    private int requirementWorkflowId;
    private int artifactFieldId;
    private int workflowFieldStateId;
    private int requirementStatusId;

    @Id
    @Column(name = "REQUIREMENT_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementWorkflowId() {
        return requirementWorkflowId;
    }

    public void setRequirementWorkflowId(int requirementWorkflowId) {
        this.requirementWorkflowId = requirementWorkflowId;
    }

    @Id
    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
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
    @Column(name = "REQUIREMENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
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

        TstRequirementWorkflowFieldEntity that = (TstRequirementWorkflowFieldEntity) o;

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
