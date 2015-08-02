package ls.controller.member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import ls.controller.utility.Utility;

public class SearchMemberController implements Initializable {
	@FXML
	private AnchorPane anchorPane;

	@FXML
	private Button btnSearch;
	@FXML
	private Button btnAddNew;

	public void searchMembers() {
		System.out.println("searchMembers");
	}

	public void goToEditMember() {
		System.out.println("goToEditMember");
	}

	@FXML
	public void goToAddMember() {		
		Utility.loadAddEditMemberView(anchorPane);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
