package com.wxplatform.dao.impl;


import com.wxplatform.dao.WxDateTrip;
import com.wxplatform.mapper.DateTripMapper;
import com.wxplatform.pojo.DateTrip;
import com.wxplatform.pojo.DateTripExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import static common.utils.GetTimeUtils.setSthIdByCurrentTime;

/**
 * @program: Wxplatform
 * @description: 周程模块于数据库交互的模块
 * @author: zhijie
 * @create: 2018-12-06 22:01
 **/
@Component
@Repository
public class WxDateTripImpl implements WxDateTrip {

    @Autowired
    DateTripMapper dateTripMapper;

    /*
   * @Description:  添加周程的模块，部长能对周程进行添加，尚未确定管理层是否能加。
   * 注意：周程的编号由系统精确到毫秒组成
   * @Param: [dateTrip]
   * @return: int
   * @Author:  zhijie
   * @Date: 2018/12/6
   */
    @Override
    public long insertDataTrip(DateTrip dateTrip) {

        dateTrip.setDatetripid(setSthIdByCurrentTime()); //获取当前周程的Id编号
        dateTrip.setTripstatus("0");  //设置当前周程状态为待审核

        return dateTripMapper.insert(dateTrip);
    }

    /*
          * @Description: 改变部长上传的周程的状态 0：等待审核 1：审核通过
          * @Param: [dateTrip, dateTripId]
          * @return: int
          * @Author:  zhijie
          * @Date: 2018/12/24
          */
    @Override
    public int updateDateTripStatus(DateTrip dateTrip, String dateTripId) {
       dateTrip.setDatetripid(dateTripId);
        dateTrip.setTripstatus("1");
        return dateTripMapper.updateByPrimaryKeySelective(dateTrip);
    }

    /*
       * @Description:  分页查询 获取系统当前周的下一周的周程
       * @Param: [week]
       * @return: java.util.List<com.wxplatform.pojo.DateTrip>
       * @Author:  zhijie
       * @Date: 2018/12/25
       */
    @Override
    public List<DateTrip> selectDateTripWithPage(int week) {
        DateTripExample dateTripExample = new DateTripExample();
        DateTripExample.Criteria criteria = dateTripExample.createCriteria();   //构造自定义的查询条件
        int nextweek = week + 1;
        criteria.andWeekEqualTo(nextweek);
        return dateTripMapper.selectByExample(dateTripExample);
    }

    /*
        * @Description:  用在后台所看到的周程的信息
        * @Param: [week]
        * @return: java.util.List<com.wxplatform.pojo.DateTrip>
        * @Author:  zhijie
        * @Date: 2018/12/26
        */
    @Override
    public List<DateTrip> selectDateTripPassWithPage(int week) {
        DateTripExample dateTripExample = new DateTripExample();
        DateTripExample.Criteria criteria = dateTripExample.createCriteria();   //构造自定义的查询条件
        int nextweek = week + 1;
        criteria.andWeekEqualTo(nextweek);
        criteria.andTripstatusEqualTo("1");
        return dateTripMapper.selectByExample(dateTripExample);
    }

    /*
      * @Description:  用在小程序所看到的周程的信息
      * @Param: [week]
      * @return: java.util.List<com.wxplatform.pojo.DateTrip>
      * @Author:  zhijie
      * @Date: 2018/12/26
      */
    @Override
    public List<DateTrip> selectDateTripPassWithPageThisWeek(int week) {
        DateTripExample dateTripExample = new DateTripExample();
        DateTripExample.Criteria criteria = dateTripExample.createCriteria();   //构造自定义的查询条件
        criteria.andWeekEqualTo(week);
        criteria.andTripstatusEqualTo("1");
        return dateTripMapper.selectByExample(dateTripExample);
    }

    /*
       * @Description:  查找未通过的的周程
       * @Param: [week]
       * @return: java.util.List<com.wxplatform.pojo.DateTrip>
       * @Author:  zhijie
       * @Date: 2018/12/26
       */
    @Override
    public List<DateTrip> selectDateTripNoPass(int week) {
        DateTripExample dateTripExample = new DateTripExample();
        DateTripExample.Criteria criteria = dateTripExample.createCriteria();   //构造自定义的查询条件
        criteria.andWeekEqualTo(week);
        criteria.andTripstatusEqualTo("0");
        return dateTripMapper.selectByExample(dateTripExample);
    }

    @Override
    public int deleteDateTrip(String dateTripId) {
        return dateTripMapper.deleteByPrimaryKey(dateTripId);
    }

}
