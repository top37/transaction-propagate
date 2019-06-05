package com.zyc.transactionpropagate.dao;

import com.zyc.transactionpropagate.model.Transinfo;
import com.zyc.transactionpropagate.model.TransinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransinfoMapper {
    int countByExample(TransinfoExample example);

    int deleteByExample(TransinfoExample example);

    int deleteByPrimaryKey(Long a);

    int insert(Transinfo record);

    int insertSelective(Transinfo record);

    List<Transinfo> selectByExample(TransinfoExample example);

    Transinfo selectByPrimaryKey(Long a);

    int updateByExampleSelective(@Param("record") Transinfo record, @Param("example") TransinfoExample example);

    int updateByExample(@Param("record") Transinfo record, @Param("example") TransinfoExample example);

    int updateByPrimaryKeySelective(Transinfo record);

    int updateByPrimaryKey(Transinfo record);
}