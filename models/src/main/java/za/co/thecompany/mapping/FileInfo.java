package za.co.thecompany.mapping;

import java.util.Collection;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class FileInfo {
    private Long fileId;
    private String fileName;
    private String fileNize;
    private String filePath;
    private Collection<CommentFile> commentFiles;
    private Collection<PortfolioAssociatedFile> portfolioAssociatedFiles;
    private Collection<PostFile> postFiles;

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileNize() {
        return fileNize;
    }

    public void setFileNize(String fileNize) {
        this.fileNize = fileNize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileInfo fileInfo = (FileInfo) o;

        if (fileId != null ? !fileId.equals(fileInfo.fileId) : fileInfo.fileId != null) return false;
        if (fileName != null ? !fileName.equals(fileInfo.fileName) : fileInfo.fileName != null) return false;
        if (fileNize != null ? !fileNize.equals(fileInfo.fileNize) : fileInfo.fileNize != null) return false;
        if (filePath != null ? !filePath.equals(fileInfo.filePath) : fileInfo.filePath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (fileNize != null ? fileNize.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        return result;
    }

    public Collection<CommentFile> getCommentFiles() {
        return commentFiles;
    }

    public void setCommentFiles(Collection<CommentFile> commentFiles) {
        this.commentFiles = commentFiles;
    }

    public Collection<PortfolioAssociatedFile> getPortfolioAssociatedFiles() {
        return portfolioAssociatedFiles;
    }

    public void setPortfolioAssociatedFiles(Collection<PortfolioAssociatedFile> portfolioAssociatedFiles) {
        this.portfolioAssociatedFiles = portfolioAssociatedFiles;
    }

    public Collection<PostFile> getPostFiles() {
        return postFiles;
    }

    public void setPostFiles(Collection<PostFile> postFiles) {
        this.postFiles = postFiles;
    }
}
