package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_TYPE_PROJECT_WORKFLOW", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstRequirementTypeProjectWorkflowEntityPK.class)
public class TstRequirementTypeProjectWorkflowEntity {
    private int requirementTypeId;
    private int requirementWorkflowId;

    @Id
    @Column(name = "REQUIREMENT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(int requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }

    @Id
    @Column(name = "REQUIREMENT_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
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

        TstRequirementTypeProjectWorkflowEntity that = (TstRequirementTypeProjectWorkflowEntity) o;

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
