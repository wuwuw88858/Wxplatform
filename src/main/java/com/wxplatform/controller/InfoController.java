package com.wxplatform.controller;

import com.wxplatform.pojo.GroupMember;
import com.wxplatform.service.WxMemberInfoService;
import common.beans.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/*后台控制器*/
@RestController
@RequestMapping("/wxbackstage")
public class InfoController {

    @Autowired
    WxMemberInfoService wxMemberInfoService;

    /**
     * @ClassName:selectMember
     * @Description: 遍历用户个人信息
     * @Author: zhijie
     * @CreateDate: 2018/11/24 15:11
     * @RequestMethod:get
     * @Param [currentPage]
     * @Return [groupMember]
     */
    @RequestMapping(value="selectmemberlist", method = RequestMethod.GET)
    public ResultBean selectMember(@RequestParam("currentPage") Integer currentPage) {
        return new ResultBean(wxMemberInfoService.selectAllMember(currentPage));
    }

    @RequestMapping(value="selectmemberlistbydepartment", method = RequestMethod.POST)
    public ResultBean selectMemberByDepartment(@RequestParam("department") Integer department) {
        return new ResultBean(wxMemberInfoService.selectMemberInfoByDepartment(department));
    }
    /**
     * @ClassName:updateMemberStatus
     * @Description: 若审核通过，则改变用户的状态
     * @Author: zhijie
     * @CreateDate: 2018/11/24 15:3
     * @RequestMethod:post
     * @Param [openid]
     * @Return [code]
     */
    @RequestMapping(value = "updatamemberstatus", method = RequestMethod.POST)
    public ResultBean<Integer> updateMemberStatus(GroupMember groupMember, @RequestParam("openid") String openid) {
        return new ResultBean<Integer>(wxMemberInfoService.updataMemberInfoByPrimaryKey(groupMember, openid));
    }
    /**
     * @ClassName:deleteMemberInfo
     * @Description: 删除用户个人信息
     * @Author: zhijie
     * @CreateDate: 2018/11/24 15:15
     * @RequestMethod:post
     * @Param [openid]
     * @Return [code]
     */
    @RequestMapping(value = "deletemembermnfo", method = RequestMethod.POST)
    public ResultBean<Integer> deleteMemberInfo(@RequestParam("openid") String openid) {
        return new ResultBean<Integer>(wxMemberInfoService.intdeleteMemberInfoByPrimaryKey(openid));
    }
}
