package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_MESSAGE", schema = "dbo", catalog = "SpiraTeam")
public class TstMessageEntity {
    private long messageId;
    private Timestamp creationDate;
    private Timestamp lastUpdateDate;
    private String body;
    private boolean isRead;
    private boolean isDeleted;

    @Id
    @Column(name = "MESSAGE_ID", nullable = false, insertable = true, updatable = true)
    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "BODY", nullable = false, insertable = true, updatable = true)
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "IS_READ", nullable = false, insertable = true, updatable = true)
    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstMessageEntity that = (TstMessageEntity) o;

        if (isDeleted != that.isDeleted) return false;
        if (isRead != that.isRead) return false;
        if (messageId != that.messageId) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (messageId ^ (messageId >>> 32));
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (isRead ? 1 : 0);
        result = 31 * result + (isDeleted ? 1 : 0);
        return result;
    }
}
