package com.liwy.oscafe.upms.entity;

/**
 * 组织实体类
 * Created by liwy on 2018/2/25.
 */
public class UpmsOrganization {
    private Integer orgId;
    private Integer pid;
    private String name;
    private String description;
    private Long ctime;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpmsOrganization that = (UpmsOrganization) o;

        if (!orgId.equals(that.orgId)) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (!name.equals(that.name)) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return ctime.equals(that.ctime);
    }

    @Override
    public int hashCode() {
        int result = orgId.hashCode();
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + ctime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UpmsOrganization{" +
                "orgId=" + orgId +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}
