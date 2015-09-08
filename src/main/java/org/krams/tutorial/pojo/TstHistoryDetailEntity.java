package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_HISTORY_DETAIL", schema = "dbo", catalog = "SpiraTeam")
public class TstHistoryDetailEntity {
    private int artifactHistoryId;
    private String fieldName;
    private String oldValue;
    private String fieldCaption;
    private String newValue;
    private Integer oldValueInt;
    private Timestamp oldValueDate;
    private Integer newValueInt;
    private Timestamp newValueDate;

    @Id
    @Column(name = "ARTIFACT_HISTORY_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactHistoryId() {
        return artifactHistoryId;
    }

    public void setArtifactHistoryId(int artifactHistoryId) {
        this.artifactHistoryId = artifactHistoryId;
    }

    @Basic
    @Column(name = "FIELD_NAME", nullable = false, insertable = true, updatable = true)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "OLD_VALUE", nullable = true, insertable = true, updatable = true)
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    @Basic
    @Column(name = "FIELD_CAPTION", nullable = false, insertable = true, updatable = true)
    public String getFieldCaption() {
        return fieldCaption;
    }

    public void setFieldCaption(String fieldCaption) {
        this.fieldCaption = fieldCaption;
    }

    @Basic
    @Column(name = "NEW_VALUE", nullable = true, insertable = true, updatable = true)
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    @Basic
    @Column(name = "OLD_VALUE_INT", nullable = true, insertable = true, updatable = true)
    public Integer getOldValueInt() {
        return oldValueInt;
    }

    public void setOldValueInt(Integer oldValueInt) {
        this.oldValueInt = oldValueInt;
    }

    @Basic
    @Column(name = "OLD_VALUE_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getOldValueDate() {
        return oldValueDate;
    }

    public void setOldValueDate(Timestamp oldValueDate) {
        this.oldValueDate = oldValueDate;
    }

    @Basic
    @Column(name = "NEW_VALUE_INT", nullable = true, insertable = true, updatable = true)
    public Integer getNewValueInt() {
        return newValueInt;
    }

    public void setNewValueInt(Integer newValueInt) {
        this.newValueInt = newValueInt;
    }

    @Basic
    @Column(name = "NEW_VALUE_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getNewValueDate() {
        return newValueDate;
    }

    public void setNewValueDate(Timestamp newValueDate) {
        this.newValueDate = newValueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstHistoryDetailEntity that = (TstHistoryDetailEntity) o;

        if (artifactHistoryId != that.artifactHistoryId) return false;
        if (fieldCaption != null ? !fieldCaption.equals(that.fieldCaption) : that.fieldCaption != null) return false;
        if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null) return false;
        if (newValue != null ? !newValue.equals(that.newValue) : that.newValue != null) return false;
        if (newValueDate != null ? !newValueDate.equals(that.newValueDate) : that.newValueDate != null) return false;
        if (newValueInt != null ? !newValueInt.equals(that.newValueInt) : that.newValueInt != null) return false;
        if (oldValue != null ? !oldValue.equals(that.oldValue) : that.oldValue != null) return false;
        if (oldValueDate != null ? !oldValueDate.equals(that.oldValueDate) : that.oldValueDate != null) return false;
        if (oldValueInt != null ? !oldValueInt.equals(that.oldValueInt) : that.oldValueInt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactHistoryId;
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (oldValue != null ? oldValue.hashCode() : 0);
        result = 31 * result + (fieldCaption != null ? fieldCaption.hashCode() : 0);
        result = 31 * result + (newValue != null ? newValue.hashCode() : 0);
        result = 31 * result + (oldValueInt != null ? oldValueInt.hashCode() : 0);
        result = 31 * result + (oldValueDate != null ? oldValueDate.hashCode() : 0);
        result = 31 * result + (newValueInt != null ? newValueInt.hashCode() : 0);
        result = 31 * result + (newValueDate != null ? newValueDate.hashCode() : 0);
        return result;
    }
}
