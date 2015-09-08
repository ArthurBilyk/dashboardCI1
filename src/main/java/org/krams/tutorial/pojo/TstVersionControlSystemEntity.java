package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_VERSION_CONTROL_SYSTEM", schema = "dbo", catalog = "SpiraTeam")
public class TstVersionControlSystemEntity {
    private int versionControlSystemId;
    private String name;
    private String description;
    private String activeYn;
    private String connectionString;
    private String login;
    private String password;
    private String domain;
    private String custom01;
    private String custom02;
    private String custom03;
    private String custom04;
    private String custom05;

    @Id
    @Column(name = "VERSION_CONTROL_SYSTEM_ID", nullable = false, insertable = true, updatable = true)
    public int getVersionControlSystemId() {
        return versionControlSystemId;
    }

    public void setVersionControlSystemId(int versionControlSystemId) {
        this.versionControlSystemId = versionControlSystemId;
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
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Basic
    @Column(name = "CONNECTION_STRING", nullable = false, insertable = true, updatable = true)
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Basic
    @Column(name = "LOGIN", nullable = false, insertable = true, updatable = true)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, insertable = true, updatable = true)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DOMAIN", nullable = true, insertable = true, updatable = true, length = 50)
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "CUSTOM_01", nullable = true, insertable = true, updatable = true)
    public String getCustom01() {
        return custom01;
    }

    public void setCustom01(String custom01) {
        this.custom01 = custom01;
    }

    @Basic
    @Column(name = "CUSTOM_02", nullable = true, insertable = true, updatable = true)
    public String getCustom02() {
        return custom02;
    }

    public void setCustom02(String custom02) {
        this.custom02 = custom02;
    }

    @Basic
    @Column(name = "CUSTOM_03", nullable = true, insertable = true, updatable = true)
    public String getCustom03() {
        return custom03;
    }

    public void setCustom03(String custom03) {
        this.custom03 = custom03;
    }

    @Basic
    @Column(name = "CUSTOM_04", nullable = true, insertable = true, updatable = true)
    public String getCustom04() {
        return custom04;
    }

    public void setCustom04(String custom04) {
        this.custom04 = custom04;
    }

    @Basic
    @Column(name = "CUSTOM_05", nullable = true, insertable = true, updatable = true)
    public String getCustom05() {
        return custom05;
    }

    public void setCustom05(String custom05) {
        this.custom05 = custom05;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstVersionControlSystemEntity that = (TstVersionControlSystemEntity) o;

        if (versionControlSystemId != that.versionControlSystemId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (connectionString != null ? !connectionString.equals(that.connectionString) : that.connectionString != null)
            return false;
        if (custom01 != null ? !custom01.equals(that.custom01) : that.custom01 != null) return false;
        if (custom02 != null ? !custom02.equals(that.custom02) : that.custom02 != null) return false;
        if (custom03 != null ? !custom03.equals(that.custom03) : that.custom03 != null) return false;
        if (custom04 != null ? !custom04.equals(that.custom04) : that.custom04 != null) return false;
        if (custom05 != null ? !custom05.equals(that.custom05) : that.custom05 != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = versionControlSystemId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (connectionString != null ? connectionString.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (custom01 != null ? custom01.hashCode() : 0);
        result = 31 * result + (custom02 != null ? custom02.hashCode() : 0);
        result = 31 * result + (custom03 != null ? custom03.hashCode() : 0);
        result = 31 * result + (custom04 != null ? custom04.hashCode() : 0);
        result = 31 * result + (custom05 != null ? custom05.hashCode() : 0);
        return result;
    }
}
