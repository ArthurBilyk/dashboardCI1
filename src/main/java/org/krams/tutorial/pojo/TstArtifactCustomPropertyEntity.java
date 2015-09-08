package org.krams.tutorial.pojo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@javax.persistence.Table(name = "TST_ARTIFACT_CUSTOM_PROPERTY", schema = "dbo", catalog = "SpiraTeam")
public class TstArtifactCustomPropertyEntity implements Serializable {
    private int artifactId;

    @Id
    @javax.persistence.Column(name = "ARTIFACT_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    private int artifactTypeId;

    @Id
    @javax.persistence.Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    private String cust01;

    @Basic
    @javax.persistence.Column(name = "CUST_01", nullable = true, insertable = true, updatable = true)
    public String getCust01() {
        return cust01;
    }

    public void setCust01(String cust01) {
        this.cust01 = cust01;
    }

    private String cust02;

    @Basic
    @javax.persistence.Column(name = "CUST_02", nullable = true, insertable = true, updatable = true)
    public String getCust02() {
        return cust02;
    }

    public void setCust02(String cust02) {
        this.cust02 = cust02;
    }

    private String cust03;

    @Basic
    @javax.persistence.Column(name = "CUST_03", nullable = true, insertable = true, updatable = true)
    public String getCust03() {
        return cust03;
    }

    public void setCust03(String cust03) {
        this.cust03 = cust03;
    }

    private String cust04;

    @Basic
    @javax.persistence.Column(name = "CUST_04", nullable = true, insertable = true, updatable = true)
    public String getCust04() {
        return cust04;
    }

    public void setCust04(String cust04) {
        this.cust04 = cust04;
    }

    private String cust05;

    @Basic
    @javax.persistence.Column(name = "CUST_05", nullable = true, insertable = true, updatable = true)
    public String getCust05() {
        return cust05;
    }

    public void setCust05(String cust05) {
        this.cust05 = cust05;
    }

    private String cust06;

    @Basic
    @javax.persistence.Column(name = "CUST_06", nullable = true, insertable = true, updatable = true)
    public String getCust06() {
        return cust06;
    }

    public void setCust06(String cust06) {
        this.cust06 = cust06;
    }

    private String cust07;

    @Basic
    @javax.persistence.Column(name = "CUST_07", nullable = true, insertable = true, updatable = true)
    public String getCust07() {
        return cust07;
    }

    public void setCust07(String cust07) {
        this.cust07 = cust07;
    }

    private String cust08;

    @Basic
    @javax.persistence.Column(name = "CUST_08", nullable = true, insertable = true, updatable = true)
    public String getCust08() {
        return cust08;
    }

    public void setCust08(String cust08) {
        this.cust08 = cust08;
    }

    private String cust09;

    @Basic
    @javax.persistence.Column(name = "CUST_09", nullable = true, insertable = true, updatable = true)
    public String getCust09() {
        return cust09;
    }

    public void setCust09(String cust09) {
        this.cust09 = cust09;
    }

    private String cust10;

    @Basic
    @javax.persistence.Column(name = "CUST_10", nullable = true, insertable = true, updatable = true)
    public String getCust10() {
        return cust10;
    }

    public void setCust10(String cust10) {
        this.cust10 = cust10;
    }

    private String cust11;

    @Basic
    @javax.persistence.Column(name = "CUST_11", nullable = true, insertable = true, updatable = true)
    public String getCust11() {
        return cust11;
    }

    public void setCust11(String cust11) {
        this.cust11 = cust11;
    }

    private String cust12;

    @Basic
    @javax.persistence.Column(name = "CUST_12", nullable = true, insertable = true, updatable = true)
    public String getCust12() {
        return cust12;
    }

    public void setCust12(String cust12) {
        this.cust12 = cust12;
    }

    private String cust13;

    @Basic
    @javax.persistence.Column(name = "CUST_13", nullable = true, insertable = true, updatable = true)
    public String getCust13() {
        return cust13;
    }

    public void setCust13(String cust13) {
        this.cust13 = cust13;
    }

    private String cust14;

    @Basic
    @javax.persistence.Column(name = "CUST_14", nullable = true, insertable = true, updatable = true)
    public String getCust14() {
        return cust14;
    }

    public void setCust14(String cust14) {
        this.cust14 = cust14;
    }

    private String cust15;

    @Basic
    @javax.persistence.Column(name = "CUST_15", nullable = true, insertable = true, updatable = true)
    public String getCust15() {
        return cust15;
    }

    public void setCust15(String cust15) {
        this.cust15 = cust15;
    }

    private String cust16;

    @Basic
    @javax.persistence.Column(name = "CUST_16", nullable = true, insertable = true, updatable = true)
    public String getCust16() {
        return cust16;
    }

    public void setCust16(String cust16) {
        this.cust16 = cust16;
    }

    private String cust17;

    @Basic
    @javax.persistence.Column(name = "CUST_17", nullable = true, insertable = true, updatable = true)
    public String getCust17() {
        return cust17;
    }

    public void setCust17(String cust17) {
        this.cust17 = cust17;
    }

    private String cust18;

    @Basic
    @javax.persistence.Column(name = "CUST_18", nullable = true, insertable = true, updatable = true)
    public String getCust18() {
        return cust18;
    }

    public void setCust18(String cust18) {
        this.cust18 = cust18;
    }

    private String cust19;

    @Basic
    @javax.persistence.Column(name = "CUST_19", nullable = true, insertable = true, updatable = true)
    public String getCust19() {
        return cust19;
    }

    public void setCust19(String cust19) {
        this.cust19 = cust19;
    }

    private String cust20;

    @Basic
    @javax.persistence.Column(name = "CUST_20", nullable = true, insertable = true, updatable = true)
    public String getCust20() {
        return cust20;
    }

    public void setCust20(String cust20) {
        this.cust20 = cust20;
    }

    private String cust21;

    @Basic
    @javax.persistence.Column(name = "CUST_21", nullable = true, insertable = true, updatable = true)
    public String getCust21() {
        return cust21;
    }

    public void setCust21(String cust21) {
        this.cust21 = cust21;
    }

    private String cust22;

    @Basic
    @javax.persistence.Column(name = "CUST_22", nullable = true, insertable = true, updatable = true)
    public String getCust22() {
        return cust22;
    }

    public void setCust22(String cust22) {
        this.cust22 = cust22;
    }

    private String cust23;

    @Basic
    @javax.persistence.Column(name = "CUST_23", nullable = true, insertable = true, updatable = true)
    public String getCust23() {
        return cust23;
    }

    public void setCust23(String cust23) {
        this.cust23 = cust23;
    }

    private String cust24;

    @Basic
    @javax.persistence.Column(name = "CUST_24", nullable = true, insertable = true, updatable = true)
    public String getCust24() {
        return cust24;
    }

    public void setCust24(String cust24) {
        this.cust24 = cust24;
    }

    private String cust25;

    @Basic
    @javax.persistence.Column(name = "CUST_25", nullable = true, insertable = true, updatable = true)
    public String getCust25() {
        return cust25;
    }

    public void setCust25(String cust25) {
        this.cust25 = cust25;
    }

    private String cust26;

    @Basic
    @javax.persistence.Column(name = "CUST_26", nullable = true, insertable = true, updatable = true)
    public String getCust26() {
        return cust26;
    }

    public void setCust26(String cust26) {
        this.cust26 = cust26;
    }

    private String cust27;

    @Basic
    @javax.persistence.Column(name = "CUST_27", nullable = true, insertable = true, updatable = true)
    public String getCust27() {
        return cust27;
    }

    public void setCust27(String cust27) {
        this.cust27 = cust27;
    }

    private String cust28;

    @Basic
    @javax.persistence.Column(name = "CUST_28", nullable = true, insertable = true, updatable = true)
    public String getCust28() {
        return cust28;
    }

    public void setCust28(String cust28) {
        this.cust28 = cust28;
    }

    private String cust29;

    @Basic
    @javax.persistence.Column(name = "CUST_29", nullable = true, insertable = true, updatable = true)
    public String getCust29() {
        return cust29;
    }

    public void setCust29(String cust29) {
        this.cust29 = cust29;
    }

    private String cust30;

    @Basic
    @javax.persistence.Column(name = "CUST_30", nullable = true, insertable = true, updatable = true)
    public String getCust30() {
        return cust30;
    }

    public void setCust30(String cust30) {
        this.cust30 = cust30;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstArtifactCustomPropertyEntity that = (TstArtifactCustomPropertyEntity) o;

        if (artifactId != that.artifactId) return false;
        if (artifactTypeId != that.artifactTypeId) return false;
        if (cust01 != null ? !cust01.equals(that.cust01) : that.cust01 != null) return false;
        if (cust02 != null ? !cust02.equals(that.cust02) : that.cust02 != null) return false;
        if (cust03 != null ? !cust03.equals(that.cust03) : that.cust03 != null) return false;
        if (cust04 != null ? !cust04.equals(that.cust04) : that.cust04 != null) return false;
        if (cust05 != null ? !cust05.equals(that.cust05) : that.cust05 != null) return false;
        if (cust06 != null ? !cust06.equals(that.cust06) : that.cust06 != null) return false;
        if (cust07 != null ? !cust07.equals(that.cust07) : that.cust07 != null) return false;
        if (cust08 != null ? !cust08.equals(that.cust08) : that.cust08 != null) return false;
        if (cust09 != null ? !cust09.equals(that.cust09) : that.cust09 != null) return false;
        if (cust10 != null ? !cust10.equals(that.cust10) : that.cust10 != null) return false;
        if (cust11 != null ? !cust11.equals(that.cust11) : that.cust11 != null) return false;
        if (cust12 != null ? !cust12.equals(that.cust12) : that.cust12 != null) return false;
        if (cust13 != null ? !cust13.equals(that.cust13) : that.cust13 != null) return false;
        if (cust14 != null ? !cust14.equals(that.cust14) : that.cust14 != null) return false;
        if (cust15 != null ? !cust15.equals(that.cust15) : that.cust15 != null) return false;
        if (cust16 != null ? !cust16.equals(that.cust16) : that.cust16 != null) return false;
        if (cust17 != null ? !cust17.equals(that.cust17) : that.cust17 != null) return false;
        if (cust18 != null ? !cust18.equals(that.cust18) : that.cust18 != null) return false;
        if (cust19 != null ? !cust19.equals(that.cust19) : that.cust19 != null) return false;
        if (cust20 != null ? !cust20.equals(that.cust20) : that.cust20 != null) return false;
        if (cust21 != null ? !cust21.equals(that.cust21) : that.cust21 != null) return false;
        if (cust22 != null ? !cust22.equals(that.cust22) : that.cust22 != null) return false;
        if (cust23 != null ? !cust23.equals(that.cust23) : that.cust23 != null) return false;
        if (cust24 != null ? !cust24.equals(that.cust24) : that.cust24 != null) return false;
        if (cust25 != null ? !cust25.equals(that.cust25) : that.cust25 != null) return false;
        if (cust26 != null ? !cust26.equals(that.cust26) : that.cust26 != null) return false;
        if (cust27 != null ? !cust27.equals(that.cust27) : that.cust27 != null) return false;
        if (cust28 != null ? !cust28.equals(that.cust28) : that.cust28 != null) return false;
        if (cust29 != null ? !cust29.equals(that.cust29) : that.cust29 != null) return false;
        if (cust30 != null ? !cust30.equals(that.cust30) : that.cust30 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artifactId;
        result = 31 * result + artifactTypeId;
        result = 31 * result + (cust01 != null ? cust01.hashCode() : 0);
        result = 31 * result + (cust02 != null ? cust02.hashCode() : 0);
        result = 31 * result + (cust03 != null ? cust03.hashCode() : 0);
        result = 31 * result + (cust04 != null ? cust04.hashCode() : 0);
        result = 31 * result + (cust05 != null ? cust05.hashCode() : 0);
        result = 31 * result + (cust06 != null ? cust06.hashCode() : 0);
        result = 31 * result + (cust07 != null ? cust07.hashCode() : 0);
        result = 31 * result + (cust08 != null ? cust08.hashCode() : 0);
        result = 31 * result + (cust09 != null ? cust09.hashCode() : 0);
        result = 31 * result + (cust10 != null ? cust10.hashCode() : 0);
        result = 31 * result + (cust11 != null ? cust11.hashCode() : 0);
        result = 31 * result + (cust12 != null ? cust12.hashCode() : 0);
        result = 31 * result + (cust13 != null ? cust13.hashCode() : 0);
        result = 31 * result + (cust14 != null ? cust14.hashCode() : 0);
        result = 31 * result + (cust15 != null ? cust15.hashCode() : 0);
        result = 31 * result + (cust16 != null ? cust16.hashCode() : 0);
        result = 31 * result + (cust17 != null ? cust17.hashCode() : 0);
        result = 31 * result + (cust18 != null ? cust18.hashCode() : 0);
        result = 31 * result + (cust19 != null ? cust19.hashCode() : 0);
        result = 31 * result + (cust20 != null ? cust20.hashCode() : 0);
        result = 31 * result + (cust21 != null ? cust21.hashCode() : 0);
        result = 31 * result + (cust22 != null ? cust22.hashCode() : 0);
        result = 31 * result + (cust23 != null ? cust23.hashCode() : 0);
        result = 31 * result + (cust24 != null ? cust24.hashCode() : 0);
        result = 31 * result + (cust25 != null ? cust25.hashCode() : 0);
        result = 31 * result + (cust26 != null ? cust26.hashCode() : 0);
        result = 31 * result + (cust27 != null ? cust27.hashCode() : 0);
        result = 31 * result + (cust28 != null ? cust28.hashCode() : 0);
        result = 31 * result + (cust29 != null ? cust29.hashCode() : 0);
        result = 31 * result + (cust30 != null ? cust30.hashCode() : 0);
        return result;
    }
}
