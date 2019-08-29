package com.lz.action;

import com.lz.entity.User;
import com.lz.entity.Yz;
import com.lz.services.YzListServices;
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
import java.util.List;

/**
 * Created by z on 2018/8/14.
 */
@Controller("YzListAction")
public class YzListAction {
    @Resource
    private YzListServices yzListServices;

    @RequestMapping("goYzList")
    @ResponseBody
    public R goYzList(HttpServletRequest request, HttpServletResponse response) {
        User user = (User) request.getSession().getAttribute("user");
        //user.setStaffid("ZIY00079651");
        List<Yz> yz = yzListServices.getByOpid(user.getStaffid());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return R.data("", yz);
    }

    @RequestMapping("detYz")
    @ResponseBody
    public R detYz(@RequestBody Yz yz) {
        Yz yz1 = yzListServices.getByPk(yz.getPk());
        try {
            File f = new File("C:/tomcate");
            if(!f.exists()){f.mkdirs();}
            File file = new File(f,"yzlog.txt");
            if(!file.exists()){file.createNewFile();}
            BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
            output.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) +" --- " + yz1.getBranchid()  +" --- " + yz1.getStaffname() +" --- 数量:" + yz1.getQuantity()+" --- " + yz1.getProdno()+" --- " + yz1.getProdname()  );
            output.write("\r\n");
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        yzListServices.detYz(yz.getPk());
        return R.data("删除成功!");
    }

}
