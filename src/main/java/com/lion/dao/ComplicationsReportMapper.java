package com.lion.dao;

import com.lion.pojo.ComplicationsReport;
import com.lion.pojo.ComplicationsReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplicationsReportMapper {
    long countByExample(ComplicationsReportExample example);

    int deleteByExample(ComplicationsReportExample example);

    int insert(ComplicationsReport record);

    int insertSelective(ComplicationsReport record);

    List<ComplicationsReport> selectByExample(ComplicationsReportExample example);

    int updateByExampleSelective(@Param("record") ComplicationsReport record, @Param("example") ComplicationsReportExample example);

    int updateByExample(@Param("record") ComplicationsReport record, @Param("example") ComplicationsReportExample example);
}