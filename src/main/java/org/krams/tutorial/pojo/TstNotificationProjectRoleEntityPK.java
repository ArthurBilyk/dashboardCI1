package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstNotificationProjectRoleEntityPK implements Serializable {
    private int projectRoleId;
    private int notificationEventId;

    @Column(name = "PROJECT_ROLE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProjectRoleId() {
        return projectRoleId;
    }

    public void setProjectRoleId(int projectRoleId) {
        this.projectRoleId = projectRoleId;
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

        TstNotificationProjectRoleEntityPK that = (TstNotificationProjectRoleEntityPK) o;

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
