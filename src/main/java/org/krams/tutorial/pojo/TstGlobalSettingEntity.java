package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_GLOBAL_SETTING", schema = "dbo", catalog = "SpiraTeam")
public class TstGlobalSettingEntity {
    private int globalSettingId;
    private String name;
    private String value;

    @Id
    @Column(name = "GLOBAL_SETTING_ID", nullable = false, insertable = true, updatable = true)
    public int getGlobalSettingId() {
        return globalSettingId;
    }

    public void setGlobalSettingId(int globalSettingId) {
        this.globalSettingId = globalSettingId;
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
    @Column(name = "VALUE", nullable = false, insertable = true, updatable = true)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstGlobalSettingEntity that = (TstGlobalSettingEntity) o;

        if (globalSettingId != that.globalSettingId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = globalSettingId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
