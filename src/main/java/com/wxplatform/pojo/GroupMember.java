package com.wxplatform.pojo;

public class GroupMember {
    private String openid;

    private String memberid;

    private String membername;

    private Integer politicalstatus;

    private Integer tissus;

    private Integer department;

    private Integer departmentposition;

    private String telnumber;

    private String memberstatus;

  //  private String memberpassword;

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    private String departmentname;

    public String getPoliticalstatusname() {
        return politicalstatusname;
    }

    public void setPoliticalstatusname(String politicalstatusname) {
        this.politicalstatusname = politicalstatusname;
    }

    public String getTissusname() {
        return tissusname;
    }

    public void setTissusname(String tissusname) {
        this.tissusname = tissusname;
    }

    private String politicalstatusname;
    private String  tissusname;



    /*非数据库字段*/

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public Integer getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(Integer politicalstatus) {
        this.politicalstatus = politicalstatus;
    }

    public Integer getTissus() {
        return tissus;
    }

    public void setTissus(Integer tissus) {
        this.tissus = tissus;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDepartmentposition() {
        return departmentposition;
    }

    public void setDepartmentposition(Integer departmentposition) {
        this.departmentposition = departmentposition;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getMemberstatus() {
        return memberstatus;
    }

    public void setMemberstatus(String memberstatus) {
        this.memberstatus = memberstatus == null ? null : memberstatus.trim();
    }

    String memberpassword;
    public String getmemberpassword() {
        return memberpassword;
    }

    public void setmemberpassword(String memberpassword) {
        this.memberpassword = memberpassword == null ? null : memberpassword.trim();
    }
}