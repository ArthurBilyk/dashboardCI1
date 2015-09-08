package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstTestCaseUserEntityPK implements Serializable {
    private int testCaseId;
    private int userId;

    @Column(name = "TEST_CASE_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestCaseUserEntityPK that = (TstTestCaseUserEntityPK) o;

        if (testCaseId != that.testCaseId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testCaseId;
        result = 31 * result + userId;
        return result;
    }
}
