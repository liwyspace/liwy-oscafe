/*
 * Copy Right LIWY
 * http://www.oscafe.net
 * 2019-06-29 23:42:05
 */
package com.liwy.oscafe.cms.dao.model;

import java.util.Date;

/**
 * 内容标签关系表实体类
 * 
 * @table cms_content_tag_rel
 * @author liwy
 * @date 2019-06-29 23:42:05
 */
public class ContentTagRel {
    /**
     * 主键
     * 
     * column: id
     */
    private Integer id;

    /**
     * 内容ID
     * 
     * column: content_id
     */
    private Integer contentId;

    /**
     * 标签ID
     * 
     * column: tag_id
     */
    private Integer tagId;

    /**
     * 排序
     * 
     * column: orders
     */
    private Integer orders;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
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
        sb.append(", contentId=").append(contentId);
        sb.append(", tagId=").append(tagId);
        sb.append(", orders=").append(orders);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
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
        ContentTagRel other = (ContentTagRel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContentId() == null ? other.getContentId() == null : this.getContentId().equals(other.getContentId()))
            && (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
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
        result = prime * result + ((getContentId() == null) ? 0 : getContentId().hashCode());
        result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}