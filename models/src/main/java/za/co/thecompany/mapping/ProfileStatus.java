package za.co.thecompany.mapping;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by thabiso.shangase on 2017/12/30.
 */
public class ProfileStatus implements Serializable {
    private String header;
    private Long profileStatusId;
    private String profilePicturePath;
    private String pictureName;
    private Collection<UserInfo> userInfos;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Long getProfileStatusId() {
        return profileStatusId;
    }

    public void setProfileStatusId(Long profileStatusId) {
        this.profileStatusId = profileStatusId;
    }

    public String getProfilePicturePath() {
        return profilePicturePath;
    }

    public void setProfilePicturePath(String profilePicturePath) {
        this.profilePicturePath = profilePicturePath;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfileStatus that = (ProfileStatus) o;

        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (profileStatusId != null ? !profileStatusId.equals(that.profileStatusId) : that.profileStatusId != null)
            return false;
        if (profilePicturePath != null ? !profilePicturePath.equals(that.profilePicturePath) : that.profilePicturePath != null)
            return false;
        if (pictureName != null ? !pictureName.equals(that.pictureName) : that.pictureName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = header != null ? header.hashCode() : 0;
        result = 31 * result + (profileStatusId != null ? profileStatusId.hashCode() : 0);
        result = 31 * result + (profilePicturePath != null ? profilePicturePath.hashCode() : 0);
        result = 31 * result + (pictureName != null ? pictureName.hashCode() : 0);
        return result;
    }

    public Collection<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(Collection<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }
}
