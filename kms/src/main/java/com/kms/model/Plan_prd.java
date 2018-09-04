package com.kms.model;

public class Plan_prd {
    private String mach;

    private String itemno;

    private String planqty;

    private String qtyok;

    private String remainqty;

    public String getMach() {
        return mach;
    }

    public void setMach(String mach) {
        this.mach = mach == null ? null : mach.trim();
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    public String getPlanqty() {
        return planqty;
    }

    public void setPlanqty(String planqty) {
        this.planqty = planqty == null ? null : planqty.trim();
    }

    public String getQtyok() {
        return qtyok;
    }

    public void setQtyok(String qtyok) {
        this.qtyok = qtyok == null ? null : qtyok.trim();
    }

    public String getRemainqty() {
        return remainqty;
    }

    public void setRemainqty(String remainqty) {
        this.remainqty = remainqty == null ? null : remainqty.trim();
    }
}