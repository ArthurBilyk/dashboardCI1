package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtv on 9/3/2015.
 */
public class TstUserContactEntityPK implements Serializable {
    private int creatorUserId;
    private int contactUserId;

    @Column(name = "CREATOR_USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(int creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    @Column(name = "CONTACT_USER_ID", nullable = false, insertable = true, updatable = true)
    @Id
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

        TstUserContactEntityPK that = (TstUserContactEntityPK) o;

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
