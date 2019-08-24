package com.lz.services;

import com.lz.entity.Yz;

import java.util.List;

/**
 * Created by z on 2018/8/14.
 */
public interface YzListServices {
    public List<Yz> getByOpid(String opid);

    public Yz getByPk(Long pk);

    public void detYz(Long pk);
}
