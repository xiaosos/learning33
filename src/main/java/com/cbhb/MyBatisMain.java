package com.cbhb;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisMain {
	public static void main(String[] args) throws IOException {
		String resource = "config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
//			Test test = (Test) session.selectOne("com.cbhb.TestMapper1.selectTest", 1);
//			Test test =
			TestMapper testMapper = session.getMapper(TestMapper.class);
			Test test = testMapper.getTest("qqq");
			System.out.println(test );
		} finally {
			session.close();
		}
	}
}
