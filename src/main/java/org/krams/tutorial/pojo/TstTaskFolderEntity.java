package org.krams.tutorial.pojo;

import javax.persistence.*;

/**
 * Created by dtv on 9/3/2015.
 */
@Entity
@Table(name = "TST_TASK_FOLDER", schema = "dbo", catalog = "SpiraTeam")
public class TstTaskFolderEntity {
    private int taskFolderId;
    private String name;

    @Id
    @Column(name = "TASK_FOLDER_ID", nullable = false, insertable = true, updatable = true)
    public int getTaskFolderId() {
        return taskFolderId;
    }

    public void setTaskFolderId(int taskFolderId) {
        this.taskFolderId = taskFolderId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TstTaskFolderEntity that = (TstTaskFolderEntity) o;

        if (taskFolderId != that.taskFolderId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskFolderId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
