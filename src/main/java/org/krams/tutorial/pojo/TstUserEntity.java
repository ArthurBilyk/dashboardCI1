package org.krams.tutorial.pojo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@javax.persistence.Table(name = "TST_USER", schema = "dbo", catalog = "SpiraTeam")
public class TstUserEntity {
    private int userId;

    @Id
    @javax.persistence.Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String userName;

    @Basic
    @javax.persistence.Column(name = "USER_NAME", nullable = false, insertable = true, updatable = true)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "PASSWORD", nullable = true, insertable = true, updatable = true)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String passwordSalt;

    @Basic
    @javax.persistence.Column(name = "PASSWORD_SALT", nullable = true, insertable = true, updatable = true)
    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    private String emailAddress;

    @Basic
    @javax.persistence.Column(name = "EMAIL_ADDRESS", nullable = false, insertable = true, updatable = true)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private boolean isActive;

    @Basic
    @javax.persistence.Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    private Timestamp creationDate;

    @Basic
    @javax.persistence.Column(name = "CREATION_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    private Timestamp lastLoginDate;

    @Basic
    @javax.persistence.Column(name = "LAST_LOGIN_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    private Timestamp lastActivityDate;

    @Basic
    @javax.persistence.Column(name = "LAST_ACTIVITY_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Timestamp lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    private Timestamp lastLockoutDate;

    @Basic
    @javax.persistence.Column(name = "LAST_LOCKOUT_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastLockoutDate() {
        return lastLockoutDate;
    }

    public void setLastLockoutDate(Timestamp lastLockoutDate) {
        this.lastLockoutDate = lastLockoutDate;
    }

    private Timestamp lastPasswordChangedDate;

    @Basic
    @javax.persistence.Column(name = "LAST_PASSWORD_CHANGED_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastPasswordChangedDate() {
        return lastPasswordChangedDate;
    }

    public void setLastPasswordChangedDate(Timestamp lastPasswordChangedDate) {
        this.lastPasswordChangedDate = lastPasswordChangedDate;
    }

    private String ldapDn;

    @Basic
    @javax.persistence.Column(name = "LDAP_DN", nullable = true, insertable = true, updatable = true)
    public String getLdapDn() {
        return ldapDn;
    }

    public void setLdapDn(String ldapDn) {
        this.ldapDn = ldapDn;
    }

    private String rssToken;

    @Basic
    @javax.persistence.Column(name = "RSS_TOKEN", nullable = true, insertable = true, updatable = true)
    public String getRssToken() {
        return rssToken;
    }

    public void setRssToken(String rssToken) {
        this.rssToken = rssToken;
    }

    private boolean isApproved;

    @Basic
    @javax.persistence.Column(name = "IS_APPROVED", nullable = false, insertable = true, updatable = true)
    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    private boolean isLocked;

    @Basic
    @javax.persistence.Column(name = "IS_LOCKED", nullable = false, insertable = true, updatable = true)
    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    private String comment;

    @Basic
    @javax.persistence.Column(name = "COMMENT", nullable = true, insertable = true, updatable = true)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private String passwordQuestion;

    @Basic
    @javax.persistence.Column(name = "PASSWORD_QUESTION", nullable = true, insertable = true, updatable = true)
    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        this.passwordQuestion = passwordQuestion;
    }

    private String passwordAnswer;

    @Basic
    @javax.persistence.Column(name = "PASSWORD_ANSWER", nullable = true, insertable = true, updatable = true)
    public String getPasswordAnswer() {
        return passwordAnswer;
    }

    public void setPasswordAnswer(String passwordAnswer) {
        this.passwordAnswer = passwordAnswer;
    }

    private int passwordFormat;

    @Basic
    @javax.persistence.Column(name = "PASSWORD_FORMAT", nullable = false, insertable = true, updatable = true)
    public int getPasswordFormat() {
        return passwordFormat;
    }

    public void setPasswordFormat(int passwordFormat) {
        this.passwordFormat = passwordFormat;
    }

    private int failedPasswordAttemptCount;

    @Basic
    @javax.persistence.Column(name = "FAILED_PASSWORD_ATTEMPT_COUNT", nullable = false, insertable = true, updatable = true)
    public int getFailedPasswordAttemptCount() {
        return failedPasswordAttemptCount;
    }

    public void setFailedPasswordAttemptCount(int failedPasswordAttemptCount) {
        this.failedPasswordAttemptCount = failedPasswordAttemptCount;
    }

    private Timestamp failedPasswordAttemptWindowStart;

    @Basic
    @javax.persistence.Column(name = "FAILED_PASSWORD_ATTEMPT_WINDOW_START", nullable = true, insertable = true, updatable = true)
    public Timestamp getFailedPasswordAttemptWindowStart() {
        return failedPasswordAttemptWindowStart;
    }

    public void setFailedPasswordAttemptWindowStart(Timestamp failedPasswordAttemptWindowStart) {
        this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
    }

    private int failedPasswordAnswerAttemptCount;

    @Basic
    @javax.persistence.Column(name = "FAILED_PASSWORD_ANSWER_ATTEMPT_COUNT", nullable = false, insertable = true, updatable = true)
    public int getFailedPasswordAnswerAttemptCount() {
        return failedPasswordAnswerAttemptCount;
    }

    public void setFailedPasswordAnswerAttemptCount(int failedPasswordAnswerAttemptCount) {
        this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
    }

    private Timestamp failedPasswordAnswerAttemptWindowStart;

    @Basic
    @javax.persistence.Column(name = "FAILED_PASSWORD_ANSWER_ATTEMPT_WINDOW_START", nullable = true, insertable = true, updatable = true)
    public Timestamp getFailedPasswordAnswerAttemptWindowStart() {
        return failedPasswordAnswerAttemptWindowStart;
    }

    public void setFailedPasswordAnswerAttemptWindowStart(Timestamp failedPasswordAnswerAttemptWindowStart) {
        this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
    }

    private boolean isLegacyFormat;

    @Basic
    @javax.persistence.Column(name = "IS_LEGACY_FORMAT", nullable = false, insertable = true, updatable = true)
    public boolean isLegacyFormat() {
        return isLegacyFormat;
    }

    public void setLegacyFormat(boolean isLegacyFormat) {
        this.isLegacyFormat = isLegacyFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstUserEntity that = (TstUserEntity) o;

        if (failedPasswordAnswerAttemptCount != that.failedPasswordAnswerAttemptCount) return false;
        if (failedPasswordAttemptCount != that.failedPasswordAttemptCount) return false;
        if (isActive != that.isActive) return false;
        if (isApproved != that.isApproved) return false;
        if (isLegacyFormat != that.isLegacyFormat) return false;
        if (isLocked != that.isLocked) return false;
        if (passwordFormat != that.passwordFormat) return false;
        if (userId != that.userId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (failedPasswordAnswerAttemptWindowStart != null ? !failedPasswordAnswerAttemptWindowStart.equals(that.failedPasswordAnswerAttemptWindowStart) : that.failedPasswordAnswerAttemptWindowStart != null)
            return false;
        if (failedPasswordAttemptWindowStart != null ? !failedPasswordAttemptWindowStart.equals(that.failedPasswordAttemptWindowStart) : that.failedPasswordAttemptWindowStart != null)
            return false;
        if (lastActivityDate != null ? !lastActivityDate.equals(that.lastActivityDate) : that.lastActivityDate != null)
            return false;
        if (lastLockoutDate != null ? !lastLockoutDate.equals(that.lastLockoutDate) : that.lastLockoutDate != null)
            return false;
        if (lastLoginDate != null ? !lastLoginDate.equals(that.lastLoginDate) : that.lastLoginDate != null)
            return false;
        if (lastPasswordChangedDate != null ? !lastPasswordChangedDate.equals(that.lastPasswordChangedDate) : that.lastPasswordChangedDate != null)
            return false;
        if (ldapDn != null ? !ldapDn.equals(that.ldapDn) : that.ldapDn != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (passwordAnswer != null ? !passwordAnswer.equals(that.passwordAnswer) : that.passwordAnswer != null)
            return false;
        if (passwordQuestion != null ? !passwordQuestion.equals(that.passwordQuestion) : that.passwordQuestion != null)
            return false;
        if (passwordSalt != null ? !passwordSalt.equals(that.passwordSalt) : that.passwordSalt != null) return false;
        if (rssToken != null ? !rssToken.equals(that.rssToken) : that.rssToken != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (passwordSalt != null ? passwordSalt.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastLoginDate != null ? lastLoginDate.hashCode() : 0);
        result = 31 * result + (lastActivityDate != null ? lastActivityDate.hashCode() : 0);
        result = 31 * result + (lastLockoutDate != null ? lastLockoutDate.hashCode() : 0);
        result = 31 * result + (lastPasswordChangedDate != null ? lastPasswordChangedDate.hashCode() : 0);
        result = 31 * result + (ldapDn != null ? ldapDn.hashCode() : 0);
        result = 31 * result + (rssToken != null ? rssToken.hashCode() : 0);
        result = 31 * result + (isApproved ? 1 : 0);
        result = 31 * result + (isLocked ? 1 : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (passwordQuestion != null ? passwordQuestion.hashCode() : 0);
        result = 31 * result + (passwordAnswer != null ? passwordAnswer.hashCode() : 0);
        result = 31 * result + passwordFormat;
        result = 31 * result + failedPasswordAttemptCount;
        result = 31 * result + (failedPasswordAttemptWindowStart != null ? failedPasswordAttemptWindowStart.hashCode() : 0);
        result = 31 * result + failedPasswordAnswerAttemptCount;
        result = 31 * result + (failedPasswordAnswerAttemptWindowStart != null ? failedPasswordAnswerAttemptWindowStart.hashCode() : 0);
        result = 31 * result + (isLegacyFormat ? 1 : 0);
        return result;
    }
}
