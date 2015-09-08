package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_REQUIREMENT_STEP", schema = "dbo", catalog = "SpiraTeam")
public class TstRequirementStepEntity {
    private int requirementStepId;
    private int position;
    private String description;
    private boolean isDeleted;
    private Timestamp creationDate;
    private Timestamp lastUpdateDate;
    private Timestamp concurrencyDate;

    @Id
    @Column(name = "REQUIREMENT_STEP_ID", nullable = false, insertable = true, updatable = true)
    public int getRequirementStepId() {
        return requirementStepId;
    }

    public void setRequirementStepId(int requirementStepId) {
        this.requirementStepId = requirementStepId;
    }

    @Basic
    @Column(name = "POSITION", nullable = false, insertable = true, updatable = true)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "CONCURRENCY_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getConcurrencyDate() {
        return concurrencyDate;
    }

    public void setConcurrencyDate(Timestamp concurrencyDate) {
        this.concurrencyDate = concurrencyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstRequirementStepEntity that = (TstRequirementStepEntity) o;

        if (isDeleted != that.isDeleted) return false;
        if (position != that.position) return false;
        if (requirementStepId != that.requirementStepId) return false;
        if (concurrencyDate != null ? !concurrencyDate.equals(that.concurrencyDate) : that.concurrencyDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requirementStepId;
        result = 31 * result + position;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (concurrencyDate != null ? concurrencyDate.hashCode() : 0);
        return result;
    }
}
