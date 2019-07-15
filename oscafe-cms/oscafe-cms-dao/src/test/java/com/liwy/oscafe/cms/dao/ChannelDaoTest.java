package com.liwy.oscafe.cms.dao;

import com.liwy.oscafe.cms.dao.model.Channel;
import com.liwy.oscafe.common.mybatis.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * 频道测试类
 *
 * @author liwy
 * @date 2019-06-30 19:29:56
 */
public class ChannelDaoTest {
    private SqlSession session;
    private ChannelDao channelDao;

    @Before
    public void testBefore() {
        session = MyBatisUtils.getSession();
        channelDao = session.getMapper(ChannelDao.class);
    }

    @After
    public void testAfter() {
        session.rollback();
        session.close();
    }

    /**
     * 通过主键查询
     */
    @Test
    public void testSelectByPrimaryKey() {
        Channel channel = channelDao.selectByPrimaryKey(10);
        assertThat(channel, notNullValue());

    }

    /**
     * 插入数据
     */
    @Test
    public void testInsertSelective() {
        Channel channel = new Channel();
        channel.setName("首页");
        channel.setOrders(1);
        int insert = channelDao.insertSelective(channel);
        assertThat(insert, is(1));
    }
}
