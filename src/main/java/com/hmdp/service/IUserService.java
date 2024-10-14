package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.dto.LoginFormDTO;
import com.hmdp.dto.Result;
import com.hmdp.entity.User;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XU
 * @since 2023-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session) throws MessagingException;

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();
}
