package com.lz.dao;

import com.lz.entity.Fp;

import java.util.List;
import java.util.Map;

/**
 * Created by z on 2018/8/13.
 */
public interface FpMapper {
    public List<Fp> getFp(Fp fp);

    public void delFp(Map map);
}
