package com.hanyi._09自定义异常;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/7
 * Time: 16:23
 * Description:
 *
 * @author 寒毅
 */
public class HanyiException extends  Exception{

    public HanyiException() {
    }

    public HanyiException(String message) {
        super(message);
    }

    public HanyiException(String message, Throwable cause) {
        super(message, cause);
    }

    public HanyiException(Throwable cause) {
        super(cause);
    }

    public HanyiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
