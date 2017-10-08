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
    * �Զ�ӳ�䣺AnnotationMapper
    */

   @Test
   public void selectUserById(){

	   //mybatis�����ļ�
	   String resource = "Configuration.xml";
	   //ʹ���������������mybatis�����ļ������������ع�����ӳ���ļ�
	   InputStream is = TestCrudByAnnotationMapper.class.getClassLoader().getSystemResourceAsStream(resource);
	   //����sessionfactory
	   SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	   //����sqlsession
	   SqlSession sqlSession = sessionFactory.openSession();
	  
	   UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	   User user = userMapper.selectUserById(1);
	   sqlSession.close();
	   System.out.println(user);
   }
   
   
}
