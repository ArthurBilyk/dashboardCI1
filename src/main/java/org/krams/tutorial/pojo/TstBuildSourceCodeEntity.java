package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_BUILD_SOURCE_CODE", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstBuildSourceCodeEntityPK.class)
public class TstBuildSourceCodeEntity {
    private int buildId;
    private String revisionKey;
    private Timestamp creationDate;

    @Id
    @Column(name = "BUILD_ID", nullable = false, insertable = true, updatable = true)
    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    @Id
    @Column(name = "REVISION_KEY", nullable = false, insertable = true, updatable = true)
    public String getRevisionKey() {
        return revisionKey;
    }

    public void setRevisionKey(String revisionKey) {
        this.revisionKey = revisionKey;
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

        TstBuildSourceCodeEntity that = (TstBuildSourceCodeEntity) o;

        if (buildId != that.buildId) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (revisionKey != null ? !revisionKey.equals(that.revisionKey) : that.revisionKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildId;
        result = 31 * result + (revisionKey != null ? revisionKey.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
