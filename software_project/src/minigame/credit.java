package minigame;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class credit extends MainClass{
	
	private Pane root;

	
	public Parent CreateContent() {
		root = new Pane();
		root.setPrefSize(900, 800);
		Label nameList = new Label("Vu Che Fei P2104712 \nIam Chon Kit P2104443 \nKuan Wing Yu P2104220 \nCheong Wai Lam P2104766");
		nameList.setAlignment(Pos.BASELINE_CENTER);
		nameList.getStyleClass().add("name");
		setPosition(nameList, 50, 300);
		
		Button goBackButton = new Button();
		setGoBackButton(goBackButton);
		root.getStylesheets().add(getClass().getResource("minigame.css").toExternalForm());
		root.getChildren().addAll(nameList, goBackButton);
		
		return root;
	}
	
	
}
