import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseMaker {
	Robot r = new Robot();
	
public void leftCorner() {
	r.moveTo(60, 860);
}
public void makeHouse(int height) {
	r.penDown();
	r.setSpeed(10);
	r.move(height);
	r.turn(90);
	if(height == 250) {
	drawPointyRoof();
	}
	else {
		drawFlatRoof();
	}
	r.move(height);
	r.turn(-90);
	r.setPenColor(Color.green);
	r.move(50);
	r.turn(-90);
	
}
public void makeHouse(String height) {
	if(height.equals("small")) {
		makeHouse(60);
		
	}
	else if(height.equals("medium")) {
		makeHouse(120);
	}
	else if(height.equals("large")) {
		makeHouse(250);
	}
	
}
public void makeHouseColor(String color) {
	if(color.equals("red")) {
		r.setPenColor(Color.red);
		makeHouse("small");
	}
	else if(color.equals("blue")) {
		r.setPenColor(Color.blue);
		makeHouse("medium");
	}
	else if(color.equals("yellow")){
			r.setPenColor(Color.yellow);
			makeHouse("large");
	}	
}

public void drawPointyRoof() {
	r.turn(-45);
	r.move(50);
	r.turn(90);
	r.move(50);
	r.turn(45);
	
}
public void drawFlatRoof() {
	
	r.move(50);
	r.turn(90);
	
}
}
