package com.wxplatform.mapper;

import com.wxplatform.pojo.DateTrip;
import com.wxplatform.pojo.DateTripExample;
import java.util.List;

public interface DateTripMapper {
    int deleteByPrimaryKey(String datetripid);

    int insert(DateTrip record);

    int insertSelective(DateTrip record);

    List<DateTrip> selectByExample(DateTripExample example);

    DateTrip selectByPrimaryKey(String datetripid);

    int updateByPrimaryKeySelective(DateTrip record);

    int updateByPrimaryKey(DateTrip record);
}