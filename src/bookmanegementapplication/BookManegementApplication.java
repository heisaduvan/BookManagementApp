package bookmanegementapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class BookManegementApplication {

    Connection con = null;
    Statement sta = null;
    PreparedStatement psta = null;

    
    Database db = new Database();
    
    public BookManegementApplication(){
        
        try {
            String url = "jdbc:mysql://" + db.host + ":" + db.port+ "/" + db.db_name+"?useUnicode=true&characterEncoding=UTF-8";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,db.id,db.password);
            System.out.println("Connection is success.");
            //JFrame j = new JFrame();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver couldn't run.");
                    
        } catch (SQLException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection error.");
        }
       
        
    }
    public void bookDelete(int id){
        String querry = "DELETE FROM books_database WHERE id = ?";
        try {
            psta = con.prepareStatement(querry);
            psta.setInt(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
    }
    public void bookUpdate(int id, String name,String author,String type, String publisher){
        
        try {
            String querry = "Update books_database SET book_name=?,book_writer=?,book_type=?,book_publisher=? WHERE id=?";
            psta = con.prepareStatement(querry);
            psta.setString(1, name);
            psta.setString(2, author);
            psta.setString(3, type);
            psta.setString(4, publisher);
            psta.setInt(5, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("HATA VAR!");
        }
    }   
    
    public boolean Login(String username, String password){
        
        try {
            String querry = "Select * from admin where id= ? and password= ?";
            psta = con.prepareStatement(querry);
            psta.setString(1,username);
            psta.setString(2, password);
            ResultSet result = psta.executeQuery();
            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public void bookAdd(String name, String author, String type, String publisher){
        
        try {
            String querry = "INSERT INTO books_database(book_name , book_writer,book_type,book_publisher) VALUES (?,?,?,?)";
            
            psta = con.prepareStatement(querry);
            psta.setString(1, name);
            psta.setString(2, author);
            psta.setString(3, type);
            psta.setString(4, publisher);
            psta.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public ArrayList<Book> bookCome(){
        
        try {
            ArrayList<Book> list = new ArrayList<>();
            String querry ="Select * from books_database";
            sta = con.createStatement();
            ResultSet result = sta.executeQuery(querry);
            
            while(result.next()){
                int id = result.getInt("id");
                String book_name = result.getString("book_name");
                String book_write = result.getString("book_writer");
                String book_type = result.getString("book_type");
                String book_publisher = result.getString("book_publisher");
                list.add(new Book(id,book_name,book_write,book_type,book_publisher));
            }
            
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(BookManegementApplication.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    public static void main(String[] args) {
        
        BookManegementApplication bma = new BookManegementApplication();
        
    }

}
