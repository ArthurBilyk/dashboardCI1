package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstNotificationArtifactUserEntityPK implements Serializable {
    private int notificationUserTypeId;
    private int notificationEventId;

    @Column(name = "NOTIFICATION_USER_TYPE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getNotificationUserTypeId() {
        return notificationUserTypeId;
    }

    public void setNotificationUserTypeId(int notificationUserTypeId) {
        this.notificationUserTypeId = notificationUserTypeId;
    }

    @Column(name = "NOTIFICATION_EVENT_ID", nullable = false, insertable = true, updatable = true)
    @Id
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

        TstNotificationArtifactUserEntityPK that = (TstNotificationArtifactUserEntityPK) o;

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
