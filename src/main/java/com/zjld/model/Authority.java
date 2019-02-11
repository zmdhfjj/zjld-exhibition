package com.zjld.model;

import java.io.Serializable;
import java.util.Date;

public class Authority implements Serializable {
    private Integer id;

    private String authorityName;

    private String authorityUuid;

    private String authorityUrl;

    private String authorityHtml;

    private Date creatorTime;

    private String authorityParent;

    private String creator;

    private String authorityType;

    private String authorityPermission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityUuid() {
        return authorityUuid;
    }

    public void setAuthorityUuid(String authorityUuid) {
        this.authorityUuid = authorityUuid == null ? null : authorityUuid.trim();
    }

    public String getAuthorityUrl() {
        return authorityUrl;
    }

    public void setAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl == null ? null : authorityUrl.trim();
    }

    public String getAuthorityHtml() {
        return authorityHtml;
    }

    public void setAuthorityHtml(String authorityHtml) {
        this.authorityHtml = authorityHtml == null ? null : authorityHtml.trim();
    }

    public Date getCreatorTime() {
        return creatorTime;
    }

    public void setCreatorTime(Date creatorTime) {
        this.creatorTime = creatorTime;
    }

    public String getAuthorityParent() {
        return authorityParent;
    }

    public void setAuthorityParent(String authorityParent) {
        this.authorityParent = authorityParent == null ? null : authorityParent.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType == null ? null : authorityType.trim();
    }

    public String getAuthorityPermission() {
        return authorityPermission;
    }

    public void setAuthorityPermission(String authorityPermission) {
        this.authorityPermission = authorityPermission == null ? null : authorityPermission.trim();
    }
}