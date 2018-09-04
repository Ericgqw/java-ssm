package com.kms.model;

public class Staff {
    private String workid;

    private String name;

    private String department;

    private String groups;

    private String position;

    private String authority;

    private String entryriq;

    private String departuredate;

    private String state;

    private String ipaddr;

    private String islogin;

    private String port;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups == null ? null : groups.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getEntryriq() {
        return entryriq;
    }

    public void setEntryriq(String entryriq) {
        this.entryriq = entryriq == null ? null : entryriq.trim();
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate == null ? null : departuredate.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }
}