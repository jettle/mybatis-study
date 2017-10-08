package com.study.test;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

import com.study.dao.UserMapper;
import com.study.pojo.User;
public class TestCrudByAnnotationMapper {

   /*
    * 自动映射：AnnotationMapper
    */

   @Test
   public void selectUserById(){

	   //mybatis配置文件
	   String resource = "Configuration.xml";
	   //使用类加载器，加载mybatis配置文件，包括：加载关联的映射文件
	   InputStream is = TestCrudByAnnotationMapper.class.getClassLoader().getSystemResourceAsStream(resource);
	   //创建sessionfactory
	   SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	   //创建sqlsession
	   SqlSession sqlSession = sessionFactory.openSession();
	  
	   UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	   User user = userMapper.selectUserById(1);
	   sqlSession.close();
	   System.out.println(user);
   }
   
   
}
