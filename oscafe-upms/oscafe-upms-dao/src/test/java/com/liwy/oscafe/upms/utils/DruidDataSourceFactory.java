package com.liwy.oscafe.upms.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * Created by liwy on 2018/2/25.
 */
public class DruidDataSourceFactory extends UnpooledDataSourceFactory{
    public DruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();
    }
}
