package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_DATA_SYNC_SYSTEM", schema = "dbo", catalog = "SpiraTeam")
public class TstDataSyncSystemEntity {
    private int dataSyncSystemId;
    private String name;
    private String description;
    private String connectionString;
    private String externalLogin;
    private String externalPassword;
    private int timeOffsetHours;
    private Timestamp lastSyncDate;
    private String custom01;
    private String custom02;
    private String custom03;
    private String custom04;
    private String custom05;
    private String autoMapUsersYn;

    @Id
    @Column(name = "DATA_SYNC_SYSTEM_ID", nullable = false, insertable = true, updatable = true)
    public int getDataSyncSystemId() {
        return dataSyncSystemId;
    }

    public void setDataSyncSystemId(int dataSyncSystemId) {
        this.dataSyncSystemId = dataSyncSystemId;
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
    @Column(name = "CONNECTION_STRING", nullable = false, insertable = true, updatable = true)
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Basic
    @Column(name = "EXTERNAL_LOGIN", nullable = false, insertable = true, updatable = true)
    public String getExternalLogin() {
        return externalLogin;
    }

    public void setExternalLogin(String externalLogin) {
        this.externalLogin = externalLogin;
    }

    @Basic
    @Column(name = "EXTERNAL_PASSWORD", nullable = true, insertable = true, updatable = true)
    public String getExternalPassword() {
        return externalPassword;
    }

    public void setExternalPassword(String externalPassword) {
        this.externalPassword = externalPassword;
    }

    @Basic
    @Column(name = "TIME_OFFSET_HOURS", nullable = false, insertable = true, updatable = true)
    public int getTimeOffsetHours() {
        return timeOffsetHours;
    }

    public void setTimeOffsetHours(int timeOffsetHours) {
        this.timeOffsetHours = timeOffsetHours;
    }

    @Basic
    @Column(name = "LAST_SYNC_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastSyncDate() {
        return lastSyncDate;
    }

    public void setLastSyncDate(Timestamp lastSyncDate) {
        this.lastSyncDate = lastSyncDate;
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

    @Basic
    @Column(name = "AUTO_MAP_USERS_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAutoMapUsersYn() {
        return autoMapUsersYn;
    }

    public void setAutoMapUsersYn(String autoMapUsersYn) {
        this.autoMapUsersYn = autoMapUsersYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstDataSyncSystemEntity that = (TstDataSyncSystemEntity) o;

        if (dataSyncSystemId != that.dataSyncSystemId) return false;
        if (timeOffsetHours != that.timeOffsetHours) return false;
        if (autoMapUsersYn != null ? !autoMapUsersYn.equals(that.autoMapUsersYn) : that.autoMapUsersYn != null)
            return false;
        if (connectionString != null ? !connectionString.equals(that.connectionString) : that.connectionString != null)
            return false;
        if (custom01 != null ? !custom01.equals(that.custom01) : that.custom01 != null) return false;
        if (custom02 != null ? !custom02.equals(that.custom02) : that.custom02 != null) return false;
        if (custom03 != null ? !custom03.equals(that.custom03) : that.custom03 != null) return false;
        if (custom04 != null ? !custom04.equals(that.custom04) : that.custom04 != null) return false;
        if (custom05 != null ? !custom05.equals(that.custom05) : that.custom05 != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (externalLogin != null ? !externalLogin.equals(that.externalLogin) : that.externalLogin != null)
            return false;
        if (externalPassword != null ? !externalPassword.equals(that.externalPassword) : that.externalPassword != null)
            return false;
        if (lastSyncDate != null ? !lastSyncDate.equals(that.lastSyncDate) : that.lastSyncDate != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataSyncSystemId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (connectionString != null ? connectionString.hashCode() : 0);
        result = 31 * result + (externalLogin != null ? externalLogin.hashCode() : 0);
        result = 31 * result + (externalPassword != null ? externalPassword.hashCode() : 0);
        result = 31 * result + timeOffsetHours;
        result = 31 * result + (lastSyncDate != null ? lastSyncDate.hashCode() : 0);
        result = 31 * result + (custom01 != null ? custom01.hashCode() : 0);
        result = 31 * result + (custom02 != null ? custom02.hashCode() : 0);
        result = 31 * result + (custom03 != null ? custom03.hashCode() : 0);
        result = 31 * result + (custom04 != null ? custom04.hashCode() : 0);
        result = 31 * result + (custom05 != null ? custom05.hashCode() : 0);
        result = 31 * result + (autoMapUsersYn != null ? autoMapUsersYn.hashCode() : 0);
        return result;
    }
}
