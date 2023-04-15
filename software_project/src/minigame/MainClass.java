package minigame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	protected Scene homePage;
	final int root_width = 900;
	final int root_height = 800;

	public void CreateHomePage() {
	
//buttons
		Button dogButton = new Button();
		setButton(dogButton, new Image("/minigame/media/dog.JPG"), 250);
		setPosition(dogButton, 50, 300);
		dogButton.setOnAction(e1 -> {
		    timberdog timberdogList = new timberdog();
		    Stage window = (Stage) dogButton.getScene().getWindow();
		    window.setTitle("Timber-dog");
		    window.setScene(new Scene(timberdogList.TimberdogContent()));
		});

		Button chameleonButton = new Button();
		setButton(chameleonButton, new Image("/minigame/media/chameleon.JPG"), 250);
		setPosition(chameleonButton, 470, 300);
		chameleonButton.setOnAction(e4 -> {
			Pin_Ball pinball = new Pin_Ball();
			Stage window = (Stage) chameleonButton.getScene().getWindow();
			window.setTitle("Pinball-chameleon");
			window.setScene(new Scene(pinball.PinBallContent()));
		});	
		
		Button creditButton = new Button();
		setButton(creditButton, new Image("/minigame/media/monkey.png"), 50);
		setPosition(creditButton, 10, 10);
		creditButton.setOnAction(e -> {
			credit creditList = new credit();
			Stage window = (Stage) creditButton.getScene().getWindow();
			window.setTitle("Credit");
			window.setScene(new Scene(creditList.CreateContent()));
		});
		
//images
		Image logo= new Image("/minigame/media/animals_party.png");
		ImageView logoView=new ImageView(logo);
		logoView.setFitHeight(300);
		logoView.setPreserveRatio(true);
		logoView.setTranslateX(225);
		
//labels
	    Label timberDogText = new Label("Timber-dog");
	    setPosition(timberDogText, 150, 570);
	    timberDogText.getStyleClass().add("TimberDog");
	   
	    Label pinballText = new Label("Pinball-chameleon");
	    setPosition(pinballText, 510, 570);
	    pinballText.getStyleClass().add("Pinball");
	   
	    Label creditText = new Label("Credit");
	    setPosition(creditText, 25, 70);
	    creditText.getStyleClass().add("credit");

//
		Group root = new Group(dogButton, chameleonButton, creditButton, timberDogText, pinballText, creditText, logoView);
		
		homePage=new Scene(root, root_width, root_height, Color.AZURE);
		homePage.getStylesheets().add(getClass().getResource("minigame.css").toExternalForm());
		
	}
	
	public void setButton(Button button, Image image, int height) {
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(height);
		imageView.setPreserveRatio(true);
	    button.setGraphic(imageView);
	}
	
	public static void setPosition(Control item, int x, int y) {
		item.setTranslateX(x);
		item.setTranslateY(y);
	}
	
	public static void setPosition(ImageView item, int x, int y) {
		item.setX(x);
		item.setY(y);
	}
	
	public static void setSize(ImageView view, int width, int height) {
		view.setFitWidth(width);
		view.setFitHeight(height);
	}
	
	public void operationTip(Text text) {
		text.setFont(Font.font("Arial", 40));
		text.setFill(Color.BLACK);
		text.setX(120);
		text.setY(780);
		text.setText("press A and D to move left and right");
	}
	
	public void setGoBackButton(Button button) {
		setButton(button, new Image("/minigame/media/go_back.jpg"), 50);
		setPosition(button, 10, 10);
		button.setOnAction(e -> {
			Stage window = (Stage) button.getScene().getWindow();
			window.setTitle("Animals party");
			CreateHomePage();
			window.setScene(homePage);
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {		
		stage.setTitle("Minigame");
		CreateHomePage();
		stage.setScene(homePage);
		stage.show();
	}
}