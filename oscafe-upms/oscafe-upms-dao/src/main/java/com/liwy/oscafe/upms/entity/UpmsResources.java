package com.liwy.oscafe.upms.entity;

/**
 * 资源实体表
 * Created by liwy on 2018/2/25.
 */
public class UpmsResources {
    /**
     * 资源编号
     */
    private Integer resId;
    /**
     * 父ID
     */
    private Integer pid;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源类型
     */
    private Integer type;
    /**
     * URI
     */
    private String uri;
    /**
     * 图标
     */
    private String icon;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Long ctime;
    /**
     * 排序
     */
    private Integer orders;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpmsResources that = (UpmsResources) o;

        if (resId != null ? !resId.equals(that.resId) : that.resId != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (uri != null ? !uri.equals(that.uri) : that.uri != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (ctime != null ? !ctime.equals(that.ctime) : that.ctime != null) return false;
        return orders != null ? orders.equals(that.orders) : that.orders == null;
    }

    @Override
    public int hashCode() {
        int result = resId != null ? resId.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UpmsResources{" +
                "resId=" + resId +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", uri='" + uri + '\'' +
                ", icon='" + icon + '\'' +
                ", status=" + status +
                ", ctime=" + ctime +
                ", orders=" + orders +
                '}';
    }
}
