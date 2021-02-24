package com.example.mybatisgenator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisgenator.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(@Param("list") List<User> list);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);
}