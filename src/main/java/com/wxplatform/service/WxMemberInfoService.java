package com.wxplatform.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxplatform.dao.WxMemberDAO;
import com.wxplatform.pojo.GroupMember;
import common.exceptions.NullException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.*;

import java.util.concurrent.ConcurrentSkipListMap;

import static common.utils.FailCheckUtils.*;
import static common.utils.NotNullCheckUtils.*;


@Component
@Service

public class WxMemberInfoService {

    private final WxMemberDAO wxMemberDAO;
    private static final Logger logger =
            LoggerFactory.getLogger(WxMemberInfoService.class);

    ConcurrentSkipListMap<String, Object> concurrentSkipListMap =
            new ConcurrentSkipListMap<String, Object>();

    public WxMemberInfoService(WxMemberDAO wxMemberDAO) {
        this.wxMemberDAO = wxMemberDAO;
    }


    /*
    * 分页浏览所有人信息
    * @praram currentPage
    * @return
    * */
        public PageInfo<GroupMember> selectAllMember(Integer currentPage) {
            PageHelper.startPage(currentPage, 10);
            List<GroupMember> memberinfo = wxMemberDAO.selectMemberListWithPage();
            ListNotExist(memberinfo,"memberlist.is.null");
            PageInfo<GroupMember> groupMemberPageInfo = new PageInfo<GroupMember>(memberinfo);
            return groupMemberPageInfo;
}

              /*
              * @Description: 部长只能查看自己部门的小干的信息
              * @Param: [department]
              * @return: java.util.concurrent.ConcurrentSkipListMap
              * @Author:  zhijie
              * @Date: 2018/12/6
              */
    public ConcurrentSkipListMap selectMemberInfoByDepartment(Integer department) {
            List<GroupMember> memberInfoList = wxMemberDAO.selectMemberByDepartment(department);
            List<Map> memberMapList= new ArrayList<Map>();
            for(GroupMember memberInfo : memberInfoList) {
                Map memberMap = new HashMap();
                memberMap.put("memberid", memberInfo.getMemberid());
                memberMap.put("membername", memberInfo.getMembername());
                memberMap.put("politicalstatusname", memberInfo.getPoliticalstatusname());
                memberMap.put("tissusname", memberInfo.getTissusname());
                memberMap.put(" departmentname", memberInfo.getDepartmentname());
                memberMap.put("membername", memberInfo.getMembername());
                memberMap.put("telnumber", memberInfo.getTelnumber());
                memberMapList.add(memberMap);
            }
            concurrentSkipListMap.put("Result", memberMapList);
            return concurrentSkipListMap;
        }
    /*添加
    * @param:groupMember
    * @return:addMemberInfo
    * */
    public long addMemberInfo(GroupMember groupMember) {
        //检查
        NotNull(groupMember.getOpenid(), "openId.is.null");
        NotNull(groupMember.getMemberid(), "memberId.is.null");
        NotNull(groupMember.getMembername(), "memberName.is.null");
        NotNullInt(groupMember.getPoliticalstatus(), "politicalStatus.is.null");
        NotNullInt(groupMember.getTissus(), "tissus.is.null");
        NotNullInt(groupMember.getDepartment(), "department.is.null");
        NotNull(groupMember.getTelnumber(), "telnumber.is.null");
        NotNullInt(groupMember.getDepartmentposition(), "position.is.notexist");
        memberIdIsTrue(groupMember.getMemberid(), "memberId.is.unstandardize");
        memberNameIsTrue(groupMember.getMembername(), "memberName.is.unstandarize");
        telNumberIsTrue(groupMember.getTelnumber(), "telnumber.is.unstandarize");
        politicalstatusNotExist(groupMember.getPoliticalstatus(), "political.is.null");
//        tissusNotExist(groupMember.getTissus(), "tissus.is.notexist");
//        departmentNotExist(groupMember.getDepartment(), "department.is.null");
//        departmentPositionNotExist(groupMember.getDepartmentposition(), "position.is.notexist");
        logger.info("add memberInfo:" + groupMember.getDepartment());
        long addMemberInfo = wxMemberDAO.wxMemberInsert(groupMember);
        return addMemberInfo;

    }

    /*
        * @Description:  显示用户的个人信息
        * 2种状态
          * 1、未审核状态。（memberstatus = 0）
          * 2、已审核状态。（memberstatus = 1）
        * @Param: [openid]
        * @return: java.util.concurrent.ConcurrentSkipListMap
        * @Author:  zhijie
        * @Date: 2018/12/18
        */
    public ConcurrentSkipListMap selectMemberInfo(String openid) {
        isExist(openid);
        GroupMember memberInfo = wxMemberDAO.wxGetMember(openid);
        Map dataMap = new HashMap();
        isAccess(memberInfo.getMemberstatus(), "status.is.0");
        dataMap.put("openid", memberInfo.getOpenid());
        dataMap.put("membername", memberInfo.getMembername());
        dataMap.put("telnumber", memberInfo.getTelnumber());
        dataMap.put("department", memberInfo.getDepartmentname());
        dataMap.put("tissus", memberInfo.getTissusname());
        dataMap.put("politicalstatus", memberInfo.getPoliticalstatusname());
        dataMap.put("memberid", memberInfo.getMemberid());
        dataMap.put("memberstatus", memberInfo.getMemberstatus());
        concurrentSkipListMap.put("Result", dataMap);
        return concurrentSkipListMap;
    }

    /*更新信息
    * @param:groupMember,openid
    * @Return memberstatus
    * */
    public int updataMemberInfoByPrimaryKey(GroupMember groupMember,  String openid) {
        int updateAfterMemberInfo = wxMemberDAO.updateMemberStatus(groupMember, openid);
        return updateAfterMemberInfo;
    }

    /*
    * 删除个人
    * */
    public int intdeleteMemberInfoByPrimaryKey(String openid) {
        int deleteMemberInfo = wxMemberDAO.deleteMemberInfo(openid);
        return deleteMemberInfo;
    }

    //查询数据是否存在
    public boolean isExist(String openid) {
        int memberList = wxMemberDAO.getMemberCount(openid);
        if (memberList == 0) {
            throw new NullException("11000");
        } else {
            return true;
        }
    }

}