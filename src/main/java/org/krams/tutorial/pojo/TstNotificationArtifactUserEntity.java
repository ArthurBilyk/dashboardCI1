package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_ARTIFACT_USER", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstNotificationArtifactUserEntityPK.class)
public class TstNotificationArtifactUserEntity {
    private int notificationUserTypeId;
    private int notificationEventId;

    @Id
    @Column(name = "NOTIFICATION_USER_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getNotificationUserTypeId() {
        return notificationUserTypeId;
    }

    public void setNotificationUserTypeId(int notificationUserTypeId) {
        this.notificationUserTypeId = notificationUserTypeId;
    }

    @Id
    @Column(name = "NOTIFICATION_EVENT_ID", nullable = false, insertable = true, updatable = true)
    public int getNotificationEventId() {
        return notificationEventId;
    }

    public void setNotificationEventId(int notificationEventId) {
        this.notificationEventId = notificationEventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstNotificationArtifactUserEntity that = (TstNotificationArtifactUserEntity) o;

        if (notificationEventId != that.notificationEventId) return false;
        if (notificationUserTypeId != that.notificationUserTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notificationUserTypeId;
        result = 31 * result + notificationEventId;
        return result;
    }
}
