package com.lz.action;

import com.lz.entity.Fp;
import com.lz.entity.Op;
import com.lz.services.FpServices;
import com.lz.services.OpServices;
import com.lz.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
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
    public R getOp(Op op, HttpServletResponse response) {
        op.setOpid("ZIY00094298");
        List<Op> opList = opServices.getOp(op);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return R.data("", opList);
    }
}
