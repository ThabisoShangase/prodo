package za.co.thecompany.mapping;

import java.io.Serializable;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class PortfolioAssociatedFile implements Serializable {
    private Long asscociatedFileId;
    private Portfolio portfolio;
    private FileInfo fileInfo;

    public Long getAsscociatedFileId() {
        return asscociatedFileId;
    }

    public void setAsscociatedFileId(Long asscociatedFileId) {
        this.asscociatedFileId = asscociatedFileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PortfolioAssociatedFile that = (PortfolioAssociatedFile) o;

        if (asscociatedFileId != null ? !asscociatedFileId.equals(that.asscociatedFileId) : that.asscociatedFileId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = asscociatedFileId != null ? asscociatedFileId.hashCode() : 0;
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
