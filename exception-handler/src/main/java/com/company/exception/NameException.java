package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName NameException
 * @company 公司
 * @Description TODO
 * @createTime 2021年11月20日 17:50:50
 */
//表示当用户的姓名有异常，抛出NameException
public class NameException extends MyUserException {
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
