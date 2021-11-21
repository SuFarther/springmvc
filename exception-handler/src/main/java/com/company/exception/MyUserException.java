package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MyUserException
 * @company 公司
 * @Description TODO
 * @createTime 2021年11月20日 17:49:49
 */
public class MyUserException extends Exception {
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}

