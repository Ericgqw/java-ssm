package com.kms.mapper;

import com.kms.model.Staff;
import com.kms.model.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Staff record);
    
    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}