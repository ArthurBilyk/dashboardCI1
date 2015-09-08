package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_RELEASE_TEST_CASE", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstReleaseTestCaseEntityPK.class)
public class TstReleaseTestCaseEntity {
    private int releaseId;
    private int testCaseId;

    @Id
    @Column(name = "RELEASE_ID", nullable = false, insertable = true, updatable = true)
    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    @Id
    @Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstReleaseTestCaseEntity that = (TstReleaseTestCaseEntity) o;

        if (releaseId != that.releaseId) return false;
        if (testCaseId != that.testCaseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = releaseId;
        result = 31 * result + testCaseId;
        return result;
    }
}
