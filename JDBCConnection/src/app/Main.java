package app;
import java.sql.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws Exception {
        try {
            DriverManager.registerDriver ( new org.postgresql.Driver() ) ;
        } catch (Exception cnfe){
            System.out.println("Class not found");
            }

        Connection con = DriverManager.getConnection("jdbc:postgresql://comp421.cs.mcgill.ca:5432/cs421", "cs421g38", "dataBASED");

        Statement my = con.createStatement();

        ResultSet myRs = my.executeQuery("SELECT * FROM Person");

        while (myRs.next()) {
                System.out.println(myRs.getString("pid"));
        }


    }
}

