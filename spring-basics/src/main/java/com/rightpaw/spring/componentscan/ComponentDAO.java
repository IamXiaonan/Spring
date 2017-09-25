package com.rightpaw.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by alinawxn on 9/19/2017.
 */
@Repository
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
