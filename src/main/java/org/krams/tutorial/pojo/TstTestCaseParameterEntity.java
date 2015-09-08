package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TEST_CASE_PARAMETER", schema = "dbo", catalog = "SpiraTeam")
public class TstTestCaseParameterEntity {
    private int testCaseParameterId;
    private String name;
    private String defaultValue;

    @Id
    @Column(name = "TEST_CASE_PARAMETER_ID", nullable = false, insertable = true, updatable = true)
    public int getTestCaseParameterId() {
        return testCaseParameterId;
    }

    public void setTestCaseParameterId(int testCaseParameterId) {
        this.testCaseParameterId = testCaseParameterId;
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
    @Column(name = "DEFAULT_VALUE", nullable = true, insertable = true, updatable = true)
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTestCaseParameterEntity that = (TstTestCaseParameterEntity) o;

        if (testCaseParameterId != that.testCaseParameterId) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testCaseParameterId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        return result;
    }
}
