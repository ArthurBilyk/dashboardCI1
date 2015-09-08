package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ARTIFACT_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstArtifactTypeEntity {
    private int artifactTypeId;
    private String name;
    private String prefix;
    private String notifyYn;
    private String activeYn;
    private String dataSyncYn;

    @Id
    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
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
    @Column(name = "PREFIX", nullable = false, insertable = true, updatable = true)
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Basic
    @Column(name = "NOTIFY_YN", nullable = false, insertable = true, updatable = true, length = 20)
    public String getNotifyYn() {
        return notifyYn;
    }

    public void setNotifyYn(String notifyYn) {
        this.notifyYn = notifyYn;
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
    @Column(name = "DATA_SYNC_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDataSyncYn() {
        return dataSyncYn;
    }

    public void setDataSyncYn(String dataSyncYn) {
        this.dataSyncYn = dataSyncYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstArtifactTypeEntity that = (TstArtifactTypeEntity) o;

        if (artifactTypeId != that.artifactTypeId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (dataSyncYn != null ? !dataSyncYn.equals(that.dataSyncYn) : that.dataSyncYn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (notifyYn != null ? !notifyYn.equals(that.notifyYn) : that.notifyYn != null) return false;
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (notifyYn != null ? notifyYn.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (dataSyncYn != null ? dataSyncYn.hashCode() : 0);
        return result;
    }
}
