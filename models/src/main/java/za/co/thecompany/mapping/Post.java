package za.co.thecompany.mapping;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class Post {
    private Long postId;
    private Timestamp postDate;
    private Long userId;
    private String postMessage;
    private Collection<CommentInfo> commentInfos;
    private UserInfo userInfo;
    private Collection<PostFile> postFiles;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Timestamp getPostDate() {
        return postDate;
    }

    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (postId != null ? !postId.equals(post.postId) : post.postId != null) return false;
        if (postDate != null ? !postDate.equals(post.postDate) : post.postDate != null) return false;
        if (userId != null ? !userId.equals(post.userId) : post.userId != null) return false;
        if (postMessage != null ? !postMessage.equals(post.postMessage) : post.postMessage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (postDate != null ? postDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (postMessage != null ? postMessage.hashCode() : 0);
        return result;
    }

    public Collection<CommentInfo> getCommentInfos() {
        return commentInfos;
    }

    public void setCommentInfos(Collection<CommentInfo> commentInfos) {
        this.commentInfos = commentInfos;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Collection<PostFile> getPostFiles() {
        return postFiles;
    }

    public void setPostFiles(Collection<PostFile> postFiles) {
        this.postFiles = postFiles;
    }
}
