package com.liwy.oscafe.upms.entity;

/**
 * 角色实体类
 * Created by liwy on 2018/2/25.
 */
public class UpmsRole {
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 角色名
     */
    private String name;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Long ctime;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

        UpmsRole upmsRole = (UpmsRole) o;

        if (roleId != null ? !roleId.equals(upmsRole.roleId) : upmsRole.roleId != null) return false;
        if (name != null ? !name.equals(upmsRole.name) : upmsRole.name != null) return false;
        if (description != null ? !description.equals(upmsRole.description) : upmsRole.description != null)
            return false;
        return ctime != null ? ctime.equals(upmsRole.ctime) : upmsRole.ctime == null;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UpmsRole{" +
                "roleId=" + roleId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}
