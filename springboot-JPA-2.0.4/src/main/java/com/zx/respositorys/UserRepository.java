package com.zx.respositorys;

import com.zx.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @创建人 张绚
 * @创建时间 2019/11/8 0008
 * @描述 继承JpaRepository<Object, type>来完成对数据库的操作
 *       1.Object:需要操作的实体类的类名；
 *       2.type:实体类中标注@Id注解的成员变量类型
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
