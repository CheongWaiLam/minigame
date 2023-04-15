package minigame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

class BallPane extends Pane{
	public final double radius = 30;
	private double x=radius,y=radius;
	private double dx=18, dy=18;
	private Circle circle = new Circle(x,y,radius);
	public Timeline timeline;
	
	public BallPane() {
		circle.setFill(Color.WHITE);
		getChildren().add(circle);
		timeline = new Timeline(new KeyFrame(Duration.millis(50),e -> moveball()));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
	}

	public void play() {
		timeline.play();
	}
	
	private void moveball() {
		Pin_Ball pinball= new Pin_Ball();
		if (y > pinball.getChameleonY()-40 && (x+radius<pinball.getChameleonX() || x > pinball.getChameleonX() +pinball.chameleonWidth)) {
			timeline.pause();
			pinball.GameOver();
		} else {
			
			if (y<radius || y > pinball.getChameleonY()-40) {
				dy*=-1;
				if (y > pinball.getChameleonY()-40) {
					Pin_Ball.score++;
				}
			}
		}
		if (x<radius || x > pinball.root_width-radius) {
				dx*=-1;
			}
		x+=dx;
		y+=dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
		}
		
}
