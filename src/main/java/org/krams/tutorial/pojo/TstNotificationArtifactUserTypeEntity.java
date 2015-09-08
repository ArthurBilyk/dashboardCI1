package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_ARTIFACT_USER_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstNotificationArtifactUserTypeEntity {
    private int projectArtifactNotifyTypeId;
    private String name;
    private String activeYn;

    @Id
    @Column(name = "PROJECT_ARTIFACT_NOTIFY_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectArtifactNotifyTypeId() {
        return projectArtifactNotifyTypeId;
    }

    public void setProjectArtifactNotifyTypeId(int projectArtifactNotifyTypeId) {
        this.projectArtifactNotifyTypeId = projectArtifactNotifyTypeId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstNotificationArtifactUserTypeEntity that = (TstNotificationArtifactUserTypeEntity) o;

        if (projectArtifactNotifyTypeId != that.projectArtifactNotifyTypeId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectArtifactNotifyTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        return result;
    }
}
