package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_INCIDENT_RESOLUTION", schema = "dbo", catalog = "SpiraTeam")
public class TstIncidentResolutionEntity {
    private int incidentResolutionId;
    private String resolution;
    private Timestamp creationDate;

    @Id
    @Column(name = "INCIDENT_RESOLUTION_ID", nullable = false, insertable = true, updatable = true)
    public int getIncidentResolutionId() {
        return incidentResolutionId;
    }

    public void setIncidentResolutionId(int incidentResolutionId) {
        this.incidentResolutionId = incidentResolutionId;
    }

    @Basic
    @Column(name = "RESOLUTION", nullable = false, insertable = true, updatable = true)
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstIncidentResolutionEntity that = (TstIncidentResolutionEntity) o;

        if (incidentResolutionId != that.incidentResolutionId) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (resolution != null ? !resolution.equals(that.resolution) : that.resolution != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = incidentResolutionId;
        result = 31 * result + (resolution != null ? resolution.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
