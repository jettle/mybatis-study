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
	 * SQLӳ���ļ�.xmlӳ��:XmlMapper
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //mybatis�����ļ�
		String resource = "Configuration.xml";
		//ʹ�������������mybatis�������ļ������������ع�����ӳ���ļ�
		InputStream is = TestCrudByXmlMapper.class.getClassLoader().getResourceAsStream(resource);
		//����session����
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		//�����ܹ�ִ��ӳ���ļ���sql��sqlsession
		SqlSession session = sessionFactory.openSession();
		/**
         * ӳ��sql�ı�ʶ�ַ�����
         * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
         * getUser��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
         */
		//ӳ��sql�ı�־�ַ���
		String statement = "com.study.mapping.userMapper.selectUserById";
		//ִ�в�ѯ����һ��Ψһuser�����sql
		User user = session.selectOne(statement, 1);
		session.close();
		System.out.println(user);
	}

}
