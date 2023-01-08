package com.itheima._09自定义异常;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/7
 * Time: 16:44
 * Description:
 *
 * @author 寒毅
 */
public class RunException extends RuntimeException {

    public RunException() {
    }

    public RunException(String message) {
        super(message);
    }

    public RunException(String message, Throwable cause) {
        super(message, cause);
    }

    public RunException(Throwable cause) {
        super(cause);
    }

    public RunException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
