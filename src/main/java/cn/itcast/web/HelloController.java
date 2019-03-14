package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserServie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author Young
 * @date 2019/3/11 19:05
 * @description：
 */
//@RestController
@Controller
@Slf4j
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserServie userServie;

    @GetMapping("{id}")
    public User hello(@PathVariable("id") Long id){
        log.debug("hello method is running");
        return userServie.queryById(id);
    }

    @RequestMapping("/all")
    public String all(ModelMap model){
        //查询用户
        List<User> users = userServie.queryAllUser();
        //放入模型
        model.addAttribute("users",users);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        return "users";
    }
}
