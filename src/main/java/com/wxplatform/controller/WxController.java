package com.wxplatform.controller;
import com.wxplatform.pojo.GroupMember;
import com.wxplatform.service.WxGetOpenIdService;
import com.wxplatform.service.WxMemberInfoService;
import common.beans.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/wxplatform")
public class WxController {

    @Autowired
    WxGetOpenIdService wxGetOpenIdService;
    @Autowired
    WxMemberInfoService wxMemberInfoService;

    /**
     * @ClassName:getOpenId
     * @Description: 获取用户的code
     * @Author: zhijie
     * @CreateDate: 2018/11/24 14:59
     * @RequestMethod:post
     * @Param [code]
     * @Return [code, openid]
     * @Exception [code :9000]
     */
    @ResponseBody
    @RequestMapping(value = "/wxgetopenid", method= RequestMethod.POST)
   public ResultBean<Map> getOpenId(@RequestParam("code") String code) {
        return new ResultBean<Map>(wxGetOpenIdService.getOpenId(code));
    }
    /**
     * @ClassName:addMember
     * @Description: 添加用户信息
     * @Author: zhijie
     * @CreateDate: 2018/11/24 15：01
     * @RequestMethod:post
     * @Param [openid,memberid,membername,politicalstatus,tissus,department,telnumber,departmentposition]
     * @Return [groupMember]
     * @Exception [code :9000]
     */
    @ResponseBody
        @RequestMapping(value = "addmemberinfo", method = RequestMethod.POST)
    public ResultBean<Long> addMember(GroupMember groupMember) {
        return new ResultBean<Long>(wxMemberInfoService.addMemberInfo(groupMember));
    }
    /**
     *
     * @Description: 显示用户个人信息
     * @Author: zhijie
     * @CreateDate: 2018/11/24 15:10
     * @RequestMethod:POST
     * @Param [openid]
     * @Return [groupMember]
     * @Exception [code :11000]
     */
    @RequestMapping(value = "selectmemberinfo", method = RequestMethod.POST)
    public ResultBean<Map> selectMember(@RequestParam("openid")String openid) {
        return new ResultBean<Map>(wxMemberInfoService.selectMemberInfo(openid));
    }
}
