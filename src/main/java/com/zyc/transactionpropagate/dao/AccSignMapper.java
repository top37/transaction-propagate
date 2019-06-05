package com.zyc.transactionpropagate.dao;

import com.zyc.transactionpropagate.model.AccSign;
import com.zyc.transactionpropagate.model.AccSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccSignMapper {
    int countByExample(AccSignExample example);

    int deleteByExample(AccSignExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(AccSign record);

    int insertSelective(AccSign record);

    List<AccSign> selectByExample(AccSignExample example);

    AccSign selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") AccSign record, @Param("example") AccSignExample example);

    int updateByExample(@Param("record") AccSign record, @Param("example") AccSignExample example);

    int updateByPrimaryKeySelective(AccSign record);

    int updateByPrimaryKey(AccSign record);
}