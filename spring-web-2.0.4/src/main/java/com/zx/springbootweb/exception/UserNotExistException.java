package com.zx.springbootweb.exception;

/**
 * @创建人 张绚
 * @创建时间 2019/11/4 0004
 * @描述
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
