package com.lz.services;

import com.lz.entity.Fp;
import com.lz.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by z on 2018/8/13.
 */
public interface FpServices {
    public List<Fp> getFp(Fp fp);

    public void delFp(Map map);
}
