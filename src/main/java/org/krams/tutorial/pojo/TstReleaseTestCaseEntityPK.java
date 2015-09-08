package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstReleaseTestCaseEntityPK implements Serializable {
    private int releaseId;
    private int testCaseId;

    @Column(name = "RELEASE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    @Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    @Id
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

        TstReleaseTestCaseEntityPK that = (TstReleaseTestCaseEntityPK) o;

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
