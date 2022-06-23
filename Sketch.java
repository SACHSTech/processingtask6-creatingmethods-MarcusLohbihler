import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(15, 235, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    sun(69);
    house(0);
    house(100);
    house(200);
    int centredRect = centreX(200, 80);
    rect(centredRect, 0, 80, 30);

    
  }
  
  // define other methods down here.
  //method to draw house 
  private void house(int position){
    //draws house to screen
    //grass
    fill(0, 175, 0);
    rect(0, 325, 400, 75);
    
    //base
    fill(255, 255, 0);
    rect((100/2) + position, 225, 200/2, 200/2);
    
    //roof
    fill(255, 0, 0);
    triangle((100/2) + position, 225, (300/2) + position, 225, (200/2) + position, 185);

    //door
    fill(166, 99, 0);
    rect((175/2) + position, 275, 50/2, 100/2);

    fill(255);
    ellipse((190/2) + position, 300, 10/2, 10/2);

    //window
    fill(150, 150, 255);
    ellipse((200/2) + position, 250, 62/2, 62/2);
    
    stroke(0);
    line((170/2) + position, 250, (230/2) + position, 250);

    stroke(0);
    line((200/2) + position, 235, (200/2) + position, 265);
  }

  private void sun(double x){
    //sun moves left or right based on value of x, if x is greater than 2, the sun becomes the moon and the background turns dark, otherwise it appears to be day
    if(x > 2){
      background(0);
      fill(255, 252, 224);
      ellipse((float) (width / x), (float) (height/8), (float) (width/4), (float) (height/4));
    } else {
      fill(255, 240, 105);
    ellipse((float) (width / x), (float) (height/8), (float) (width/4), (float) (height/4));
    }
  }

  private int centreX(int x, int width){
  //given the middle of the screen, find out the x-value where the rectangle will appear to be centred on the screen
    return(x - width/2);
  }
}