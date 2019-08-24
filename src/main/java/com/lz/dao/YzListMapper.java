package com.lz.dao;

import com.lz.entity.Yz;

import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
public interface YzListMapper {
    public List<Yz> getByOpid(String opid);

    public Yz getByPk(Long pk);

    public void detYz(Long pk);


}
