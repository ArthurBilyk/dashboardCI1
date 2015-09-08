package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_USER_CONTACT", schema = "dbo", catalog = "SpiraTeam")
@IdClass(TstUserContactEntityPK.class)
public class TstUserContactEntity {
    private int creatorUserId;
    private int contactUserId;

    @Id
    @Column(name = "CREATOR_USER_ID", nullable = false, insertable = true, updatable = true)
    public int getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(int creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    @Id
    @Column(name = "CONTACT_USER_ID", nullable = false, insertable = true, updatable = true)
    public int getContactUserId() {
        return contactUserId;
    }

    public void setContactUserId(int contactUserId) {
        this.contactUserId = contactUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstUserContactEntity that = (TstUserContactEntity) o;

        if (contactUserId != that.contactUserId) return false;
        if (creatorUserId != that.creatorUserId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = creatorUserId;
        result = 31 * result + contactUserId;
        return result;
    }
}
