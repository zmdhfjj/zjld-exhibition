package com.zjld.service;

import com.zjld.model.Photo;
import com.zjld.utils.ApiResult;

public interface PhotoService {

    ApiResult savePhotoToLocal(Photo photo);

    ApiResult getPhotoList();
}
