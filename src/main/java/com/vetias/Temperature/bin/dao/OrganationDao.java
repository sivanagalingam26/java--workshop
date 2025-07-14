package com.vetias.Temperature.bin.dao;

import org.h2.jdbc.JdbcDataSource;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class OrganationDao {
    public void createTable() {
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2dDataSource.setUrl("jdbc:h2:tempdataD8");
        h2dDataSource.setUser("sa");
        try(Connection dbConnection = h2dDataSource.getConnection
        
            Statement statement = dbConnection.createStatement();){
                statement.execute("""
                        create table organation(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        WEBSITE VARCHAR(100),
                        EMALI VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT,
                        """);

    }catch(SQLException e){
        System.out.println("error creating table:"+ e.getMessage());
    }

}
}
