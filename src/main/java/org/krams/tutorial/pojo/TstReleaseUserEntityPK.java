package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstReleaseUserEntityPK implements Serializable {
    private int releaseId;
    private int userId;

    @Column(name = "RELEASE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReleaseUserEntityPK that = (TstReleaseUserEntityPK) o;

        if (releaseId != that.releaseId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = releaseId;
        result = 31 * result + userId;
        return result;
    }
}
