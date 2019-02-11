package com.zjld.utils;

import com.alibaba.druid.util.StringUtils;

public class ResultUtil {

    public static ApiResult set(String code , String msg , Object data, boolean success){
        ApiResult apiResult = new ApiResult();
        apiResult.setMsg(msg);
        apiResult.setSuccess(success);
        if(StringUtils.isEmpty(code)){
            if(success){
                apiResult.setCode("0");
            }else{
                apiResult.setCode("1");
            }
        }else{
            apiResult.setCode(code);
        }
        if(data != null){
            apiResult.setData(data);
        }

        return apiResult;
    }

    public static ApiResult setError(String code , String msg , Object data){
        return set(code,msg,data,false);
    }

    public static ApiResult setError(String code, String msg){
        return setError(code,msg,null);
    }

    public static ApiResult setError(String msg){
        return setError(null,msg);
    }

    public static ApiResult setError(){
        return setError(null,null);
    }

    public static ApiResult setSuccess(String code , String msg , Object data){
        return set(code,msg,data,true);
    }

    public static ApiResult setSuccess(String msg, Object data){
        return setSuccess(null,msg,data);
    }

    public static ApiResult setSucess(Object data){
        return setSuccess(null,data);
    }

    public static ApiResult setSuccess(){
        return setSucess(null);
    }

}
