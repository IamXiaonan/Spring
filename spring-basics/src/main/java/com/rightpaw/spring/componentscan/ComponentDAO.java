package com.rightpaw.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alinawxn on 9/19/2017.
 */
@Component
public class ComponentDAO {

    @Autowired
    ComponentJDBCConnection jdbcConnection;

    public ComponentJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
