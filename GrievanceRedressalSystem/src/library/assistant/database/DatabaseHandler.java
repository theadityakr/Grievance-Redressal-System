/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assistant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author thead
 */
public class DatabaseHandler {
    
    private static DatabaseHandler handler = null;

    private static final String DB_URL = "jdbc:derby:database;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    
    
    public DatabaseHandler() {
        createConnection();
        loginTable();
        public_loginTable();
        grievance_Table();
        reply_Table();
        response();
        threat_Table();
        against_Table();
        social_cause_Table();
        user_groups_Table();
        ngo_groups_Table();
        user_chat_Table();
        ngo_chat_Table();
        temp();
       
    }
    
        private static void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_URL);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cant load database", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
        
    
        
        
        
        
//*************CREATE TABLE  **********************************************************   
        
        
        
        
            void loginTable(){
            String TABLE_NAME="LOGIN";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("LOGIN Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Name char(30),\n"
                    + "     ID char(30) primary key,\n"
                    + "     Type char(30),\n"
                    + "     Email_ID char(200),\n"
                    + "     Password char(200),\n"
                    + "     Contact_Number char(13)"
                    + " )");
                
               DatabaseHandler databaseHandler= new DatabaseHandler();     
                    String name="Aditya";
                       String id="ADM00000";
                          String type="Admin";
                             String email="iit2019144@iiita.ac.in";
                                String pass="123";
                                   String cont="9839527933";
                    
                 String    query="INSERT INTO LOGIN VALUES("
                        + "'" + name + "',"
                        + "'" + id + "',"
                        + "'" + type + "',"
                        + "'" + email + "',"
                        + "'" + pass + "',"
                        + "'" + cont + "'"
                        + ")";
                       databaseHandler.execAction(query);
                
                
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
            
            
            
                        void public_loginTable(){
            String TABLE_NAME="PUBLIC_LOGIN";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("PUBLIC LOGIN Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Name char(30),\n"
                    + "     ID char(30) primary key,\n"
                    + "     Type char(30),\n"
                    + "     Email_ID char(200),\n"
                    + "     Password char(200),\n"
                    + "     Contact_Number char(13)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
            
                        
                       void grievance_Table(){
            String TABLE_NAME="GRIEVANCE";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("GRIEVANCE Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Grievance_ID char(30)  primary key,\n"
                    + "     Date char(30),\n"
                    + "     Subject char(200),\n"
                    + "     Name char(30),\n"
                    + "     ID char(30),\n"              
                    + "     Description char(250),\n"
                    + "     Status char(30)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
                                         void reply_Table(){
            String TABLE_NAME="REPLY_TABLE";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("REPLY_TABLE Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Grievance_ID char(30)  primary key,\n"
                    + "     Date char(30),\n"
                    + "     Subject char(200),\n"
                    + "     Name char(30),\n"
                    + "     ID char(30),\n"              
                    + "     Description char(250),\n"
                    + "     Status char(30)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
          
        
           
                       void response(){
            String TABLE_NAME="RESPONSE";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("RESPONSE Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Grievance_ID char(30)  primary key,\n"
                    + "     Date char(30),\n"
                    + "     Subject char(200),\n"
                    + "     Name char(30),\n"
                    + "     ID char(30),\n"              
                    + "     Description char(250),\n"
                    + "     Status char(30)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
                                  void threat_Table(){
            String TABLE_NAME="THREAT";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("THREAT Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Grievance_ID char(30)  primary key,\n"
                    + "     Date char(30),\n"
                    + "     Subject char(200),\n"
                    + "     Name char(30),\n"
                    + "     ID char(30),\n"              
                    + "     Description char(250),\n"
                    + "     Status char(30)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
                                  
                                       void against_Table(){
            String TABLE_NAME="AGAINST";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("AGAINST Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Grievance_ID char(30)  primary key,\n"
                    + "     Date char(30),\n"
                    + "     Subject char(200),\n"
                    + "     Name char(30),\n"
                    + "     ID char(30),\n"              
                    + "     Description char(250),\n"
                    + "     Status char(30)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
                                       
                                       
                                       
                                       
                                                                              void social_cause_Table(){
            String TABLE_NAME="SOCIAL_CAUSE";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("SOCIAL_CAUSE Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Date char(15) primary key,\n"
                    + "     Subject char(30),\n"
                    + "     ID char(30),\n"              
                    + "     Description char(250)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
                        
                                                                                              void user_groups_Table(){
            String TABLE_NAME="USER_GROUPS";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("USER_GROUPS Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     ID1 char(9) ,\n"
                    + "     Name char(20),\n"
                    + "     ID2 char(9),\n"              
                    + "     Name2 char(20)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }  
                                                                                              
                                                                                              
                                                                                              
                                                                                                void ngo_groups_Table(){
            String TABLE_NAME="NGO_GROUPS";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("NGO_GROUPS Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     ID1 char(9),\n"
                    + "     Name char(20),\n"
                    + "     ID2 char(9),\n"              
                    + "     Name2 char(20)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }    
                                                                                                
                                                                                                
                                                                                                
                  void user_chat_Table(){
            String TABLE_NAME="USER_CHAT";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("USER_CHAT Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     ID char(9) ,\n"
                    + "     Name char(20),\n"
                    + "     Date char(30),\n"              
                    + "     Text char(250)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        } 
              
                  
                  
                  
                                void ngo_chat_Table(){
            String TABLE_NAME="NGO_CHAT";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("NGO_CHAT Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     ID char(9) ,\n"
                    + "     Name char(20),\n"
                    + "     Date char(30),\n"              
                    + "     Text char(250)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        } 
                            
                                
                                        void temp(){
            String TABLE_NAME="TEMP";
            
            try{
                stmt=conn.createStatement();
                DatabaseMetaData dbm =conn.getMetaData();
                
                ResultSet tables =dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
                if(tables.next()){
                    System.out.println("TEMP Exists");
                }
                else
                {
                    stmt.execute("CREATE TABLE "+ TABLE_NAME + "(" 
                    + "     Grievance_ID char(30)"
                    + " )");
                }
                }
            catch(SQLException e){
                System.err.println(e.getMessage() + " ..... setupDatabase");
            }   finally {
                
            }
        }
                                
           
//***********CREATE TABLE  **********************************************************   
   
    public ResultSet execQuery(String query) {
        ResultSet result;
        try {
            stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        }
        catch (SQLException ex) {
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return null;
        }
        finally {
        }
        return result;
    }

    public boolean execAction(String qu) {
        try {
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return false;
        }
        finally {
        }
    }
    
    
    
    
    
    
    
    
}
