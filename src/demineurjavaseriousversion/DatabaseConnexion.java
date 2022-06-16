/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class DatabaseConnexion {
    //Connexion à la base de données
    public static Connection getInstance() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        Properties properties = new Properties();
        try(FileInputStream fichierConfig = new FileInputStream("config.properties")){
            properties.load(fichierConfig);
        }
        String url = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.login");
        String password = properties.getProperty("jdbc.password");
        String driverClass = properties.getProperty("jdbc.driver.class");
        System.out.println(driverClass);
        Class.forName(properties.getProperty("jdbc.driver.class"));
        
        return DriverManager.getConnection(url, user, password);
    }
}
