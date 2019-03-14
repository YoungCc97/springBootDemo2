package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
//        User user = userMapper.selectByPrimaryKey(1L);
//        System.out.println("user="+user);
        List<User> users = userMapper.selectAll();
        for (User user1:users){
            System.out.println("user="+user1);
        }

    }
}