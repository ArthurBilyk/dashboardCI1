package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstRequirementTypeProjectWorkflowEntityPK implements Serializable {
    private int requirementTypeId;
    private int requirementWorkflowId;

    @Column(name = "REQUIREMENT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(int requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }

    @Column(name = "REQUIREMENT_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getRequirementWorkflowId() {
        return requirementWorkflowId;
    }

    public void setRequirementWorkflowId(int requirementWorkflowId) {
        this.requirementWorkflowId = requirementWorkflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementTypeProjectWorkflowEntityPK that = (TstRequirementTypeProjectWorkflowEntityPK) o;

        if (requirementTypeId != that.requirementTypeId) return false;
        if (requirementWorkflowId != that.requirementWorkflowId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementTypeId;
        result = 31 * result + requirementWorkflowId;
        return result;
    }
}
