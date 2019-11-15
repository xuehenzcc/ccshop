package com.zcc.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Document(collection = "user")
public class UserVO {

    @Id
    private Integer id;
    private String userPic;
    private String userStatus;
    private String userNick;
    private String userName;
    private String userPhone;
    private String userSex;
    private String userBirth;
    private String userLike;
    private List<String> userLikeList;

    private String memberExpires;
    private int memberDays;
    private int userAge;
    private Date createTime;
    private Date lastupDate;
    //用户唯一标示
    private String openId;
    private String unionId;
    //用户级别（0非会员1会员）
    private String userLevel;
    //线下会员(0不是1是，2申请VIP，审核中，3已完成)
    private int underLine;
    //上级
    private String parentId;
    //所有上级
    private String parentLevel;
    //我的二维码
    private String userQr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserLike() {
        return userLike;
    }

    public void setUserLike(String userLike) {
        this.userLike = userLike;
    }

    public List<String> getUserLikeList() {
        return userLikeList;
    }

    public void setUserLikeList(List<String> userLikeList) {
        this.userLikeList = userLikeList;
    }

    public String getMemberExpires() {
        return memberExpires;
    }

    public void setMemberExpires(String memberExpires) {
        this.memberExpires = memberExpires;
    }

    public int getMemberDays() {
        return memberDays;
    }

    public void setMemberDays(int memberDays) {
        this.memberDays = memberDays;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastupDate() {
        return lastupDate;
    }

    public void setLastupDate(Date lastupDate) {
        this.lastupDate = lastupDate;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public int getUnderLine() {
        return underLine;
    }

    public void setUnderLine(int underLine) {
        this.underLine = underLine;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentLevel() {
        return parentLevel;
    }

    public void setParentLevel(String parentLevel) {
        this.parentLevel = parentLevel;
    }

    public String getUserQr() {
        return userQr;
    }

    public void setUserQr(String userQr) {
        this.userQr = userQr;
    }
}
