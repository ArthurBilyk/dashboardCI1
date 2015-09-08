package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_WORKFLOW_FIELD", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstWorkflowFieldEntityPK.class)
public class TstWorkflowFieldEntity {
    private int workflowId;
    private int artifactFieldId;
    private int incidentStatusId;
    private int workflowFieldStateId;

    @Id
    @Column(name = "WORKFLOW_ID", nullable = false, insertable = true, updatable = true)
    public int getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(int workflowId) {
        this.workflowId = workflowId;
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
    @Column(name = "INCIDENT_STATUS_ID", nullable = false, insertable = true, updatable = true)
    public int getIncidentStatusId() {
        return incidentStatusId;
    }

    public void setIncidentStatusId(int incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
    }

    @Id
    @Column(name = "WORKFLOW_FIELD_STATE_ID", nullable = false, insertable = true, updatable = true)
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

        TstWorkflowFieldEntity that = (TstWorkflowFieldEntity) o;

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
