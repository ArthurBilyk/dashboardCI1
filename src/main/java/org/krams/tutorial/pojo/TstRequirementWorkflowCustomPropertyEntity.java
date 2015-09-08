package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_WORKFLOW_CUSTOM_PROPERTY", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstRequirementWorkflowCustomPropertyEntityPK.class)
public class TstRequirementWorkflowCustomPropertyEntity {
    private int requirementWorkflowId;
    private int requirementStatusId;
    private int workflowFieldStateId;
    private int customPropertyId;

    @Id
    @Column(name = "REQUIREMENT_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementWorkflowId() {
        return requirementWorkflowId;
    }

    public void setRequirementWorkflowId(int requirementWorkflowId) {
        this.requirementWorkflowId = requirementWorkflowId;
    }

    @Id
    @Column(name = "REQUIREMENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementStatusId() {
        return requirementStatusId;
    }

    public void setRequirementStatusId(int requirementStatusId) {
        this.requirementStatusId = requirementStatusId;
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

        TstRequirementWorkflowCustomPropertyEntity that = (TstRequirementWorkflowCustomPropertyEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (requirementStatusId != that.requirementStatusId) return false;
        if (requirementWorkflowId != that.requirementWorkflowId) return false;
        if (workflowFieldStateId != that.workflowFieldStateId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementWorkflowId;
        result = 31 * result + requirementStatusId;
        result = 31 * result + workflowFieldStateId;
        result = 31 * result + customPropertyId;
        return result;
    }
}
