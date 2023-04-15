package minigame;

import java.util.ArrayList;
import java.util.Random;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class timberdog extends MainClass  {
	protected int score = 0;
	JLabel backgroundImageLabel,dog;
	protected Pane root;
	private Text text = new Text();
	protected int wood1X, wood1Y = 100, wood2X, wood2Y = 250;
	protected final int woodLeftX = -17,  woodRightX = 519;
	protected int dogX=0;
	protected final int dogLeftX=20, dogRightX=680;
	protected final int dogY=450;
	public ImageView woodview = new ImageView(new Image("/minigame/media/wood.png"));
	public ImageView wood2view = new ImageView(new Image("/minigame/media/wood.png"));
	public ArrayList<Integer> scores = new ArrayList<>();
  
	public Parent TimberdogContent() {
		root = new Pane();
		root.setPrefSize(root_width, root_height);
		
//Image
		ImageView dogview = new ImageView(new Image("/minigame/media/dogLeft.png"));
		setSize(dogview, 200, 180);
		setPosition(dogview, dogLeftX, dogY);
      
		ImageView boneview = new ImageView(new Image("/minigame/media/bone.png"));
		setSize(boneview, 400, 880);
		setPosition(boneview, 250, -100);
	  
		ImageView doblackgroundview = new ImageView(new Image("/minigame/media/background.jpg"));
		doblackgroundview.setFitWidth(root_width);
		doblackgroundview.setFitHeight(root_height);
		
		setSize(woodview, 400, 150);
		setSize(wood2view, 400, 150);
	  
//Text
		operationTip(text);
	  
//Button
		Button goBackButton = new Button();
		setGoBackButton(goBackButton);
	
//
		root.getChildren().addAll(doblackgroundview, boneview, goBackButton, dogview, text);
		root.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.A) {
				dogview.setImage(new Image("/minigame/media/dogLeft.png"));
				dogX = dogLeftX;
			} else if (event.getCode() == KeyCode.D) {
				dogview.setImage(new Image("/minigame/media/dogright.png"));
				dogX = dogRightX;
			}
			dogview.setX(dogX);
			dogview.setY(dogY);
			UpdateGame();
			text.setVisible(false);
		});
		StartGame();
		return root; 
	}

	public void StartGame() {
		spawnBranches();
		score = 0;
	}

	public void spawnBranches() {
		  Random rng = new Random();
		  int random = rng.nextInt(2);
		  if (random == 0) {
			  wood1X = woodLeftX;
		  } else if (random == 1) {
			  wood1X = woodRightX;
		  }
		  setPosition(woodview, wood1X, wood1Y);
		  setPosition(wood2view, wood1X, wood1Y);
		  root.getChildren().addAll(woodview, wood2view);  
	}		

	  public void GameOver() {
	        JOptionPane.showMessageDialog(null,"Score: " + (score - 1));
	        score = 0;
	    }
	  
	  public void UpdateGame(){
		  if((dogX == dogLeftX  && wood2X == woodLeftX) || (dogX == dogRightX  && wood2X == woodRightX)){
			  GameOver();
		  }
		  score++;
		  Random random = new Random();
	      int num = random.nextInt(2);
	      wood2X = wood1X;
	      if(num == 0){
	    	  wood1X = woodLeftX;
	      } else {
	    	  wood1X = woodRightX;
	      }
	      setPosition(woodview, wood1X, wood1Y);
	      setPosition(wood2view, wood2X, wood2Y);
	  }
		
}