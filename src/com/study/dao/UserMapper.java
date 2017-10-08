package com.study.dao;

import org.apache.ibatis.annotations.Select;

import com.study.pojo.User;

/**
 * @author jettle 2017-07-31
 * @title  ӳ���ļ�userMappe.xml�ӿ�
 */
/*
 * ˵�������ǲ���ҪΪUserMapper�ӿ�ȥ��д�����ʵ���࣬
 * �����ʵ������mybatis�����Ƕ�̬�Ĺ�������������ֱ������ʹ�ü��ɡ�
 */
public interface UserMapper {
    //ʹ��@Selectע��ָ��selectUserById()����Ҫִ�е�SQL
	/*
	 * ��Ϊ��mapping:userMapper�е�namespace����δ��dao:UserMapper����ȫ�����Ӧ��
	 * ���ԣ����½�ʹ��@selectע����ȷ��mybatis��UserMapper�ӿ��ҵ���ӳ�䵽userMapper.xmlָ����SQL��
	 */
	@Select("SELECT * FROM user WHERE id=#{id}")
	public User selectUserById(int id);
}
