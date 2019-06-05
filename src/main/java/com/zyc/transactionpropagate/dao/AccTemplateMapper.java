package com.zyc.transactionpropagate.dao;

import com.zyc.transactionpropagate.model.AccTemplate;
import com.zyc.transactionpropagate.model.AccTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccTemplateMapper {
    int countByExample(AccTemplateExample example);

    int deleteByExample(AccTemplateExample example);

    int deleteByPrimaryKey(Long fId);

    int insert(AccTemplate record);

    int insertSelective(AccTemplate record);

    List<AccTemplate> selectByExample(AccTemplateExample example);

    AccTemplate selectByPrimaryKey(Long fId);

    int updateByExampleSelective(@Param("record") AccTemplate record, @Param("example") AccTemplateExample example);

    int updateByExample(@Param("record") AccTemplate record, @Param("example") AccTemplateExample example);

    int updateByPrimaryKeySelective(AccTemplate record);

    int updateByPrimaryKey(AccTemplate record);
}