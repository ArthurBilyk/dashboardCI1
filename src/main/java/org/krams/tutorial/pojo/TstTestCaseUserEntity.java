package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_CASE_USER", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstTestCaseUserEntityPK.class)
public class TstTestCaseUserEntity {
    private int testCaseId;
    private int userId;
    private String expandedYn;
    private String visibleYn;

    @Id
    @Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
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
    @Column(name = "EXPANDED_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getExpandedYn() {
        return expandedYn;
    }

    public void setExpandedYn(String expandedYn) {
        this.expandedYn = expandedYn;
    }

    @Basic
    @Column(name = "VISIBLE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getVisibleYn() {
        return visibleYn;
    }

    public void setVisibleYn(String visibleYn) {
        this.visibleYn = visibleYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestCaseUserEntity that = (TstTestCaseUserEntity) o;

        if (testCaseId != that.testCaseId) return false;
        if (userId != that.userId) return false;
        if (expandedYn != null ? !expandedYn.equals(that.expandedYn) : that.expandedYn != null) return false;
        if (visibleYn != null ? !visibleYn.equals(that.visibleYn) : that.visibleYn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testCaseId;
        result = 31 * result + userId;
        result = 31 * result + (expandedYn != null ? expandedYn.hashCode() : 0);
        result = 31 * result + (visibleYn != null ? visibleYn.hashCode() : 0);
        return result;
    }
}
