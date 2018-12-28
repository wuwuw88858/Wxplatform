package com.wxplatform.pojo;

public class PoliticalStatusInfo {
    private Integer politicalstatusid;

    private String politicalstatusname;

    public Integer getPoliticalstatusid() {
        return politicalstatusid;
    }

    public void setPoliticalstatusid(Integer politicalstatusid) {
        this.politicalstatusid = politicalstatusid;
    }

    public String getPoliticalstatusname() {
        return politicalstatusname;
    }

    public void setPoliticalstatusname(String politicalstatusname) {
        this.politicalstatusname = politicalstatusname == null ? null : politicalstatusname.trim();
    }
}