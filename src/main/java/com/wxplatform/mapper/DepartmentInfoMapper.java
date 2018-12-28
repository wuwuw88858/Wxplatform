package com.wxplatform.mapper;

import com.wxplatform.pojo.DepartmentInfo;
import com.wxplatform.pojo.DepartmentInfoExample;
import java.util.List;

public interface DepartmentInfoMapper {
    int deleteByPrimaryKey(Integer departmentid);

    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);

    List<DepartmentInfo> selectByExample(DepartmentInfoExample example);

    DepartmentInfo selectByPrimaryKey(Integer departmentid);

    int updateByPrimaryKeySelective(DepartmentInfo record);

    int updateByPrimaryKey(DepartmentInfo record);
}