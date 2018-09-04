package com.kms.model;

public class Plan_NG {
    private String hh;

    private String ngqty;

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh == null ? null : hh.trim();
    }

    public String getNgqty() {
        return ngqty;
    }

    public void setNgqty(String ngqty) {
        this.ngqty = ngqty == null ? null : ngqty.trim();
    }
}