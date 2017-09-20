package com.rightpaw.spring.springbasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alinawxn on 9/19/2017.
 */
@Component
public class PersonDAO {

    @Autowired
    JDBCConnection jdbcConnection;

    public JDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
