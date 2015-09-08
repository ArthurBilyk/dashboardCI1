package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_USER_ARTIFACT_FIELD", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstUserArtifactFieldEntityPK.class)
public class TstUserArtifactFieldEntity {
    private int artifactFieldId;
    private int projectId;
    private int userId;
    private boolean isVisible;
    private Integer listPosition;

    @Id
    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
    }

    @Id
    @Column(name = "PROJECT_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "IS_VISIBLE", nullable = false, insertable = true, updatable = true)
    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Basic
    @Column(name = "LIST_POSITION", nullable = true, insertable = true, updatable = true)
    public Integer getListPosition() {
        return listPosition;
    }

    public void setListPosition(Integer listPosition) {
        this.listPosition = listPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstUserArtifactFieldEntity that = (TstUserArtifactFieldEntity) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (isVisible != that.isVisible) return false;
        if (projectId != that.projectId) return false;
        if (userId != that.userId) return false;
        if (listPosition != null ? !listPosition.equals(that.listPosition) : that.listPosition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactFieldId;
        result = 31 * result + projectId;
        result = 31 * result + userId;
        result = 31 * result + (isVisible ? 1 : 0);
        result = 31 * result + (listPosition != null ? listPosition.hashCode() : 0);
        return result;
    }
}
