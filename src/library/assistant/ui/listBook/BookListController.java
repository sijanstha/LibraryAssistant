package library.assistant.ui.listBook;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class BookListController {

    @FXML
    private TableColumn<?, ?> availiabilityColumn;

    @FXML
    private TableColumn<?, ?> titleColumn;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableColumn<?, ?> authorColumn;

    @FXML
    private TableColumn<?, ?> publisherColumn;

    @FXML
    private TableColumn<?, ?> idColumn;

    class Book{
    	private SimpleStringProperty title;
    	private SimpleStringProperty id;
    	private SimpleStringProperty author;
    	private SimpleStringProperty publisher;
    	private SimpleBooleanProperty availiability;
    	
    	public Book(String title, String id, String author, String publisher, Boolean avail){
    		this.title = new SimpleStringProperty(title);
    		this.id = new SimpleStringProperty(id);
    		this.author = new SimpleStringProperty(author);
    		this.publisher = new SimpleStringProperty(publisher);
    		this.availiability = new SimpleBooleanProperty(avail);
    		
    	}
    	
    }
}
