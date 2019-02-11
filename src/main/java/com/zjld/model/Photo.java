package com.zjld.model;

import java.io.Serializable;
import java.util.Date;

public class Photo implements Serializable {
    private Integer id;

    private String photoName;

    private String photoRealName;

    private String photoUrl;

    private Long photoMemory;

    private Integer photoHeight;

    private Integer photoWidth;

    private String photoType;

    private String photoDescription;

    private Date createTime;

    private String creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
    }

    public String getPhotoRealName() {
        return photoRealName;
    }

    public void setPhotoRealName(String photoRealName) {
        this.photoRealName = photoRealName == null ? null : photoRealName.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Long getPhotoMemory() {
        return photoMemory;
    }

    public void setPhotoMemory(Long photoMemory) {
        this.photoMemory = photoMemory;
    }

    public Integer getPhotoHeight() {
        return photoHeight;
    }

    public void setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
    }

    public Integer getPhotoWidth() {
        return photoWidth;
    }

    public void setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
    }

    public String getPhotoType() {
        return photoType;
    }

    public void setPhotoType(String photoType) {
        this.photoType = photoType == null ? null : photoType.trim();
    }

    public String getPhotoDescription() {
        return photoDescription;
    }

    public void setPhotoDescription(String photoDescription) {
        this.photoDescription = photoDescription == null ? null : photoDescription.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}