package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_EVENT_FIELD", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstNotificationEventFieldEntityPK.class)
public class TstNotificationEventFieldEntity {
    private int notificationEventId;
    private int artifactFieldId;

    @Id
    @Column(name = "NOTIFICATION_EVENT_ID", nullable = false, insertable = true, updatable = true)
    public int getNotificationEventId() {
        return notificationEventId;
    }

    public void setNotificationEventId(int notificationEventId) {
        this.notificationEventId = notificationEventId;
    }

    @Id
    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
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

        TstNotificationEventFieldEntity that = (TstNotificationEventFieldEntity) o;

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
