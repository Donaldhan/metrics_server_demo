package org.home.util;

public enum HttpErrorCodeEnum {
    SUCCESS(200, "成功"),
    ERROR_CONNECTTIMEOUT(-1, "连接超时"),
    ERROR_SOCKETTIMEOUT(-2, "响应超时"),
    ERROR_OTHER(-3, "未知异常");

    private long code;
    private String desc;

    HttpErrorCodeEnum(long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}