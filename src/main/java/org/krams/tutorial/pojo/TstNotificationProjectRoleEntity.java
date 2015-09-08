package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_PROJECT_ROLE", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstNotificationProjectRoleEntityPK.class)
public class TstNotificationProjectRoleEntity {
    private int projectRoleId;
    private int notificationEventId;

    @Id
    @Column(name = "PROJECT_ROLE_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectRoleId() {
        return projectRoleId;
    }

    public void setProjectRoleId(int projectRoleId) {
        this.projectRoleId = projectRoleId;
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

        TstNotificationProjectRoleEntity that = (TstNotificationProjectRoleEntity) o;

        if (notificationEventId != that.notificationEventId) return false;
        if (projectRoleId != that.projectRoleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectRoleId;
        result = 31 * result + notificationEventId;
        return result;
    }
}
