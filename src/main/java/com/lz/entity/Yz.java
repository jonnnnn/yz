package com.lz.entity;

import java.sql.Timestamp;

/**
 * Created by z on 2018/8/13.
 */
public class Yz {
    private Long pk;
    private String branchid;
    private String note;
    private String prodno;
    private String prodname;
    private String lotno;
    private String quantity;
    private String billid;
    private String storname;
    private String staffname;
    private String opid;
    private Timestamp createtime;
    private Timestamp lastmodifytime;

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Timestamp lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public String getStorname() {
        return storname;
    }

    public void setStorname(String storname) {
        this.storname = storname;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProdno() {
        return prodno;
    }

    public void setProdno(String prodno) {
        this.prodno = prodno;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }


    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getOpid() {
        return opid;
    }

    public void setOpid(String opid) {
        this.opid = opid;
    }
}
