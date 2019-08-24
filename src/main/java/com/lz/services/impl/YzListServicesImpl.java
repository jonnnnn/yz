package com.lz.services.impl;

import com.lz.dao.YzListMapper;
import com.lz.entity.Yz;
import com.lz.services.YzListServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by z on 2018/8/14.
 */
@Service("YzListServicesImpl")
public class YzListServicesImpl implements YzListServices {
    @Resource
    private YzListMapper yzListMapper;
    @Override
    public List<Yz> getByOpid(String opid) {
        return yzListMapper.getByOpid(opid);
    }

    @Override
    public Yz getByPk(Long pk) {
        return yzListMapper.getByPk(pk);
    }

    @Override
    public void detYz(Long pk) {
        yzListMapper.detYz(pk);
    }
}
