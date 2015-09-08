package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstTestSetUserEntityPK implements Serializable {
    private int testSetId;
    private int userId;

    @Column(name = "TEST_SET_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTestSetId() {
        return testSetId;
    }

    public void setTestSetId(int testSetId) {
        this.testSetId = testSetId;
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

        TstTestSetUserEntityPK that = (TstTestSetUserEntityPK) o;

        if (testSetId != that.testSetId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testSetId;
        result = 31 * result + userId;
        return result;
    }
}
