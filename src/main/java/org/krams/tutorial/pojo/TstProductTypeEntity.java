package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PRODUCT_TYPE", schema = "dbo", catalog = "SpiraTeam")
public class TstProductTypeEntity {
    private int productTypeId;
    private String name;
    private int productLicenseNumber;
    private String activeYn;

    @Id
    @Column(name = "PRODUCT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
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
    @Column(name = "PRODUCT_LICENSE_NUMBER", nullable = false, insertable = true, updatable = true)
    public int getProductLicenseNumber() {
        return productLicenseNumber;
    }

    public void setProductLicenseNumber(int productLicenseNumber) {
        this.productLicenseNumber = productLicenseNumber;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProductTypeEntity that = (TstProductTypeEntity) o;

        if (productLicenseNumber != that.productLicenseNumber) return false;
        if (productTypeId != that.productTypeId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + productLicenseNumber;
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        return result;
    }
}
