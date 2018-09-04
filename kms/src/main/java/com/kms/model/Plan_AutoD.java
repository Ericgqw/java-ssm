package com.kms.model;

public class Plan_AutoD {
    private String mach;

    private String planqty;

    private String targetqty;

    private String machqty;

    private String doneqty;

    private String ngqty;

    private String remainqty;

    private String donerate;

    private String remainrate;

    public String getMach() {
        return mach;
    }

    public void setMach(String mach) {
        this.mach = mach == null ? null : mach.trim();
    }

    public String getPlanqty() {
        return planqty;
    }

    public void setPlanqty(String planqty) {
        this.planqty = planqty == null ? null : planqty.trim();
    }

    public String getTargetqty() {
        return targetqty;
    }

    public void setTargetqty(String targetqty) {
        this.targetqty = targetqty == null ? null : targetqty.trim();
    }

    public String getMachqty() {
        return machqty;
    }

    public void setMachqty(String machqty) {
        this.machqty = machqty == null ? null : machqty.trim();
    }

    public String getDoneqty() {
        return doneqty;
    }

    public void setDoneqty(String doneqty) {
        this.doneqty = doneqty == null ? null : doneqty.trim();
    }

    public String getNgqty() {
        return ngqty;
    }

    public void setNgqty(String ngqty) {
        this.ngqty = ngqty == null ? null : ngqty.trim();
    }

    public String getRemainqty() {
        return remainqty;
    }

    public void setRemainqty(String remainqty) {
        this.remainqty = remainqty == null ? null : remainqty.trim();
    }

    public String getDonerate() {
        return donerate;
    }

    public void setDonerate(String donerate) {
        this.donerate = donerate == null ? null : donerate.trim();
    }

    public String getRemainrate() {
        return remainrate;
    }

    public void setRemainrate(String remainrate) {
        this.remainrate = remainrate == null ? null : remainrate.trim();
    }
}