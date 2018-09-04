package com.kms.mapper;

import com.kms.model.Plan_AutoD;
import com.kms.model.Plan_AutoDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Plan_AutoDMapper {
    long countByExample(Plan_AutoDExample example);

    int deleteByExample(Plan_AutoDExample example);

    int insert(Plan_AutoD record);

    int insertSelective(Plan_AutoD record);

    List<Plan_AutoD> selectByExample(Plan_AutoDExample example);

    int updateByExampleSelective(@Param("record") Plan_AutoD record, @Param("example") Plan_AutoDExample example);

    int updateByExample(@Param("record") Plan_AutoD record, @Param("example") Plan_AutoDExample example);
}