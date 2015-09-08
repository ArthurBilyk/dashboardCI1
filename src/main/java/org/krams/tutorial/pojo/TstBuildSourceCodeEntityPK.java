package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstBuildSourceCodeEntityPK implements Serializable {
    private int buildId;
    private String revisionKey;

    @Column(name = "BUILD_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    @Column(name = "REVISION_KEY", nullable = false, insertable = true, updatable = true)
    @Id
    public String getRevisionKey() {
        return revisionKey;
    }

    public void setRevisionKey(String revisionKey) {
        this.revisionKey = revisionKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstBuildSourceCodeEntityPK that = (TstBuildSourceCodeEntityPK) o;

        if (buildId != that.buildId) return false;
        if (revisionKey != null ? !revisionKey.equals(that.revisionKey) : that.revisionKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildId;
        result = 31 * result + (revisionKey != null ? revisionKey.hashCode() : 0);
        return result;
    }
}
