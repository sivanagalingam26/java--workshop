package com.vetias.Temperature.bin.dao;

import java.sql.Statement;

import com.vetias.Temperature.bin.Organation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrganationDao {
    public void createTable(Connection dbConnection) {
        try(Statement statement = dbConnection.createStatement()){

             statement.execute("""
                     create table organation(
                     id int AUTO_INCREMENT PRIMARY KEY,
                     NAME VARCHAR(100),
                     WEBSITE VARCHAR(100),
                     EMALI VARCHAR(100),
                     CONTACT_NUMBER VARCHAR(100),
                     REGISTRATION_NO INT)
                         
                    """);

    }catch(SQLException sqlException){
         System.out.println("error creating table:"+ sqlException);
     }
}

public int save (Connection dbConnection,Organation vet){

    try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            insert into organation, website, email, contact_number,
            registration_no, description) values(?,?,?,?,?,?)
            """)) {
                preparedStatement.setString(1, vet.name());
                preparedStatement.setString(2, vet.website());
                preparedStatement.setString(3, vet.email());
                preparedStatement.setString(4, vet.contactNumber());
                preparedStatement.setLong(5,   vet.registrationNumber());
                preparedStatement.setString(6, vet.description());
                preparedStatement.executeUpdate();
            }catch(SQLException sqlException){
                System.out.println("Error inserting into table :"+ sqlException);
            }
            return 0;
}
}



    

        // JdbcDataSource h2DataSource = new JdbcDataSource();
        // h2dDataSource.setUrl("jdbc:h2:tempdataD8");
        // h2dDataSource.setUser("sa");
    //     try {

    //         Class.forName("org.h2.Driver");
    //     }catch (ClassNotFoundException e){
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
            
    //     }
    //     try(Connection dbConnection = DriverManager.getConnection("jdbc:h2:men:temperaturedataDB","sa","1234")
        
    //         Statement statement = dbConnection.createStatement();){
    //             statement.execute("""
    //                     create table organation(
    //                     id int AUTO_INCREMENT PRIMARY KEY,
    //                     NAME VARCHAR(100),
    //                     WEBSITE VARCHAR(100),
    //                     EMALI VARCHAR(100),
    //                     CONTACT_NUMBER VARCHAR(100),
    //                     REGISTRATION_NO INT)
    //                     """);

    // }catch(SQLException e){
    //     System.out.println("error creating table:"+ e.getMessage());
    // }



