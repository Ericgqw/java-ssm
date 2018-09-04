package com.kms.mapper;

import com.kms.model.Plan_prd;
import com.kms.model.Plan_prdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Plan_prdMapper {
    long countByExample(Plan_prdExample example);

    int deleteByExample(Plan_prdExample example);

    int insert(Plan_prd record);

    int insertSelective(Plan_prd record);

    List<Plan_prd> selectByExample(Plan_prdExample example);

    int updateByExampleSelective(@Param("record") Plan_prd record, @Param("example") Plan_prdExample example);

    int updateByExample(@Param("record") Plan_prd record, @Param("example") Plan_prdExample example);
}