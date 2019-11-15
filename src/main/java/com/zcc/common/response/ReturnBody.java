package com.zcc.common.response;

import com.zcc.common.SysCode;

public class ReturnBody {
    private String code;
    private String message;
    private Object result;

    public ReturnBody(){}
    public ReturnBody(SysCode sysCode, Object result){
        this.code=sysCode.getCode();
        this.message=sysCode.getMessage();
        this.result=result;
    }
    public ReturnBody(String code,String message, Object result){
        this.code=code;
        this.message=message;
        this.result=result;
    }
    public static ReturnBody Sucess(SysCode sysCode,Object result){
        return new ReturnBody(sysCode.getCode(),sysCode.getMessage(),result);
    }





    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
