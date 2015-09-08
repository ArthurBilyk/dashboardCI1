package org.krams.tutorial.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PLACEHOLDER", schema = "dbo", catalog = "SpiraTeam")
public class TstPlaceholderEntity {
    private int placeholderId;

    @Id
    @Column(name = "PLACEHOLDER_ID", nullable = false, insertable = true, updatable = true)
    public int getPlaceholderId() {
        return placeholderId;
    }

    public void setPlaceholderId(int placeholderId) {
        this.placeholderId = placeholderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstPlaceholderEntity that = (TstPlaceholderEntity) o;

        if (placeholderId != that.placeholderId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return placeholderId;
    }
}
