package com.wxplatform.mapper;

import com.wxplatform.pojo.PoliticalStatusInfo;
import com.wxplatform.pojo.PoliticalStatusInfoExample;
import java.util.List;

public interface PoliticalStatusInfoMapper {
    int deleteByPrimaryKey(Integer politicalstatusid);

    int insert(PoliticalStatusInfo record);

    int insertSelective(PoliticalStatusInfo record);

    List<PoliticalStatusInfo> selectByExample(PoliticalStatusInfoExample example);

    PoliticalStatusInfo selectByPrimaryKey(Integer politicalstatusid);

    int updateByPrimaryKeySelective(PoliticalStatusInfo record);

    int updateByPrimaryKey(PoliticalStatusInfo record);
}