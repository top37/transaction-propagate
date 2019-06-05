package com.zyc.transactionpropagate.dao;

import com.zyc.transactionpropagate.model.AccCode;
import com.zyc.transactionpropagate.model.AccCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccCodeMapper {
    int countByExample(AccCodeExample example);

    int deleteByExample(AccCodeExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(AccCode record);

    int insertGene();

    int updateGene();

    int insertSelective(AccCode record);

    List<AccCode> selectByExample(AccCodeExample example);

    AccCode selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") AccCode record, @Param("example") AccCodeExample example);

    int updateByExample(@Param("record") AccCode record, @Param("example") AccCodeExample example);

    int updateByPrimaryKeySelective(AccCode record);

    int updateByPrimaryKey(AccCode record);
}