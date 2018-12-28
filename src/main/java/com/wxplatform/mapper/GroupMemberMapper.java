package com.wxplatform.mapper;

import com.github.pagehelper.Page;
import com.wxplatform.pojo.GroupMember;
import com.wxplatform.pojo.GroupMemberExample;
import java.util.List;

public interface GroupMemberMapper {
    int deleteByPrimaryKey(String openid);
    int insert(GroupMember record);
    int insertSelective(GroupMember record);
    List<GroupMember> selectByExample(GroupMemberExample example);
    GroupMember selectByPrimaryKey(String openid);
    GroupMember selectmemberinfoWithOtherByPrimaryKey(String openid);
    int seletCount(String openid);  //查看数据是否存在
    List<GroupMember> selectMemberListWithPage();   //获取分页
    List<GroupMember> selectMemberByDepartment(Integer department); //部长查看自家小干的信息
    int updateByPrimaryKeySelective(GroupMember record);

    int updateByPrimaryKey(GroupMember record);
}