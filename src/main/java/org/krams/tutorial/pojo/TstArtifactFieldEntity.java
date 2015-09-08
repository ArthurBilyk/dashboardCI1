package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_ARTIFACT_FIELD", schema = "dbo", catalog = "SpiraTeam")
public class TstArtifactFieldEntity {
    private int artifactFieldId;
    private String name;
    private String caption;
    private String workflowConfigYn;
    private String activeYn;
    private String listConfigYn;
    private String listDefaultYn;
    private Integer listDefaultPosition;
    private String dataMappingYn;
    private String reportYn;
    private String notifyYn;
    private String description;
    private String lookupProperty;
    private boolean isHistoryRecorded;

    @Id
    @Column(name = "ARTIFACT_FIELD_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactFieldId() {
        return artifactFieldId;
    }

    public void setArtifactFieldId(int artifactFieldId) {
        this.artifactFieldId = artifactFieldId;
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
    @Column(name = "CAPTION", nullable = false, insertable = true, updatable = true)
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Basic
    @Column(name = "WORKFLOW_CONFIG_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getWorkflowConfigYn() {
        return workflowConfigYn;
    }

    public void setWorkflowConfigYn(String workflowConfigYn) {
        this.workflowConfigYn = workflowConfigYn;
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
    @Column(name = "LIST_CONFIG_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getListConfigYn() {
        return listConfigYn;
    }

    public void setListConfigYn(String listConfigYn) {
        this.listConfigYn = listConfigYn;
    }

    @Basic
    @Column(name = "LIST_DEFAULT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getListDefaultYn() {
        return listDefaultYn;
    }

    public void setListDefaultYn(String listDefaultYn) {
        this.listDefaultYn = listDefaultYn;
    }

    @Basic
    @Column(name = "LIST_DEFAULT_POSITION", nullable = true, insertable = true, updatable = true)
    public Integer getListDefaultPosition() {
        return listDefaultPosition;
    }

    public void setListDefaultPosition(Integer listDefaultPosition) {
        this.listDefaultPosition = listDefaultPosition;
    }

    @Basic
    @Column(name = "DATA_MAPPING_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDataMappingYn() {
        return dataMappingYn;
    }

    public void setDataMappingYn(String dataMappingYn) {
        this.dataMappingYn = dataMappingYn;
    }

    @Basic
    @Column(name = "REPORT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getReportYn() {
        return reportYn;
    }

    public void setReportYn(String reportYn) {
        this.reportYn = reportYn;
    }

    @Basic
    @Column(name = "NOTIFY_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getNotifyYn() {
        return notifyYn;
    }

    public void setNotifyYn(String notifyYn) {
        this.notifyYn = notifyYn;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "LOOKUP_PROPERTY", nullable = true, insertable = true, updatable = true)
    public String getLookupProperty() {
        return lookupProperty;
    }

    public void setLookupProperty(String lookupProperty) {
        this.lookupProperty = lookupProperty;
    }

    @Basic
    @Column(name = "IS_HISTORY_RECORDED", nullable = false, insertable = true, updatable = true)
    public boolean isHistoryRecorded() {
        return isHistoryRecorded;
    }

    public void setHistoryRecorded(boolean isHistoryRecorded) {
        this.isHistoryRecorded = isHistoryRecorded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstArtifactFieldEntity that = (TstArtifactFieldEntity) o;

        if (artifactFieldId != that.artifactFieldId) return false;
        if (isHistoryRecorded != that.isHistoryRecorded) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (caption != null ? !caption.equals(that.caption) : that.caption != null) return false;
        if (dataMappingYn != null ? !dataMappingYn.equals(that.dataMappingYn) : that.dataMappingYn != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (listConfigYn != null ? !listConfigYn.equals(that.listConfigYn) : that.listConfigYn != null) return false;
        if (listDefaultPosition != null ? !listDefaultPosition.equals(that.listDefaultPosition) : that.listDefaultPosition != null)
            return false;
        if (listDefaultYn != null ? !listDefaultYn.equals(that.listDefaultYn) : that.listDefaultYn != null)
            return false;
        if (lookupProperty != null ? !lookupProperty.equals(that.lookupProperty) : that.lookupProperty != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (notifyYn != null ? !notifyYn.equals(that.notifyYn) : that.notifyYn != null) return false;
        if (reportYn != null ? !reportYn.equals(that.reportYn) : that.reportYn != null) return false;
        if (workflowConfigYn != null ? !workflowConfigYn.equals(that.workflowConfigYn) : that.workflowConfigYn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactFieldId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + (workflowConfigYn != null ? workflowConfigYn.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (listConfigYn != null ? listConfigYn.hashCode() : 0);
        result = 31 * result + (listDefaultYn != null ? listDefaultYn.hashCode() : 0);
        result = 31 * result + (listDefaultPosition != null ? listDefaultPosition.hashCode() : 0);
        result = 31 * result + (dataMappingYn != null ? dataMappingYn.hashCode() : 0);
        result = 31 * result + (reportYn != null ? reportYn.hashCode() : 0);
        result = 31 * result + (notifyYn != null ? notifyYn.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lookupProperty != null ? lookupProperty.hashCode() : 0);
        result = 31 * result + (isHistoryRecorded ? 1 : 0);
        return result;
    }
}
