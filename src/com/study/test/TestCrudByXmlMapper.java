package com.study.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.study.pojo.User;

public class TestCrudByXmlMapper {
	/**
	 * @param args
	 */
	/*
	 * SQL映射文件.xml映射:XmlMapper
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //mybatis配置文件
		String resource = "Configuration.xml";
		//使用类加载器加载mybatis的配置文件，包括：加载关联的映射文件
		InputStream is = TestCrudByXmlMapper.class.getClassLoader().getResourceAsStream(resource);
		//构建session工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		//创建能够执行映射文件中sql的sqlsession
		SqlSession session = sessionFactory.openSession();
		/**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
		//映射sql的标志字符串
		String statement = "com.study.mapping.userMapper.selectUserById";
		//执行查询返回一个唯一user对象的sql
		User user = session.selectOne(statement, 1);
		session.close();
		System.out.println(user);
	}

}
