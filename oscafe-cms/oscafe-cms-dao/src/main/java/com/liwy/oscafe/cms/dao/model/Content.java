/*
 * Copy Right LIWY
 * http://www.oscafe.net
 * 2019-06-29 23:42:05
 */
package com.liwy.oscafe.cms.dao.model;

import java.util.Date;

/**
 * 内容表实体类
 * 
 * @table cms_content
 * @author liwy
 * @date 2019-06-29 23:42:05
 */
public class Content {
    /**
     * 内容ID
     * 
     * column: id
     */
    private Integer id;

    /**
     * 栏目ID
     * 
     * column: channel_id
     */
    private Integer channelId;

    /**
     * 标题
     * 
     * column: title
     */
    private String title;

    /**
     * 封面图
     * 
     * column: cover_img
     */
    private String coverImg;

    /**
     * 描述
     * 
     * column: description
     */
    private String description;

    /**
     * 创建人ID
     * 
     * column: create_user_id
     */
    private Integer createUserId;

    /**
     * 创建时间
     * 
     * column: create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 
     * column: update_time
     */
    private Date updateTime;

    /**
     * 是否删除
     * 
     * column: is_delete
     */
    private Byte isDelete;

    /**
     * 内容正文
     * 
     * column: txt
     */
    private String txt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    /**
     * 
     *
     * @return java.lang.String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channelId=").append(channelId);
        sb.append(", title=").append(title);
        sb.append(", coverImg=").append(coverImg);
        sb.append(", description=").append(description);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", txt=").append(txt);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 
     *
     * @param that
     * @return boolean
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Content other = (Content) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCoverImg() == null ? other.getCoverImg() == null : this.getCoverImg().equals(other.getCoverImg()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getTxt() == null ? other.getTxt() == null : this.getTxt().equals(other.getTxt()));
    }

    /**
     * 
     *
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCoverImg() == null) ? 0 : getCoverImg().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getTxt() == null) ? 0 : getTxt().hashCode());
        return result;
    }
}