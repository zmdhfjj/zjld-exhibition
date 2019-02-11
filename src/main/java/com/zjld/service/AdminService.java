package com.zjld.service;

import com.zjld.model.Authority;
import com.zjld.utils.ApiResult;

public interface AdminService {

    ApiResult getAdminForAllInfoByName(String adminName);

    ApiResult getAuthorityForAll();

    ApiResult addAuthority(Authority authority);

    ApiResult deleteAuthorityByUuid(String Uuid);

}
