package com.lz.action;

import com.lz.entity.User;
import com.lz.services.LoginServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by z on 2018/8/13.
 */
@Controller("LoginAction")
public class LoginAction {
@Resource
private LoginServices loginServices;

    @RequestMapping("login")
    public String login(ModelMap map, User user, HttpServletRequest request){
       User user1 = loginServices.getUser(user.getUserid().toUpperCase());
        if(user1 != null){
            if(user1.getUserid().equals(user.getUserid().trim().toUpperCase()) && user1.getPassword().equals(user.getPassword().trim())){
                request.getSession().setAttribute("user1",user1);
                return "forward:/goYzList";
            }
        }
        return "error";
    }

    @RequestMapping("loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute("user1");
        return "login";
    }
}
