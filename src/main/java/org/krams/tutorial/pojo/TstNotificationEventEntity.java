package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_EVENT", schema = "dbo", catalog = "SpiraTeam")
public class TstNotificationEventEntity {
    private int notificationEventId;
    private String artifactCreationYn;
    private String activeYn;
    private String name;
    private String emailSubject;

    @Id
    @Column(name = "NOTIFICATION_EVENT_ID", nullable = false, insertable = true, updatable = true)
    public int getNotificationEventId() {
        return notificationEventId;
    }

    public void setNotificationEventId(int notificationEventId) {
        this.notificationEventId = notificationEventId;
    }

    @Basic
    @Column(name = "ARTIFACT_CREATION_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getArtifactCreationYn() {
        return artifactCreationYn;
    }

    public void setArtifactCreationYn(String artifactCreationYn) {
        this.artifactCreationYn = artifactCreationYn;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "EMAIL_SUBJECT", nullable = false, insertable = true, updatable = true, length = 200)
    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstNotificationEventEntity that = (TstNotificationEventEntity) o;

        if (notificationEventId != that.notificationEventId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (artifactCreationYn != null ? !artifactCreationYn.equals(that.artifactCreationYn) : that.artifactCreationYn != null)
            return false;
        if (emailSubject != null ? !emailSubject.equals(that.emailSubject) : that.emailSubject != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notificationEventId;
        result = 31 * result + (artifactCreationYn != null ? artifactCreationYn.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (emailSubject != null ? emailSubject.hashCode() : 0);
        return result;
    }
}
