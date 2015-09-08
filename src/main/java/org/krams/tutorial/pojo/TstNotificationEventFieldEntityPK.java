package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstNotificationEventFieldEntityPK implements Serializable {
    private int notificationEventId;
    private int artifactFieldId;

    @Column(name = "NOTIFICATION_EVENT_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getNotificationEventId() {
        return notificationEventId;
    }

    public void setNotificationEventId(int notificationEventId) {
        this.notificationEventId = notificationEventId;
    }

    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstNotificationEventFieldEntityPK that = (TstNotificationEventFieldEntityPK) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (notificationEventId != that.notificationEventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notificationEventId;
        result = 31 * result + artifactFieldId;
        return result;
    }
}
