package com.wxplatform.mapper;

import com.wxplatform.pojo.TissusInfo;
import com.wxplatform.pojo.TissusInfoExample;
import java.util.List;

public interface TissusInfoMapper {
    int deleteByPrimaryKey(Integer tissusid);

    int insert(TissusInfo record);

    int insertSelective(TissusInfo record);

    List<TissusInfo> selectByExample(TissusInfoExample example);

    TissusInfo selectByPrimaryKey(Integer tissusid);

    int updateByPrimaryKeySelective(TissusInfo record);

    int updateByPrimaryKey(TissusInfo record);
}