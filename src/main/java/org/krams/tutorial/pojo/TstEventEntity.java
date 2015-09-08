package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_EVENT", schema = "dbo", catalog = "SpiraTeam")
public class TstEventEntity {
    private String eventId;
    private Timestamp eventTimeUtc;
    private Timestamp eventTime;
    private String eventCategory;
    private int eventSequence;
    private int eventOccurrence;
    private int eventCode;
    private int eventDetailCode;
    private String message;
    private String applicationPath;
    private String applicationVirtualPath;
    private String machineName;
    private String requestUrl;
    private String exceptionType;
    private String details;

    @Id
    @Column(name = "EVENT_ID", nullable = false, insertable = true, updatable = true, length = 32)
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "EVENT_TIME_UTC", nullable = false, insertable = true, updatable = true)
    public Timestamp getEventTimeUtc() {
        return eventTimeUtc;
    }

    public void setEventTimeUtc(Timestamp eventTimeUtc) {
        this.eventTimeUtc = eventTimeUtc;
    }

    @Basic
    @Column(name = "EVENT_TIME", nullable = false, insertable = true, updatable = true)
    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
    }

    @Basic
    @Column(name = "EVENT_CATEGORY", nullable = false, insertable = true, updatable = true)
    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Basic
    @Column(name = "EVENT_SEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEventSequence() {
        return eventSequence;
    }

    public void setEventSequence(int eventSequence) {
        this.eventSequence = eventSequence;
    }

    @Basic
    @Column(name = "EVENT_OCCURRENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEventOccurrence() {
        return eventOccurrence;
    }

    public void setEventOccurrence(int eventOccurrence) {
        this.eventOccurrence = eventOccurrence;
    }

    @Basic
    @Column(name = "EVENT_CODE", nullable = false, insertable = true, updatable = true)
    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    @Basic
    @Column(name = "EVENT_DETAIL_CODE", nullable = false, insertable = true, updatable = true)
    public int getEventDetailCode() {
        return eventDetailCode;
    }

    public void setEventDetailCode(int eventDetailCode) {
        this.eventDetailCode = eventDetailCode;
    }

    @Basic
    @Column(name = "MESSAGE", nullable = true, insertable = true, updatable = true)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "APPLICATION_PATH", nullable = true, insertable = true, updatable = true)
    public String getApplicationPath() {
        return applicationPath;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    @Basic
    @Column(name = "APPLICATION_VIRTUAL_PATH", nullable = true, insertable = true, updatable = true)
    public String getApplicationVirtualPath() {
        return applicationVirtualPath;
    }

    public void setApplicationVirtualPath(String applicationVirtualPath) {
        this.applicationVirtualPath = applicationVirtualPath;
    }

    @Basic
    @Column(name = "MACHINE_NAME", nullable = false, insertable = true, updatable = true)
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Basic
    @Column(name = "REQUEST_URL", nullable = true, insertable = true, updatable = true)
    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Basic
    @Column(name = "EXCEPTION_TYPE", nullable = true, insertable = true, updatable = true)
    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Basic
    @Column(name = "DETAILS", nullable = true, insertable = true, updatable = true)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstEventEntity that = (TstEventEntity) o;

        if (eventCode != that.eventCode) return false;
        if (eventDetailCode != that.eventDetailCode) return false;
        if (eventOccurrence != that.eventOccurrence) return false;
        if (eventSequence != that.eventSequence) return false;
        if (applicationPath != null ? !applicationPath.equals(that.applicationPath) : that.applicationPath != null)
            return false;
        if (applicationVirtualPath != null ? !applicationVirtualPath.equals(that.applicationVirtualPath) : that.applicationVirtualPath != null)
            return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (eventCategory != null ? !eventCategory.equals(that.eventCategory) : that.eventCategory != null)
            return false;
        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;
        if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null) return false;
        if (eventTimeUtc != null ? !eventTimeUtc.equals(that.eventTimeUtc) : that.eventTimeUtc != null) return false;
        if (exceptionType != null ? !exceptionType.equals(that.exceptionType) : that.exceptionType != null)
            return false;
        if (machineName != null ? !machineName.equals(that.machineName) : that.machineName != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (requestUrl != null ? !requestUrl.equals(that.requestUrl) : that.requestUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventId != null ? eventId.hashCode() : 0;
        result = 31 * result + (eventTimeUtc != null ? eventTimeUtc.hashCode() : 0);
        result = 31 * result + (eventTime != null ? eventTime.hashCode() : 0);
        result = 31 * result + (eventCategory != null ? eventCategory.hashCode() : 0);
        result = 31 * result + eventSequence;
        result = 31 * result + eventOccurrence;
        result = 31 * result + eventCode;
        result = 31 * result + eventDetailCode;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (applicationPath != null ? applicationPath.hashCode() : 0);
        result = 31 * result + (applicationVirtualPath != null ? applicationVirtualPath.hashCode() : 0);
        result = 31 * result + (machineName != null ? machineName.hashCode() : 0);
        result = 31 * result + (requestUrl != null ? requestUrl.hashCode() : 0);
        result = 31 * result + (exceptionType != null ? exceptionType.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        return result;
    }
}
