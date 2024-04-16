package com.example.projetjava;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database {
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet_java", "root", "");
            return connect;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void testBD(){
        // prototype getting data
        // data tools

        Connection connection ;
        PreparedStatement preparedStatement ;
        ResultSet rs ;
        try {
            //setting connection
            connection=database.connectDb();
            //requete
            String sql="select * from etudiant";
            preparedStatement=connection.prepareStatement(sql);
            rs= preparedStatement.executeQuery();
            // result is iterator
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
