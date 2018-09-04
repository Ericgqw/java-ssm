package com.kms.model;

public class user {
    private String userid;

    private String password;

    private String name;

    private String authority;

    private String ipaddr;

    private String islogin;

    private String eMail;

    private String sysskin;

    private String partment;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    public String getIslogin() {
        return islogin;
    }

    public void setIslogin(String islogin) {
        this.islogin = islogin == null ? null : islogin.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getSysskin() {
        return sysskin;
    }

    public void setSysskin(String sysskin) {
        this.sysskin = sysskin == null ? null : sysskin.trim();
    }

    public String getPartment() {
        return partment;
    }

    public void setPartment(String partment) {
        this.partment = partment == null ? null : partment.trim();
    }
}