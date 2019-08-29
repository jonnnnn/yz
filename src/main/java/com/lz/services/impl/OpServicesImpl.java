package com.lz.services.impl;

import com.lz.dao.FpMapper;
import com.lz.dao.OpMapper;
import com.lz.entity.Fp;
import com.lz.entity.Op;
import com.lz.services.FpServices;
import com.lz.services.OpServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
@Service("OpServicesImpl")
public class OpServicesImpl implements OpServices {
    @Resource
    private OpMapper opMapper;

    @Override
    public List<Op> getOp(Op op) {
        return opMapper.getOp(op);
    }

    @Override
    public void delOp(Op op) {
        opMapper.delOp(op);
    }
}
