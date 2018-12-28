package com.wxplatform.controller;

import com.github.pagehelper.PageInfo;
import com.wxplatform.dao.WxDateTrip;
import com.wxplatform.pojo.DateTrip;
import com.wxplatform.service.WxDateTripService;
import common.beans.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

/**
 * @program: Wxplatform
 * @description: 关于周程的控制器
 * @author: zhijies
 * @create: 2018-12-17 17:40
 **/
@RestController
@RequestMapping("/wxbackstage")
public class DateTripController {

    @Autowired
    WxDateTripService wxDateTripService;

    /*
      * @Description:  部长添加周程至周程列表
      * @Param: [dateTrip]
      * @return: common.beans.ResultBean<java.lang.Long>
      * @Author:  zhijie
      * @Date: 2018/12/20
      */
    @RequestMapping(value = "adddatetrip", method = RequestMethod.POST)
    public ResultBean<Long> addMember(DateTrip dateTrip) {
        return new ResultBean<Long>(wxDateTripService.insertDateTrip(dateTrip));

    }

    /*
            * @Description:  修改周程状态
            * @Param: [dateTrip, dateTripId]
            * @return: common.beans.ResultBean<java.lang.Integer>
            * @Author:  zhijie
            * @Date: 2018/12/24
            */
    @RequestMapping(value = "updatedatetrip", method = RequestMethod.POST)
    public ResultBean<Integer> updateStatus(DateTrip dateTrip, @RequestParam("datetripid") String dateTripId) {
        return new ResultBean<Integer>(wxDateTripService.updateDateTripStatus(dateTrip, dateTripId));
    }

    /*
* @Description:  通过分页查找所有的周程
* @Param: [week, currentPage]
* @return: common.beans.ResultBean<com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>>
* @Author:  zhijie
* @Date: 2018/12/25
*/
    @RequestMapping(value = "selectdatetripwithpage", method = RequestMethod.GET)
    public ResultBean<PageInfo<DateTrip>> selectDateTripWithPage(@RequestParam("week") int week,
                                                                 @RequestParam("currentpage") Integer currentPage){


    return new ResultBean<PageInfo<DateTrip>>(wxDateTripService.selectDateTripWithPage(week, currentPage));
    }


    /*
* @Description:  通过分页查找所有的周程，用在小程序前端
* @Param: [week, currentPage]
* @return: common.beans.ResultBean<com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>>
* @Author:  zhijie
* @Date: 2018/12/25
*/
    @RequestMapping(value = "selectdatetripwithpagethisweek", method = RequestMethod.GET)
    public ResultBean<PageInfo<DateTrip>> selectDateTripWithPageThisWeek(@RequestParam("week") int week,
                                                                 @RequestParam("currentpage") Integer currentPage){


        return new ResultBean<PageInfo<DateTrip>>(wxDateTripService.selectDateTripByPassWithPageThisWeek(week, currentPage));
    }
    /*
    * @Description: 查找已经通过的周程接口
    * @Param: [week, currentPage]
    * @return: common.beans.ResultBean<com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>>
    * @Author:  zhijie
    * @Date: 2018/12/25
    */
    @RequestMapping(value = "selectdatetripbypasswithpage", method = RequestMethod.GET)
    public ResultBean<PageInfo<DateTrip>> selectDateTripByPassWithPage(@RequestParam("week") int week,
                                                                 @RequestParam("currentpage") Integer currentPage){

        return new ResultBean<PageInfo<DateTrip>>(wxDateTripService.selectDateTripByPassWithPage(week, currentPage));
    }
    /*
     * @Description: 查找未通过的周程接口
     * @Param: [week, currentPage]
     * @return: common.beans.ResultBean<com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>>
     * @Author:  zhijie
     * @Date: 2018/12/25
     */
    @RequestMapping(value = "selectdatetripnopasswithpage", method = RequestMethod.GET)
    public ResultBean<PageInfo<DateTrip>> selectDateTripNoPassWithPage(@RequestParam("week") int week,
                                                                       @RequestParam("currentpage") Integer currentPage){

        return new ResultBean<PageInfo<DateTrip>>(wxDateTripService.selectDateTripNoPassWithPageThisWeek(week, currentPage));
    }


    /*
      * @Description:  删除接口
      * @Param: [datetripId]
      * @return: common.beans.ResultBean<java.lang.Integer>
      * @Author:  zhijie
      * @Date: 2018/12/26
      */
    @RequestMapping(value = "deletedatetrip", method = RequestMethod.POST)
    public ResultBean<Integer> deleteDateTrip(@RequestParam("datetripid") String datetripId) {
       return new ResultBean<Integer>(wxDateTripService.deleteDateTrip(datetripId));
    }
}
