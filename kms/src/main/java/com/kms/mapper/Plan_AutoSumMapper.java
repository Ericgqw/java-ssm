package com.kms.mapper;

import com.kms.model.Plan_AutoSum;
import com.kms.model.Plan_AutoSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Plan_AutoSumMapper {
    long countByExample(Plan_AutoSumExample example);

    int deleteByExample(Plan_AutoSumExample example);

    int insert(Plan_AutoSum record);

    int insertSelective(Plan_AutoSum record);

    List<Plan_AutoSum> selectByExample(Plan_AutoSumExample example);

    int updateByExampleSelective(@Param("record") Plan_AutoSum record, @Param("example") Plan_AutoSumExample example);

    int updateByExample(@Param("record") Plan_AutoSum record, @Param("example") Plan_AutoSumExample example);
}