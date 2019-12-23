package com.lz.action;

import com.lz.entity.Fp;
import com.lz.entity.User;
import com.lz.services.FpServices;
import com.lz.services.LoginServices;
import com.lz.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by z on 2018/8/13.
 */
@Controller("FpAction")
public class FpAction {
    @Resource
    private FpServices fpServices;

    @RequestMapping("getFp")
    @ResponseBody
    public R getFp(Fp fp, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        fp.setOpid(user.getStaffid());
        List<Fp> fpList = fpServices.getFp(fp);
        return R.data("", fpList);
    }

    @RequestMapping("delFp")
    @ResponseBody
    public R delFp(@RequestBody Fp fp, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        Map pram = new HashMap();
        pram.put("p_billid", fp.getBillid());
        fpServices.delFp(pram);
        try {
            File f = new File("C:/tomcate/Fplog.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
            output.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " ---  姓名：" + user.getUsername() + " --- " + fp.getBillid());
            output.write("\r\n");
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.data("删除成功!");
    }
}
