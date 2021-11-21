package com.company.controller;

import com.company.exception.AgeException;
import com.company.exception.MyUserException;
import com.company.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName UserController
 * @company 公司
 * @Description
 *    @RequestMapping:
 *       value ： 所有请求地址的公共部分，叫做模块名称
 *       位置： 放在类的上面
 * @createTime 2021年11月20日 17:48:48
 */


@Controller
public class UserController {


    @RequestMapping(value = "/user.do")
    public ModelAndView doSome(String name, Integer age) throws MyUserException {
        //处理some.do请求了。 相当于service调用处理完成了。
        ModelAndView mv  = new ModelAndView();

        //try {
        //根据请求参数抛出异常
        if (!"zs".equals(name)) {
            throw new NameException("姓名不正确！！！");
        }

        if (age == null || age > 80) {
            throw new AgeException("年龄比较大！！！");
        }

        //}catch(Exception e){
        //   e.printStackTrace();
        //}

        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }


}