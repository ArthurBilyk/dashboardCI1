package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstRequirementWorkflowTransitionRoleEntityPK implements Serializable {
    private int workflowTransitionId;
    private int workflowTransitionRoleTypeId;
    private int projectRoleId;

    @Column(name = "WORKFLOW_TRANSITION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getWorkflowTransitionId() {
        return workflowTransitionId;
    }

    public void setWorkflowTransitionId(int workflowTransitionId) {
        this.workflowTransitionId = workflowTransitionId;
    }

    @Column(name = "WORKFLOW_TRANSITION_ROLE_TYPE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getWorkflowTransitionRoleTypeId() {
        return workflowTransitionRoleTypeId;
    }

    public void setWorkflowTransitionRoleTypeId(int workflowTransitionRoleTypeId) {
        this.workflowTransitionRoleTypeId = workflowTransitionRoleTypeId;
    }

    @Column(name = "PROJECT_ROLE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectRoleId() {
        return projectRoleId;
    }

    public void setProjectRoleId(int projectRoleId) {
        this.projectRoleId = projectRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementWorkflowTransitionRoleEntityPK that = (TstRequirementWorkflowTransitionRoleEntityPK) o;

        if (projectRoleId != that.projectRoleId) return false;
        if (workflowTransitionId != that.workflowTransitionId) return false;
        if (workflowTransitionRoleTypeId != that.workflowTransitionRoleTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowTransitionId;
        result = 31 * result + workflowTransitionRoleTypeId;
        result = 31 * result + projectRoleId;
        return result;
    }
}
