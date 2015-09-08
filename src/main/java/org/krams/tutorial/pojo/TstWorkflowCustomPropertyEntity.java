package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_WORKFLOW_CUSTOM_PROPERTY", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstWorkflowCustomPropertyEntityPK.class)
public class TstWorkflowCustomPropertyEntity {
    private int workflowFieldStateId;
    private int workflowId;
    private int incidentStatusId;
    private int customPropertyId;

    @Id
    @Column(name = "WORKFLOW_FIELD_STATE_ID", nullable = false, insertable = true, updatable = true)
    public int getWorkflowFieldStateId() {
        return workflowFieldStateId;
    }

    public void setWorkflowFieldStateId(int workflowFieldStateId) {
        this.workflowFieldStateId = workflowFieldStateId;
    }

    @Id
    @Column(name = "WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(int workflowId) {
        this.workflowId = workflowId;
    }

    @Id
    @Column(name = "INCIDENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getIncidentStatusId() {
        return incidentStatusId;
    }

    public void setIncidentStatusId(int incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
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

        TstWorkflowCustomPropertyEntity that = (TstWorkflowCustomPropertyEntity) o;

        if (customPropertyId != that.customPropertyId) return false;
        if (incidentStatusId != that.incidentStatusId) return false;
        if (workflowFieldStateId != that.workflowFieldStateId) return false;
        if (workflowId != that.workflowId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowFieldStateId;
        result = 31 * result + workflowId;
        result = 31 * result + incidentStatusId;
        result = 31 * result + customPropertyId;
        return result;
    }
}
