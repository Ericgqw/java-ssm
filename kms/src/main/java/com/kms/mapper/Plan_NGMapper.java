package com.kms.mapper;

import com.kms.model.Plan_NG;
import com.kms.model.Plan_NGExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Plan_NGMapper {
    long countByExample(Plan_NGExample example);

    int deleteByExample(Plan_NGExample example);

    int insert(Plan_NG record);

    int insertSelective(Plan_NG record);

    List<Plan_NG> selectByExample(Plan_NGExample example);

    int updateByExampleSelective(@Param("record") Plan_NG record, @Param("example") Plan_NGExample example);

    int updateByExample(@Param("record") Plan_NG record, @Param("example") Plan_NGExample example);
}