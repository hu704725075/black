package com.hyp.black.exception;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 13:51 2018/11/17
 */
public class BusiException extends RuntimeException{

    private String msg = "操作失败";
    private Integer code = 9999;

    public BusiException(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public BusiException(String message, String msg, Integer code) {
        super(message);
        this.msg = msg;
        this.code = code;
    }

    public BusiException(String message, Throwable cause, String msg, Integer code) {
        super(message, cause);
        this.msg = msg;
        this.code = code;
    }

    public BusiException(Throwable cause, String msg, Integer code) {
        super(cause);
        this.msg = msg;
        this.code = code;
    }

    public BusiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String msg, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}