package za.co.thecompany.mapping;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class Portfolio implements Serializable {
    private String heading;
    private Long portfolioId;
    private UserInfo userInfo;
    private Collection<PortfolioAssociatedFile> portfolioAssociatedFiles;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Collection<PortfolioAssociatedFile> getPortfolioAssociatedFiles() {
        return portfolioAssociatedFiles;
    }

    public void setPortfolioAssociatedFiles(Collection<PortfolioAssociatedFile> portfolioAssociatedFiles) {
        this.portfolioAssociatedFiles = portfolioAssociatedFiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Portfolio portfolio = (Portfolio) o;

        if (heading != null ? !heading.equals(portfolio.heading) : portfolio.heading != null) return false;
        if (portfolioId != null ? !portfolioId.equals(portfolio.portfolioId) : portfolio.portfolioId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = heading != null ? heading.hashCode() : 0;
        result = 31 * result + (portfolioId != null ? portfolioId.hashCode() : 0);
        return result;
    }
}
