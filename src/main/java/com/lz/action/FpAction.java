package com.lz.action;

import com.lz.entity.Fp;
import com.lz.entity.User;
import com.lz.services.FpServices;
import com.lz.services.LoginServices;
import com.lz.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
@Controller("FpAction")
public class FpAction {
    @Resource
    private FpServices fpServices;

    @RequestMapping("getFp")
    @ResponseBody
    public R getFp(Fp fp, HttpServletResponse response) {
        fp.setOpid("ZIY00079651");
        List<Fp> fpList = fpServices.getFp(fp);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return R.data("", fpList);
    }

}
