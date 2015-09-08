package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_WORKFLOW_TRANSITION", schema = "dbo", catalog = "SpiraTeam")
public class TstWorkflowTransitionEntity {
    private int workflowTransitionId;
    private String name;
    private boolean isExecuteByDetector;
    private boolean isExecuteByOwner;
    private boolean isNotifyDetector;
    private boolean isNotifyOwner;
    private String notifySubject;

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
    @Column(name = "IS_EXECUTE_BY_DETECTOR", nullable = false, insertable = true, updatable = true)
    public boolean isExecuteByDetector() {
        return isExecuteByDetector;
    }

    public void setExecuteByDetector(boolean isExecuteByDetector) {
        this.isExecuteByDetector = isExecuteByDetector;
    }

    @Basic
    @Column(name = "IS_EXECUTE_BY_OWNER", nullable = false, insertable = true, updatable = true)
    public boolean isExecuteByOwner() {
        return isExecuteByOwner;
    }

    public void setExecuteByOwner(boolean isExecuteByOwner) {
        this.isExecuteByOwner = isExecuteByOwner;
    }

    @Basic
    @Column(name = "IS_NOTIFY_DETECTOR", nullable = false, insertable = true, updatable = true)
    public boolean isNotifyDetector() {
        return isNotifyDetector;
    }

    public void setNotifyDetector(boolean isNotifyDetector) {
        this.isNotifyDetector = isNotifyDetector;
    }

    @Basic
    @Column(name = "IS_NOTIFY_OWNER", nullable = false, insertable = true, updatable = true)
    public boolean isNotifyOwner() {
        return isNotifyOwner;
    }

    public void setNotifyOwner(boolean isNotifyOwner) {
        this.isNotifyOwner = isNotifyOwner;
    }

    @Basic
    @Column(name = "NOTIFY_SUBJECT", nullable = true, insertable = true, updatable = true)
    public String getNotifySubject() {
        return notifySubject;
    }

    public void setNotifySubject(String notifySubject) {
        this.notifySubject = notifySubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstWorkflowTransitionEntity that = (TstWorkflowTransitionEntity) o;

        if (isExecuteByDetector != that.isExecuteByDetector) return false;
        if (isExecuteByOwner != that.isExecuteByOwner) return false;
        if (isNotifyDetector != that.isNotifyDetector) return false;
        if (isNotifyOwner != that.isNotifyOwner) return false;
        if (workflowTransitionId != that.workflowTransitionId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (notifySubject != null ? !notifySubject.equals(that.notifySubject) : that.notifySubject != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowTransitionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isExecuteByDetector ? 1 : 0);
        result = 31 * result + (isExecuteByOwner ? 1 : 0);
        result = 31 * result + (isNotifyDetector ? 1 : 0);
        result = 31 * result + (isNotifyOwner ? 1 : 0);
        result = 31 * result + (notifySubject != null ? notifySubject.hashCode() : 0);
        return result;
    }
}
