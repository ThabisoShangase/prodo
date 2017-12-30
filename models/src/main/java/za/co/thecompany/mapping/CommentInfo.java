package za.co.thecompany.mapping;

import java.util.Collection;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class CommentInfo {
    private Long commentId;
    private String commentMessage;
    private Long postId;
    private Collection<CommentFile> commentFiles;
    private Post post;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getCommentMessage() {
        return commentMessage;
    }

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentInfo that = (CommentInfo) o;

        if (commentId != null ? !commentId.equals(that.commentId) : that.commentId != null) return false;
        if (commentMessage != null ? !commentMessage.equals(that.commentMessage) : that.commentMessage != null)
            return false;
        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId != null ? commentId.hashCode() : 0;
        result = 31 * result + (commentMessage != null ? commentMessage.hashCode() : 0);
        result = 31 * result + (postId != null ? postId.hashCode() : 0);
        return result;
    }

    public Collection<CommentFile> getCommentFiles() {
        return commentFiles;
    }

    public void setCommentFiles(Collection<CommentFile> commentFiles) {
        this.commentFiles = commentFiles;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
