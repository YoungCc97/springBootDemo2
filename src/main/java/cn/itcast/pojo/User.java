package cn.itcast.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @author Young
 * @date 2019/3/13 19:48
 * @description：USer实体类
 */
@Data
@Table(name = "tb_user")
public class User {
    //id
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    //用户名
    private String userName;

    //密码
    private String password;

    //姓名
    private String  name;

    //年龄
    private Integer age;

    //性别 1男 2女
    private Integer sex;

    //出生日期
    private Date birthday;

    //创建时间
    private Date created;

    //更新时间
    private Date updated;

    //备注
    @Transient
    private String note;
}
