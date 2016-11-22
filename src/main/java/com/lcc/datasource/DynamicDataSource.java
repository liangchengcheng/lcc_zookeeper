package com.lcc.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.sql.Connection;
import java.sql.SQLException;
/**
 * Created by lcc on 2016/11/22.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        return DataSourceKeyHolder.getCurrentKey();
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = super.getConnection();
        if (DataSourceKeyHolder.getCurrentKey() != null) {
            //log.info("Datasource route to {}, key={}", connection, DataSourceKeyHolder.getCurrentKey());
        }
        return connection;
    }
}
