package com.wxplatform.pojo;

public class TissusInfo {
    private Integer tissusid;

    private String tissusname;

    public Integer getTissusid() {
        return tissusid;
    }

    public void setTissusid(Integer tissusid) {
        this.tissusid = tissusid;
    }

    public String getTissusname() {
        return tissusname;
    }

    public void setTissusname(String tissusname) {
        this.tissusname = tissusname == null ? null : tissusname.trim();
    }
}