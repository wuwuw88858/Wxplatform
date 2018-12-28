package com.wxplatform.dao.impl;

import com.github.pagehelper.Page;
import com.wxplatform.dao.WxMemberDAO;
import com.wxplatform.pojo.GroupMemberExample;
import com.wxplatform.mapper.GroupMemberMapper;
import com.wxplatform.pojo.GroupMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Repository
public class WxMemberDAOImpl implements WxMemberDAO {

    @Autowired
    GroupMemberMapper groupMemberMapper;
    @PostConstruct
    public void init(){}


    public int getMemberCount(String openid) {

        return groupMemberMapper.seletCount(openid);
    }


    public List<GroupMember> selectAllMember(GroupMemberExample example) {
            GroupMemberExample groupMemberExample = new GroupMemberExample();
        return groupMemberMapper.selectByExample(groupMemberExample);
    }
    /*分页获取所有用户信息*/
    @Override
    public List<GroupMember> selectMemberListWithPage() {
        return groupMemberMapper.selectMemberListWithPage();
    }


    /*
    * @Description:部长获取自己小干的个人信息
    * @Param: [department]
    * @return: java.util.List<com.wxplatform.pojo.GroupMember>
    * @Author:  zhijie
    * @Date: 2018/12/6
    */
    @Override
    public List<GroupMember> selectMemberByDepartment(Integer department) {
        return  groupMemberMapper.selectMemberByDepartment(department);
    }


    /*
    * @Description:  获取自己的个人信息
    * @Param: [openid]
    * @return: com.wxplatform.pojo.GroupMember
    * @Author:  zhijie
    * @Date: 2018/12/6
    */
    @Override
    public GroupMember wxGetMember(String openid) {
        return groupMemberMapper.selectmemberinfoWithOtherByPrimaryKey(openid);
    }
    /*添加个人信息*/
    public long wxMemberInsert(GroupMember groupMember) {
        groupMember.setMemberstatus("0");
        groupMember.setmemberpassword("1000");
        return groupMemberMapper.insert(groupMember);
    }

    /*后台更新个人信息的审核状态鸭
    * 默认为0，审核完毕为1
    * */
    public int updateMemberStatus(GroupMember groupMember, String openid) {
        groupMember.setOpenid(openid);
        groupMember.setMemberstatus("1");
        return groupMemberMapper.updateByPrimaryKeySelective(groupMember);
    }
    /*
    * 删除个人信息
    * */
    public int deleteMemberInfo(String openid) {
        return groupMemberMapper.deleteByPrimaryKey(openid);
    }


}
