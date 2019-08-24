package com.lz.action;

import com.lz.entity.User;
import com.lz.entity.Yz;
import com.lz.services.YzListServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public String goYzList(ModelMap map, HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user1");
        List<Yz> yz = yzListServices.getByOpid(user.getStaffid());
        if(yz != null){
            map.put("yz",yz);
            return "yz";
        }
        return "null";
    }

    @RequestMapping("detYz")
    public String detYz(ModelMap map,Yz yz){
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
        return "forward:/goYzList";
    }

}
