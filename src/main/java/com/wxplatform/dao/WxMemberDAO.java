package com.wxplatform.dao;

import com.github.pagehelper.Page;
import com.wxplatform.pojo.GroupMember;
import com.wxplatform.pojo.GroupMemberExample;

import java.util.List;

/*
* 用户登录信息设置接口
*
* */
public interface WxMemberDAO {
    int getMemberCount(String openid);
    GroupMember wxGetMember(String openid);
    List<GroupMember> selectAllMember(GroupMemberExample example);
    List<GroupMember> selectMemberListWithPage();   //获取分页
    List<GroupMember>selectMemberByDepartment(Integer department);    //部长查看自驾小干的信息
    long wxMemberInsert(GroupMember groupMember);
    int updateMemberStatus(GroupMember groupMember, String openid);
    int deleteMemberInfo(String openid);
}
