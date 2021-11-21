package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName AgeException
 * @company 公司
 * @Description TODO
 * @createTime 2021年11月20日 17:49:49
 */
//当年龄有问题时，抛出的异常
public class AgeException extends MyUserException {
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
