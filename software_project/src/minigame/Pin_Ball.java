package minigame;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Pin_Ball extends MainClass{
	private Pane root;
	private Text text = new Text();
	final int chameleonWidth = 300;
	private final int chameleonHeight = 135;
	private static int chameleonX = 280;
	private  static int chameleonY = 600;
	public static int score=0;
	public ArrayList<Integer> scores = new ArrayList<>();
	
	public Parent PinBallContent() {
		root = new Pane();
		root.setPrefSize(root_width, root_height);
		
		ImageView blackgroundview =new ImageView(new Image("/minigame/media/pinballback.jpg"));
		setSize(blackgroundview, root_width, root_height);
		
		Button goBackButton = new Button();
		setGoBackButton(goBackButton);
		
		ImageView chameleonview=new ImageView(new Image("/minigame/media/chameleonRight.png"));
		setSize(chameleonview, chameleonWidth, chameleonHeight);
		setPosition(chameleonview, chameleonX, chameleonY);
		
		operationTip(text);
	      
		root.setOnKeyPressed(event -> {
	          if (event.getCode() == KeyCode.A) {
	        	  chameleonview.setImage(new Image("/minigame/media/chameleonLeft.png"));
	        	  if (chameleonX != 0) {
	        		  chameleonX = chameleonX - 10;
	        	  }
	        	  chameleonview.setX(chameleonX);
	              }
	              
	           else if (event.getCode() == KeyCode.D) {
	        	   chameleonview.setImage(new Image("/minigame/media/chameleonRight.png"));
	        	   if (chameleonX != 600) {
	        		   chameleonX = chameleonX + 10;
		        	  }
	        	   chameleonview.setX(chameleonX);
	              }
	          text.setVisible(false);
		    });
		
		BallPane ballPane = new BallPane();
		score=0;
		ballPane.setOnMouseReleased(e-> ballPane.play());

		root.getChildren().addAll(blackgroundview, chameleonview, ballPane, goBackButton, text);
		
		
		return root;
	}
	
	public int getChameleonX() {
		return chameleonX;
	}
	
	public int getChameleonY() {
		return chameleonY;
	}
	
	 public void GameOver() {
		 JOptionPane.showMessageDialog(null,"Score: " + (score));
		 scores.add(score);
	}
}

