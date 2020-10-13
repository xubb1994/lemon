package com.lemon.system.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lemon.system.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author xubb
 * @since 2020-09-11
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户对象获取用户列表
     * @param user
     * @return
     */
    IPage<User> getUserList(Page<User> userPage, User user);
}
