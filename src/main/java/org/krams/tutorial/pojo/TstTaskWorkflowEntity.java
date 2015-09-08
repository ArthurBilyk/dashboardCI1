package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK_WORKFLOW", schema = "dbo", catalog = "SpiraTeam")
public class TstTaskWorkflowEntity {
    private int taskWorkflowId;
    private String name;
    private boolean isDefault;
    private boolean isActive;

    @Id
    @Column(name = "TASK_WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getTaskWorkflowId() {
        return taskWorkflowId;
    }

    public void setTaskWorkflowId(int taskWorkflowId) {
        this.taskWorkflowId = taskWorkflowId;
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
    @Column(name = "IS_DEFAULT", nullable = false, insertable = true, updatable = true)
    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTaskWorkflowEntity that = (TstTaskWorkflowEntity) o;

        if (isActive != that.isActive) return false;
        if (isDefault != that.isDefault) return false;
        if (taskWorkflowId != that.taskWorkflowId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskWorkflowId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isDefault ? 1 : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
