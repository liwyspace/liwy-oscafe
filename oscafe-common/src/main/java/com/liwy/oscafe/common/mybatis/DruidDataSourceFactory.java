package com.liwy.oscafe.common.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @author liwy
 * @date 2019-06-29 23:56
 */
public class DruidDataSourceFactory extends UnpooledDataSourceFactory {
    public DruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();
    }
}
