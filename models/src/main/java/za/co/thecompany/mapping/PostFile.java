package za.co.thecompany.mapping;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class PostFile {
    private Long postFileId;
    private Long postId;
    private Long fileId;
    private Post post;
    private FileInfo fileInfo;

    public Long getPostFileId() {
        return postFileId;
    }

    public void setPostFileId(Long postFileId) {
        this.postFileId = postFileId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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

        PostFile postFile = (PostFile) o;

        if (postFileId != null ? !postFileId.equals(postFile.postFileId) : postFile.postFileId != null) return false;
        if (postId != null ? !postId.equals(postFile.postId) : postFile.postId != null) return false;
        if (fileId != null ? !fileId.equals(postFile.fileId) : postFile.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postFileId != null ? postFileId.hashCode() : 0;
        result = 31 * result + (postId != null ? postId.hashCode() : 0);
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
