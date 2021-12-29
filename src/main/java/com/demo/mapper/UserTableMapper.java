package com.demo.mapper;

import com.demo.pojo.UserTable;
import com.demo.pojo.UserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTableMapper {
    int countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    List<UserTable> selectByExample(UserTableExample example);

    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);
}