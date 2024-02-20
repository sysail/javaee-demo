package com.mj.xr.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    protected static JdbcTemplate tpl;
    static {
        try {
            // 获取连接池
            Properties properties = new Properties();
            properties.load(WebsiteDaoImpl.class.getClassLoader().getResourceAsStream("druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            // 创建tpl
            tpl = new JdbcTemplate(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
