package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Young
 * @date 2019/3/14 17:16
 * @description：
 */
@Service
public class UserServie {
    @Autowired
    private UserMapper userMapper;

    /**
     *   @author Young
     *   @date 2019/3/14 17:19
     *   @description：根据ID查询用户
    */
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
    /**
     *   @author Young
     *   @date 2019/3/14 17:19
     *   @description：新增用户
    */
    @Transactional
    public void insertUser(User user){
        userMapper.insert(user);
    }
    /**
     *   @author Young
     *   @date 2019/3/14 17:26
     *   @description：查询全部用户
    */
    public List<User> queryAllUser(){
        return userMapper.selectAll();
    }
}
