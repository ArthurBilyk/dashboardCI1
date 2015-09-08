package org.krams.tutorial.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_USER_PROFILE", schema = "dbo", catalog = "SpiraTeam")
public class TstUserProfileEntity {
    private int userId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private boolean isAdmin;
    private boolean isEmailEnabled;
    private String department;
    private Timestamp lastUpdateDate;
    private String timezone;
    private String avatarImage;
    private boolean isBusy;
    private boolean isAway;
    private int unreadMessages;
    private String avatarMimeType;

    @Id
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, insertable = true, updatable = true)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "MIDDLE_INITIAL", nullable = true, insertable = true, updatable = true)
    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, insertable = true, updatable = true)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "IS_ADMIN", nullable = false, insertable = true, updatable = true)
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Basic
    @Column(name = "IS_EMAIL_ENABLED", nullable = false, insertable = true, updatable = true)
    public boolean isEmailEnabled() {
        return isEmailEnabled;
    }

    public void setEmailEnabled(boolean isEmailEnabled) {
        this.isEmailEnabled = isEmailEnabled;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, insertable = true, updatable = true)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "TIMEZONE", nullable = true, insertable = true, updatable = true)
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "AVATAR_IMAGE", nullable = true, insertable = true, updatable = true)
    public String getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(String avatarImage) {
        this.avatarImage = avatarImage;
    }

    @Basic
    @Column(name = "IS_BUSY", nullable = false, insertable = true, updatable = true)
    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    @Basic
    @Column(name = "IS_AWAY", nullable = false, insertable = true, updatable = true)
    public boolean isAway() {
        return isAway;
    }

    public void setAway(boolean isAway) {
        this.isAway = isAway;
    }

    @Basic
    @Column(name = "UNREAD_MESSAGES", nullable = false, insertable = true, updatable = true)
    public int getUnreadMessages() {
        return unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }

    @Basic
    @Column(name = "AVATAR_MIME_TYPE", nullable = true, insertable = true, updatable = true)
    public String getAvatarMimeType() {
        return avatarMimeType;
    }

    public void setAvatarMimeType(String avatarMimeType) {
        this.avatarMimeType = avatarMimeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstUserProfileEntity that = (TstUserProfileEntity) o;

        if (isAdmin != that.isAdmin) return false;
        if (isAway != that.isAway) return false;
        if (isBusy != that.isBusy) return false;
        if (isEmailEnabled != that.isEmailEnabled) return false;
        if (unreadMessages != that.unreadMessages) return false;
        if (userId != that.userId) return false;
        if (avatarImage != null ? !avatarImage.equals(that.avatarImage) : that.avatarImage != null) return false;
        if (avatarMimeType != null ? !avatarMimeType.equals(that.avatarMimeType) : that.avatarMimeType != null)
            return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (middleInitial != null ? !middleInitial.equals(that.middleInitial) : that.middleInitial != null)
            return false;
        if (timezone != null ? !timezone.equals(that.timezone) : that.timezone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInitial != null ? middleInitial.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (isAdmin ? 1 : 0);
        result = 31 * result + (isEmailEnabled ? 1 : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        result = 31 * result + (avatarImage != null ? avatarImage.hashCode() : 0);
        result = 31 * result + (isBusy ? 1 : 0);
        result = 31 * result + (isAway ? 1 : 0);
        result = 31 * result + unreadMessages;
        result = 31 * result + (avatarMimeType != null ? avatarMimeType.hashCode() : 0);
        return result;
    }
}
