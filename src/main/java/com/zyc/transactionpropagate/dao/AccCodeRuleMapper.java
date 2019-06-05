package com.zyc.transactionpropagate.dao;

import com.zyc.transactionpropagate.model.AccCodeRule;
import com.zyc.transactionpropagate.model.AccCodeRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccCodeRuleMapper {
    int countByExample(AccCodeRuleExample example);

    int deleteByExample(AccCodeRuleExample example);

    int deleteByPrimaryKey(Long fId);

    int insert(AccCodeRule record);

    int insertSelective(AccCodeRule record);

    List<AccCodeRule> selectByExample(AccCodeRuleExample example);

    AccCodeRule selectByPrimaryKey(Long fId);

    int updateByExampleSelective(@Param("record") AccCodeRule record, @Param("example") AccCodeRuleExample example);

    int updateByExample(@Param("record") AccCodeRule record, @Param("example") AccCodeRuleExample example);

    int updateByPrimaryKeySelective(AccCodeRule record);

    int updateByPrimaryKey(AccCodeRule record);
}