package com.wxplatform.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxplatform.dao.WxDateTrip;

import com.wxplatform.pojo.DateTrip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

import static common.utils.NotNullCheckUtils.*;

/**
 * @program: Wxplatform
 * @description: 周程的业务逻辑层
 * @author: zhijie
 * @create: 2018-12-07 10:08
 **/
@Service
@Component
public class WxDateTripService {

    private final WxDateTrip wxDateTrip;
    private static final Logger logger = LoggerFactory.getLogger(WxDateTripService.class);

    ConcurrentSkipListMap<String, Object> concurrentSkipListMap =
            new ConcurrentSkipListMap<String, Object>();

    public WxDateTripService(WxDateTrip wxDateTrip) {
        this.wxDateTrip = wxDateTrip;
    }


    /*
       * @Description:  部长添加周程，每一次只能同时添加一次周程。
        * 注意的是：周程内的主办部门和编写者都是由cookie获取到隐藏表单之内，因此不必判断是否为空或者不存在。
       * @Param: [dateTrip]
       * @return: long
       * @Author:  zhijie
       * @Date: 2018/12/17
       */
    public long insertDateTrip(DateTrip dateTrip) {

        NotNull(dateTrip.getDate(), "dateTrip.date.is.null");   //活动开始日期规格：yyyymmdd
        NotNull(dateTrip.getTime(), "dateTrip.time.is.null");    //活动开始时间:hhmmss
        NotNullInt(dateTrip.getWeek(), "dateTrip.week.is.null");    //活动周数
        NotNull(dateTrip.getXqday(), "dateTrip.xqday.is.null");  //活动星期
        NotNull(dateTrip.getDatetripcontent(), "dateTrip.content.is.null"); //活动内容
        NotNull(dateTrip.getParticipants(), "dateTrip.participants.is.null");   //活动参加人员
        NotNull(dateTrip.getPlace(), "dateTrip.place.is.null");  //活动地点
        long datetrip = wxDateTrip.insertDataTrip(dateTrip);
        logger.info("添加成功！");
        return datetrip;
    }

    /*
            * @Description:  修改周程状态
            * @Param: [dateTrip, dateTripId]
            * @return: int
            * @Author:  zhijie
            * @Date: 2018/12/24
            */
    public int updateDateTripStatus(DateTrip dateTrip, String dateTripId) {
        int updateStatus = wxDateTrip.updateDateTripStatus(dateTrip, dateTripId);
        return updateStatus;
    }

    public PageInfo<DateTrip> selectDateTripWithPage(int nextweek, Integer currentPage) {
       PageHelper.startPage(currentPage, 5);
        List<DateTrip> dateTripList = wxDateTrip.selectDateTripWithPage(nextweek);

     ListNotExist(dateTripList,"dateTrip.list.is.null");
        PageInfo<DateTrip> dateTripPageInfo = new PageInfo<DateTrip>(dateTripList);
        logger.info("查找成功");
        return dateTripPageInfo;
    }

    /*
        * @Description: 查找已经通过审核的周程内容
        * @Param: [nextweek, currentPage]
        * @return: com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>
        * @Author:  zhijie
        * @Date: 2018/12/26
        */
    public PageInfo<DateTrip> selectDateTripByPassWithPage(int nextweek, Integer currentPage) {
         PageHelper.startPage(currentPage, 5);
        List<DateTrip> dateTripList = wxDateTrip.selectDateTripPassWithPage(nextweek);
        ListNotExist(dateTripList,"dateTrip.list.is.null");
        PageInfo<DateTrip> dateTripPageInfo = new PageInfo<DateTrip>(dateTripList);
        logger.info("查找成功");
        return dateTripPageInfo;
    }

    /*
       * @Description: 查找已经通过审核的周程内容
       * @Param: [nextweek, currentPage]
       * @return: com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>
       * @Author:  zhijie
       * @Date: 2018/12/26
       */
    public PageInfo<DateTrip> selectDateTripByPassWithPageThisWeek(int week, Integer currentPage) {
        PageHelper.startPage(currentPage, 5);
        List<DateTrip> dateTripList = wxDateTrip.selectDateTripPassWithPageThisWeek(week);
        ListNotExist(dateTripList,"dateTrip.list.is.null");
        PageInfo<DateTrip> dateTripPageInfo = new PageInfo<DateTrip>(dateTripList);
        logger.info("查找成功");
        return dateTripPageInfo;
    }
    /*
    * @Description: 查找未通过审核的周程内容
    * @Param: [nextweek, currentPage]
    * @return: com.github.pagehelper.PageInfo<com.wxplatform.pojo.DateTrip>
    * @Author:  zhijie
    * @Date: 2018/12/26
    */
    public PageInfo<DateTrip> selectDateTripNoPassWithPageThisWeek(int week, Integer currentPage) {
        PageHelper.startPage(currentPage, 5);
        List<DateTrip> dateTripList = wxDateTrip.selectDateTripNoPass(week);
        ListNotExist(dateTripList,"dateTrip.list.is.null");
        PageInfo<DateTrip> dateTripPageInfo = new PageInfo<DateTrip>(dateTripList);
        logger.info("查找成功");
        return dateTripPageInfo;
    }
    /*
        * @Description:  删除
        * @Param: [dateTripId]
        * @return: int
        * @Author:  zhijie
        * @Date: 2018/12/26
        */
    public int deleteDateTrip(String dateTripId) {
         int deleteDateTrip = wxDateTrip.deleteDateTrip(dateTripId);
        return deleteDateTrip;
    }
}