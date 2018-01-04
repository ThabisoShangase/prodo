package za.co.thecompany.mapping;

import java.io.Serializable;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class CommentFile implements Serializable {
    private Long commentFileId;
    private CommentInfo commentInfo;
    private FileInfo fileInfo;

    public Long getCommentFileId() {
        return commentFileId;
    }

    public void setCommentFileId(Long commentFileId) {
        this.commentFileId = commentFileId;
    }

    public CommentInfo getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentFile that = (CommentFile) o;

        if (commentFileId != null ? !commentFileId.equals(that.commentFileId) : that.commentFileId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentFileId != null ? commentFileId.hashCode() : 0;
        return result;
    }
}
