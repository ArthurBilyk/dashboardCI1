package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_HISTORY_CHANGESET", schema = "dbo", catalog = "SpiraTeam")
public class TstHistoryChangesetEntity {
    private int changesetId;
    private int artifactId;
    private Timestamp changeDate;
    private String artifactDesc;

    @Id
    @Column(name = "CHANGESET_ID", nullable = false, insertable = true, updatable = true)
    public int getChangesetId() {
        return changesetId;
    }

    public void setChangesetId(int changesetId) {
        this.changesetId = changesetId;
    }

    @Basic
    @Column(name = "ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    @Basic
    @Column(name = "CHANGE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Timestamp changeDate) {
        this.changeDate = changeDate;
    }

    @Basic
    @Column(name = "ARTIFACT_DESC", nullable = true, insertable = true, updatable = true)
    public String getArtifactDesc() {
        return artifactDesc;
    }

    public void setArtifactDesc(String artifactDesc) {
        this.artifactDesc = artifactDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstHistoryChangesetEntity that = (TstHistoryChangesetEntity) o;

        if (artifactId != that.artifactId) return false;
        if (changesetId != that.changesetId) return false;
        if (artifactDesc != null ? !artifactDesc.equals(that.artifactDesc) : that.artifactDesc != null) return false;
        if (changeDate != null ? !changeDate.equals(that.changeDate) : that.changeDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = changesetId;
        result = 31 * result + artifactId;
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        result = 31 * result + (artifactDesc != null ? artifactDesc.hashCode() : 0);
        return result;
    }
}
