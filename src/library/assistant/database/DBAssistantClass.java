package library.assistant.database;

import java.sql.*;

import javax.swing.JOptionPane;

public class DBAssistantClass {

	DBConnection db = new DBConnection();
	Connection conn = db.getConnection();
	Statement stmt;
	
	public ResultSet execQuery(String query) {
        ResultSet result;
        try {
          stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return null;
        } finally {
        }
        return result;
    }

    
    public boolean execAction(String bookId, String bookTitle, String bookAuthor, String bookPublisher) {
        
    	try{
    		String sql = "Insert into book(id, title, author, publisher, isAvail) values (?,?,?,?,1)";
    	    PreparedStatement pst = conn.prepareStatement(sql);
    		pst.setString(1, bookId);
    		pst.setString(2, bookTitle);
    		pst.setString(3, bookAuthor);
    		pst.setString(4, bookPublisher);
    		
    		
    		pst.executeUpdate();
    		return true;
    	}catch(Exception e){
    		
    		return false;
    	}
    	
    }
}
