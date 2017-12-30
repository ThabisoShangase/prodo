package za.co.thecompany.mapping;

import java.util.Collection;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class UserInfo {
    private Long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private Long profileStatusId;
    private Collection<Portfolio> portfolios;
    private Collection<Post> posts;
    private ProfileStatus profileStatusByProfileStatusId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getProfileStatusId() {
        return profileStatusId;
    }

    public void setProfileStatusId(Long profileStatusId) {
        this.profileStatusId = profileStatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (userId != null ? !userId.equals(userInfo.userId) : userInfo.userId != null) return false;
        if (userName != null ? !userName.equals(userInfo.userName) : userInfo.userName != null) return false;
        if (firstName != null ? !firstName.equals(userInfo.firstName) : userInfo.firstName != null) return false;
        if (lastName != null ? !lastName.equals(userInfo.lastName) : userInfo.lastName != null) return false;
        if (profileStatusId != null ? !profileStatusId.equals(userInfo.profileStatusId) : userInfo.profileStatusId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (profileStatusId != null ? profileStatusId.hashCode() : 0);
        return result;
    }

    public Collection<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(Collection<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }

    public ProfileStatus getProfileStatusByProfileStatusId() {
        return profileStatusByProfileStatusId;
    }

    public void setProfileStatusByProfileStatusId(ProfileStatus profileStatusByProfileStatusId) {
        this.profileStatusByProfileStatusId = profileStatusByProfileStatusId;
    }
}
