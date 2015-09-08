package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstWorkflowFieldEntityPK implements Serializable {
    private int workflowId;

    @Column(name = "WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(int workflowId) {
        this.workflowId = workflowId;
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

    private int incidentStatusId;

    @Column(name = "INCIDENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getIncidentStatusId() {
        return incidentStatusId;
    }

    public void setIncidentStatusId(int incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstWorkflowFieldEntityPK that = (TstWorkflowFieldEntityPK) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (incidentStatusId != that.incidentStatusId) return false;
        if (workflowFieldStateId != that.workflowFieldStateId) return false;
        if (workflowId != that.workflowId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowId;
        result = 31 * result + artifactFieldId;
        result = 31 * result + incidentStatusId;
        result = 31 * result + workflowFieldStateId;
        return result;
    }
}
