package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_PROJECT_ROLE", schema = "dbo", catalog = "SpiraTeam")
public class TstProjectRoleEntity {
    private int projectRoleId;
    private String name;
    private String activeYn;
    private String description;
    private String adminYn;
    private String documentsAddYn;
    private String documentsEditYn;
    private String documentsDeleteYn;
    private String discussionsAddYn;
    private String sourceCodeViewYn;
    private String sourceCodeEditYn;
    private String documentFoldersEditYn;
    private String limitedViewYn;

    @Id
    @Column(name = "PROJECT_ROLE_ID", nullable = false, insertable = true, updatable = true)
    public int getProjectRoleId() {
        return projectRoleId;
    }

    public void setProjectRoleId(int projectRoleId) {
        this.projectRoleId = projectRoleId;
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
    @Column(name = "ACTIVE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
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
    @Column(name = "ADMIN_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAdminYn() {
        return adminYn;
    }

    public void setAdminYn(String adminYn) {
        this.adminYn = adminYn;
    }

    @Basic
    @Column(name = "DOCUMENTS_ADD_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDocumentsAddYn() {
        return documentsAddYn;
    }

    public void setDocumentsAddYn(String documentsAddYn) {
        this.documentsAddYn = documentsAddYn;
    }

    @Basic
    @Column(name = "DOCUMENTS_EDIT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDocumentsEditYn() {
        return documentsEditYn;
    }

    public void setDocumentsEditYn(String documentsEditYn) {
        this.documentsEditYn = documentsEditYn;
    }

    @Basic
    @Column(name = "DOCUMENTS_DELETE_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDocumentsDeleteYn() {
        return documentsDeleteYn;
    }

    public void setDocumentsDeleteYn(String documentsDeleteYn) {
        this.documentsDeleteYn = documentsDeleteYn;
    }

    @Basic
    @Column(name = "DISCUSSIONS_ADD_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDiscussionsAddYn() {
        return discussionsAddYn;
    }

    public void setDiscussionsAddYn(String discussionsAddYn) {
        this.discussionsAddYn = discussionsAddYn;
    }

    @Basic
    @Column(name = "SOURCE_CODE_VIEW_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getSourceCodeViewYn() {
        return sourceCodeViewYn;
    }

    public void setSourceCodeViewYn(String sourceCodeViewYn) {
        this.sourceCodeViewYn = sourceCodeViewYn;
    }

    @Basic
    @Column(name = "SOURCE_CODE_EDIT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getSourceCodeEditYn() {
        return sourceCodeEditYn;
    }

    public void setSourceCodeEditYn(String sourceCodeEditYn) {
        this.sourceCodeEditYn = sourceCodeEditYn;
    }

    @Basic
    @Column(name = "DOCUMENT_FOLDERS_EDIT_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDocumentFoldersEditYn() {
        return documentFoldersEditYn;
    }

    public void setDocumentFoldersEditYn(String documentFoldersEditYn) {
        this.documentFoldersEditYn = documentFoldersEditYn;
    }

    @Basic
    @Column(name = "LIMITED_VIEW_YN", nullable = false, insertable = true, updatable = true, length = 1)
    public String getLimitedViewYn() {
        return limitedViewYn;
    }

    public void setLimitedViewYn(String limitedViewYn) {
        this.limitedViewYn = limitedViewYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstProjectRoleEntity that = (TstProjectRoleEntity) o;

        if (projectRoleId != that.projectRoleId) return false;
        if (activeYn != null ? !activeYn.equals(that.activeYn) : that.activeYn != null) return false;
        if (adminYn != null ? !adminYn.equals(that.adminYn) : that.adminYn != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (discussionsAddYn != null ? !discussionsAddYn.equals(that.discussionsAddYn) : that.discussionsAddYn != null)
            return false;
        if (documentFoldersEditYn != null ? !documentFoldersEditYn.equals(that.documentFoldersEditYn) : that.documentFoldersEditYn != null)
            return false;
        if (documentsAddYn != null ? !documentsAddYn.equals(that.documentsAddYn) : that.documentsAddYn != null)
            return false;
        if (documentsDeleteYn != null ? !documentsDeleteYn.equals(that.documentsDeleteYn) : that.documentsDeleteYn != null)
            return false;
        if (documentsEditYn != null ? !documentsEditYn.equals(that.documentsEditYn) : that.documentsEditYn != null)
            return false;
        if (limitedViewYn != null ? !limitedViewYn.equals(that.limitedViewYn) : that.limitedViewYn != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sourceCodeEditYn != null ? !sourceCodeEditYn.equals(that.sourceCodeEditYn) : that.sourceCodeEditYn != null)
            return false;
        if (sourceCodeViewYn != null ? !sourceCodeViewYn.equals(that.sourceCodeViewYn) : that.sourceCodeViewYn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectRoleId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (activeYn != null ? activeYn.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (adminYn != null ? adminYn.hashCode() : 0);
        result = 31 * result + (documentsAddYn != null ? documentsAddYn.hashCode() : 0);
        result = 31 * result + (documentsEditYn != null ? documentsEditYn.hashCode() : 0);
        result = 31 * result + (documentsDeleteYn != null ? documentsDeleteYn.hashCode() : 0);
        result = 31 * result + (discussionsAddYn != null ? discussionsAddYn.hashCode() : 0);
        result = 31 * result + (sourceCodeViewYn != null ? sourceCodeViewYn.hashCode() : 0);
        result = 31 * result + (sourceCodeEditYn != null ? sourceCodeEditYn.hashCode() : 0);
        result = 31 * result + (documentFoldersEditYn != null ? documentFoldersEditYn.hashCode() : 0);
        result = 31 * result + (limitedViewYn != null ? limitedViewYn.hashCode() : 0);
        return result;
    }
}
