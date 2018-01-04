package za.co.thecompany.mapping;

import java.io.Serializable;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class PostFile implements Serializable {
    private Long postFileId;
    private Post post;
    private FileInfo fileInfo;

    public Long getPostFileId() {
        return postFileId;
    }

    public void setPostFileId(Long postFileId) {
        this.postFileId = postFileId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostFile postFile = (PostFile) o;

        if (postFileId != null ? !postFileId.equals(postFile.postFileId) : postFile.postFileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postFileId != null ? postFileId.hashCode() : 0;
        return result;
    }
}
