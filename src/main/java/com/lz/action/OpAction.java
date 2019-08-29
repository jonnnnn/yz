package com.lz.action;

import com.lz.entity.Fp;
import com.lz.entity.Op;
import com.lz.entity.User;
import com.lz.services.FpServices;
import com.lz.services.OpServices;
import com.lz.tool.R;
import org.springframework.stereotype.Controller;
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
import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
@Controller("OpAction")
public class OpAction {
    @Resource
    private OpServices opServices;

    @RequestMapping("getOp")
    @ResponseBody
    public R getOp(Op op, HttpServletResponse response, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        //user.setStaffid("ZIY00026164");
        op.setOpid(user.getStaffid());
        List<Op> opList = opServices.getOp(op);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return R.data("", opList);
    }

    @RequestMapping("delOp")
    @ResponseBody
    public R delOp(@RequestBody Op op, HttpServletResponse response) {
        opServices.delOp(op);
        try {
            File f = new File("C:/tomcate/Oplog.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
            output.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " --- " + op.getBillid());
            output.write("\r\n");
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        response.setHeader("Access-Control-Allow-Origin", "*");
        return R.data("删除成功!");
    }
}
