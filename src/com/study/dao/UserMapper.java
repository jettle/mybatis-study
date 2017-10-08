package com.study.dao;

import org.apache.ibatis.annotations.Select;

import com.study.pojo.User;

/**
 * @author jettle 2017-07-31
 * @title  映射文件userMappe.xml接口
 */
/*
 * 说明：我们不需要为UserMapper接口去编写具体的实现类，
 * 具体的实现类由mybatis帮我们动态的构建出来，我们直接拿来使用即可。
 */
public interface UserMapper {
    //使用@Select注解指明selectUserById()方法要执行的SQL
	/*
	 * 因为，mapping:userMapper中的namespace命名未与dao:UserMapper的类全名相对应，
	 * 所以，以下将使用@select注解来确保mybatis（UserMapper接口找到并映射到userMapper.xml指定的SQL）
	 */
	@Select("SELECT * FROM user WHERE id=#{id}")
	public User selectUserById(int id);
}
