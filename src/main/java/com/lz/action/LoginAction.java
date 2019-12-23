package com.lz.action;

import com.lz.entity.User;
import com.lz.services.LoginServices;
import com.lz.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
@Controller("LoginAction")
public class LoginAction {
@Resource
private LoginServices loginServices;

    @RequestMapping("login")
    @ResponseBody
    public R login(User user, HttpServletRequest request) {
        List<User> list = loginServices.getUser(user);
        if (list.size() > 0) {
            request.getSession().setAttribute("user", list.get(0));
            return R.data("success");
        }
        return R.data("error");
    }

    @RequestMapping("signup")
    @ResponseBody
    public R signup(User user, HttpServletRequest request) {
        List<User> list = loginServices.getStaffid(user);
        List<User> checkUser = loginServices.checkUser(user);
        if (list.size() < 1) {
            return R.data("注册失败!未找到ERP账号！");
        }
        if (checkUser.size() > 0) {
            return R.data("用户已注册！");
        }
        user.setStaffid(list.get(0).getStaffid());
        loginServices.insUser(user);
        request.getSession().setAttribute("user", list.get(0));
        return R.data("success");
    }

    @RequestMapping("updUser")
    @ResponseBody
    public R updUser(@RequestBody User user, HttpServletRequest request) {
        User user1 = (User) request.getSession().getAttribute("user");
        //user.setStaffid(user1.getStaffid());
        user.setStaffid("ZIY00006347");
        loginServices.updUser(user);
        return R.data("success");
    }

    @RequestMapping("getUserByPass")
    @ResponseBody
    public R getUserByPass(User user, HttpServletRequest request) {
        User user1 = (User) request.getSession().getAttribute("user");
        /*user.setUserid(user1.getUserid());*/
        user.setUserid("SXADMIN");
        User user2 = loginServices.getUserByPass(user);
        if (user2 != null) {
            return R.data("success");
        }
        return R.data("error");
    }

    @RequestMapping("loginOut")
    @ResponseBody
    public R loginOut(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return R.data("success");
    }
}
