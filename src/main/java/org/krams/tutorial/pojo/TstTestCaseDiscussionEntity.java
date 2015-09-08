package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_CASE_DISCUSSION", schema = "dbo", catalog = "SpiraTeam")
public class TstTestCaseDiscussionEntity {
    private int discussionId;
    private int creatorId;
    private String text;
    private Timestamp creationDate;
    private boolean deleted;

    @Id
    @Column(name = "DISCUSSION_ID", nullable = false, insertable = true, updatable = true)
    public int getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(int discussionId) {
        this.discussionId = discussionId;
    }

    @Basic
    @Column(name = "CREATOR_ID", nullable = false, insertable = true, updatable = true)
    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "TEXT", nullable = false, insertable = true, updatable = true)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
    @Column(name = "DELETED", nullable = false, insertable = true, updatable = true)
    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestCaseDiscussionEntity that = (TstTestCaseDiscussionEntity) o;

        if (creatorId != that.creatorId) return false;
        if (deleted != that.deleted) return false;
        if (discussionId != that.discussionId) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = discussionId;
        result = 31 * result + creatorId;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (deleted ? 1 : 0);
        return result;
    }
}
