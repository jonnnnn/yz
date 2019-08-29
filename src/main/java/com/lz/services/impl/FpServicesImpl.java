package com.lz.services.impl;

import com.lz.dao.FpMapper;
import com.lz.dao.LoginMapper;
import com.lz.entity.Fp;
import com.lz.entity.User;
import com.lz.services.FpServices;
import com.lz.services.LoginServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by z on 2018/8/13.
 */
@Service("FpServicesImpl")
public class FpServicesImpl implements FpServices {
    @Resource
    private FpMapper fpMapper;

    @Override
    public List<Fp> getFp(Fp fp) {
        return fpMapper.getFp(fp);
    }

    @Override
    public void delFp(Map map) {
        fpMapper.delFp(map);
    }


}
