package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_USER_SUBSCRIPTION", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstNotificationUserSubscriptionEntityPK.class)
public class TstNotificationUserSubscriptionEntity {
    private int userId;
    private int artifactTypeId;
    private int artifactId;

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    @Id
    @Column(name = "ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstNotificationUserSubscriptionEntity that = (TstNotificationUserSubscriptionEntity) o;

        if (artifactId != that.artifactId) return false;
        if (artifactTypeId != that.artifactTypeId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + artifactTypeId;
        result = 31 * result + artifactId;
        return result;
    }
}
