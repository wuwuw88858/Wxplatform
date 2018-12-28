package com.wxplatform.dao;

import com.wxplatform.pojo.DateTrip;

import java.util.Date;
import java.util.List;

/**
 * @program: Wxplatform
 * @description: 周程数据库操作的相关接口
 * @author: zhijie
 * @create: 2018-12-06 22:00
 **/
public interface WxDateTrip {
    long insertDataTrip(DateTrip dateTrip);
    int updateDateTripStatus(DateTrip dateTrip, String dateTripId);
    List<DateTrip> selectDateTripWithPage(int week);    //分页获取所有周程的信息
    List<DateTrip> selectDateTripPassWithPage(int week);   //查看
    int deleteDateTrip(String dateTripId);
    List<DateTrip> selectDateTripPassWithPageThisWeek(int week);   //查看本周的周程（通过）
    List<DateTrip> selectDateTripNoPass(int week);
}
