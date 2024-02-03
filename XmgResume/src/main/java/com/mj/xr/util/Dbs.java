package com.mj.xr.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mj.xr.dao.WebsiteDaoImpl;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

public class Dbs {
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

    public static JdbcTemplate getTpl() {
        return tpl;
    }
}
