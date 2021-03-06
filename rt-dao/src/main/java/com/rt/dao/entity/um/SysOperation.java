package com.rt.dao.entity.um;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author code generate
 * @since 2018-05-07
 */
public class SysOperation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String url;
    private String parentId;
    private Integer sequence;
    /**
     * 1-菜单
     2-操作
     */
    private Integer type;
    /**
     * 0-否1-是
     */
    private Integer enabled;
    private Integer level;
    private String code;
    private String icon;
    private String remark;
    private Integer isDelete;
    private String createUserId;
    private String createUserName;
    private Date createTime;
    private String lastUpdateUserId;
    private String lastUpdateUserName;
    private Date lastUpdateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public String getLastUpdateUserName() {
        return lastUpdateUserName;
    }

    public void setLastUpdateUserName(String lastUpdateUserName) {
        this.lastUpdateUserName = lastUpdateUserName;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "SysOperation{" +
                ", id=" + id +
                ", name=" + name +
                ", url=" + url +
                ", parentId=" + parentId +
                ", sequence=" + sequence +
                ", type=" + type +
                ", enabled=" + enabled +
                ", level=" + level +
                ", code=" + code +
                ", icon=" + icon +
                ", remark=" + remark +
                ", isDelete=" + isDelete +
                ", createUserId=" + createUserId +
                ", createUserName=" + createUserName +
                ", createTime=" + createTime +
                ", lastUpdateUserId=" + lastUpdateUserId +
                ", lastUpdateUserName=" + lastUpdateUserName +
                ", lastUpdateTime=" + lastUpdateTime +
                "}";
    }
}
