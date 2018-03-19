package library.assistant.ui.addBook;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import library.assistant.database.DBAssistantClass;
import library.assistant.database.DBConnection;

public class AddBook {


DBAssistantClass dbAs = new DBAssistantClass();

	@FXML
	private AnchorPane root;
	
    @FXML
    private Button cancel;

    @FXML
    private TextField author;

    @FXML
    private TextField publisher;

    @FXML
    private TextField id;

    @FXML
    private TextField title;

    @FXML
    private Button saveButton;
    
    @FXML
    void save(ActionEvent event) {
    
    	String bookId = id.getText();
    	String bookTitle = title.getText();
    	String bookAuthor = author.getText();
    	String bookPublisher = publisher.getText();
    	
    	if(bookId.isEmpty() || bookTitle.isEmpty() || bookAuthor.isEmpty() || bookPublisher.isEmpty()){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setContentText("Please Add All Field");
			alert.showAndWait();
			return;
	}
	
    	if(dbAs.execAction(bookId, bookTitle, bookAuthor, bookPublisher)){
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    		alert.setHeaderText(null);
    		alert.setContentText("Success");
    		alert.showAndWait();
    	}
    	else{
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setHeaderText(null);
    		alert.setContentText("Faileed");
    		alert.showAndWait();
    	}
    }
    	
    

    @FXML
    void cancel(ActionEvent event) {
    	 Stage stage = (Stage) root.getScene().getWindow();
    	 stage.close();
    }

}
