package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_NOTIFICATION_ARTIFACT_TEMPLATE", schema = "dbo", catalog = "SpiraTeam")
public class TstNotificationArtifactTemplateEntity {
    private String templateText;
    private int artifactTypeId;

    @Basic
    @Column(name = "TEMPLATE_TEXT", nullable = false, insertable = true, updatable = true)
    public String getTemplateText() {
        return templateText;
    }

    public void setTemplateText(String templateText) {
        this.templateText = templateText;
    }

    @Id
    @Column(name = "ARTIFACT_TYPE_ID", nullable = false, insertable = true, updatable = true)
    public int getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(int artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstNotificationArtifactTemplateEntity that = (TstNotificationArtifactTemplateEntity) o;

        if (artifactTypeId != that.artifactTypeId) return false;
        if (templateText != null ? !templateText.equals(that.templateText) : that.templateText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = templateText != null ? templateText.hashCode() : 0;
        result = 31 * result + artifactTypeId;
        return result;
    }
}
