/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudecard.connectpacket;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author kevin
 */
public class Connect {
    public Connection conexao;
    public String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public String server= "saudecard.database.windows.net";
    public String port= "1433";
    public String database= "SaudeCARD_DB";
    public String usuario= "appRUN";
    public String senha= "Voyage@#!";
    public String caminho= "jdbc:sqlserver://" + server+ ":"+ port+ ";databaseName=" + database;
    public Statement stmt;
    public ResultSet rs;
    
    public Connect(){
        try{
            System.setProperty("jdbc.Drivers", driver);
            conexao= DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Conectado com sucesso!");
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
    }
}
