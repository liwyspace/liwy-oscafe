package com.liwy.oscafe.upms.entity;

/**
 * 用户实体类
 * Created by liwy on 2018/1/20.
 */
public class UpmsUser {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 用户账号
     *
     * @mbg.generated
     */
    private String username;

    /**
     * 密码MD5加密
     *
     * @mbg.generated
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String headpic;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    private String realname;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private Byte sex;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 电话
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * 状态 （0：正常，1：锁定）
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Long ctime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpmsUser upmsUser = (UpmsUser) o;

        if (userId != null ? !userId.equals(upmsUser.userId) : upmsUser.userId != null) return false;
        if (username != null ? !username.equals(upmsUser.username) : upmsUser.username != null) return false;
        if (password != null ? !password.equals(upmsUser.password) : upmsUser.password != null) return false;
        if (salt != null ? !salt.equals(upmsUser.salt) : upmsUser.salt != null) return false;
        if (nickname != null ? !nickname.equals(upmsUser.nickname) : upmsUser.nickname != null) return false;
        if (headpic != null ? !headpic.equals(upmsUser.headpic) : upmsUser.headpic != null) return false;
        if (realname != null ? !realname.equals(upmsUser.realname) : upmsUser.realname != null) return false;
        if (sex != null ? !sex.equals(upmsUser.sex) : upmsUser.sex != null) return false;
        if (email != null ? !email.equals(upmsUser.email) : upmsUser.email != null) return false;
        if (phone != null ? !phone.equals(upmsUser.phone) : upmsUser.phone != null) return false;
        if (status != null ? !status.equals(upmsUser.status) : upmsUser.status != null) return false;
        return ctime != null ? ctime.equals(upmsUser.ctime) : upmsUser.ctime == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (headpic != null ? headpic.hashCode() : 0);
        result = 31 * result + (realname != null ? realname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UpmsUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headpic='" + headpic + '\'' +
                ", realname='" + realname + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", ctime=" + ctime +
                '}';
    }
}
