package za.co.thecompany.mapping;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class PortfolioAssociatedFile {
    private Long asscociatedFileId;
    private Long portfolioId;
    private Long fileId;
    private Portfolio portfolio;
    private FileInfo fileInfo;

    public Long getAsscociatedFileId() {
        return asscociatedFileId;
    }

    public void setAsscociatedFileId(Long asscociatedFileId) {
        this.asscociatedFileId = asscociatedFileId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
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

        PortfolioAssociatedFile that = (PortfolioAssociatedFile) o;

        if (asscociatedFileId != null ? !asscociatedFileId.equals(that.asscociatedFileId) : that.asscociatedFileId != null)
            return false;
        if (portfolioId != null ? !portfolioId.equals(that.portfolioId) : that.portfolioId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = asscociatedFileId != null ? asscociatedFileId.hashCode() : 0;
        result = 31 * result + (portfolioId != null ? portfolioId.hashCode() : 0);
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
