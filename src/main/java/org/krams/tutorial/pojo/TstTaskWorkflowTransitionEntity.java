package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK_WORKFLOW_TRANSITION", schema = "dbo", catalog = "SpiraTeam")
public class TstTaskWorkflowTransitionEntity {
    private int workflowTransitionId;
    private String name;
    private boolean isExecuteByCreator;
    private boolean isExecuteByOwner;

    @Id
    @Column(name = "WORKFLOW_TRANSITION_ID", nullable = false, insertable = true, updatable = true)
    public int getWorkflowTransitionId() {
        return workflowTransitionId;
    }

    public void setWorkflowTransitionId(int workflowTransitionId) {
        this.workflowTransitionId = workflowTransitionId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "IS_EXECUTE_BY_CREATOR", nullable = false, insertable = true, updatable = true)
    public boolean isExecuteByCreator() {
        return isExecuteByCreator;
    }

    public void setExecuteByCreator(boolean isExecuteByCreator) {
        this.isExecuteByCreator = isExecuteByCreator;
    }

    @Basic
    @Column(name = "IS_EXECUTE_BY_OWNER", nullable = false, insertable = true, updatable = true)
    public boolean isExecuteByOwner() {
        return isExecuteByOwner;
    }

    public void setExecuteByOwner(boolean isExecuteByOwner) {
        this.isExecuteByOwner = isExecuteByOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTaskWorkflowTransitionEntity that = (TstTaskWorkflowTransitionEntity) o;

        if (isExecuteByCreator != that.isExecuteByCreator) return false;
        if (isExecuteByOwner != that.isExecuteByOwner) return false;
        if (workflowTransitionId != that.workflowTransitionId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowTransitionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isExecuteByCreator ? 1 : 0);
        result = 31 * result + (isExecuteByOwner ? 1 : 0);
        return result;
    }
}
