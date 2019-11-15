package com.zcc.vo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;
@Data
@Table(name = "cc_user")
public class CcUser {
    @Id
    @KeySql(useGeneratedKeys = true)
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
    private Integer memberDays;
    private Integer userAge;
    private Date createTime;
    private Date lastupDate;
    //用户唯一标示
    private String openId;
    private String unionId;
    //线下会员(0不是1是，2申请VIP，审核中，3已完成)
    private Integer underLine;
    //上级
    private String parentId;
    //所有上级
    private String parentLevel;
    //我的二维码
    private String userQr;
    @Transient
    private String userLevel;
}
