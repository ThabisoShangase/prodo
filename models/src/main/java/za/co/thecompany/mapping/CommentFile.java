package za.co.thecompany.mapping;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class CommentFile {
    private Long commentFileId;
    private Long commentId;
    private Long fileId;
    private CommentInfo commentInfo;
    private FileInfo fileInfo;

    public Long getCommentFileId() {
        return commentFileId;
    }

    public void setCommentFileId(Long commentFileId) {
        this.commentFileId = commentFileId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentFile that = (CommentFile) o;

        if (commentFileId != null ? !commentFileId.equals(that.commentFileId) : that.commentFileId != null)
            return false;
        if (commentId != null ? !commentId.equals(that.commentId) : that.commentId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentFileId != null ? commentFileId.hashCode() : 0;
        result = 31 * result + (commentId != null ? commentId.hashCode() : 0);
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
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
}
