package com.liwy.oscafe.upms.dao;

import com.liwy.oscafe.common.mybatis.CommonExample;
import com.liwy.oscafe.upms.entity.UpmsUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by liwy on 2018/1/18.
 */
public class UpmsUserDaoTest {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private IUpmsUserDao userDao;

    @BeforeClass
    public static void initSessionFactory() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void createSession() {
        session = sqlSessionFactory.openSession();
        userDao = session.getMapper(IUpmsUserDao.class);
    }

    @After
    public void closeSession() {
        session.rollback();
        session.close();
    }

    @Test
    public void testInsert() {
        UpmsUser user = new UpmsUser();
        user.setUsername("liwy");
        user.setPassword("123456");
        user.setSalt("111");
        user.setNickname("灰烬");
        user.setHeadpic("htt://www.oscaf.net/pic");
        user.setRealname("文耀");
        user.setSex((byte) 0);
        user.setEmail("liwy_java@126.com");
        user.setPhone("130555555555");
        user.setStatus((byte) 1);
        user.setCtime(new Date().getTime());
        userDao.insert(user);
    }

    @Test
    public void testInsertSelective() {
        UpmsUser user = new UpmsUser();
        user.setUsername("liwy");
        user.setPassword("123456");
        user.setSalt("111");
        user.setStatus((byte) 1);
        user.setCtime(new Date().getTime());
        userDao.insertSelective(user);
    }

    @Test
    public void testDeleteByExample() {
        CommonExample example = new CommonExample();
        CommonExample.Criteria criteria = example.or();
        criteria.addCriterion("user_id = ", 1001);
        userDao.deleteByExample(example);
    }

    @Test
    public void testDeleteByPrimaryKey() {
        userDao.deleteByPrimaryKey(1001);
    }





    @Test
    public void countByExampleTest() {
        UpmsUser user = session.selectOne("com.liwy.oscafe.upms.dao.IUpmsUserDao.selectByPrimaryKey",1);
        System.out.println(user.toString());

        IUpmsUserDao userDao = session.getMapper(IUpmsUserDao.class);
        System.out.println(userDao.selectByPrimaryKey(1));

        CommonExample example = new CommonExample();
        CommonExample.Criteria criteria = example.or();
        criteria.addCriterion("user_id = ",1);
        System.out.println(userDao.selectByExample(example));

    }

    @Test
    public void testSelectByPrimaryKey() {
        System.out.println(userDao.selectByPrimaryKey(1));
    }

    @Test
    public void testSelectByExample() {
        CommonExample example = new CommonExample();
        CommonExample.Criteria criteria = example.or();
        criteria.addCriterion("user_id = ", 1);
        System.out.println(userDao.selectByExample(example));
    }
}
