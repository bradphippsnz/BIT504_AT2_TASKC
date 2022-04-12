 import java.awt.Color;

   public class Ball2 extends Sprite2 
   
   { 
       private static final int BALL_WIDTH = 20;
       private static final int BALL_HEIGHT = 20;
       private static final Color BALL_COLOUR = Color.RED;

       public Ball2(int panelWidth, int panelHeight) 
       
       {
          setWidth(BALL_WIDTH);
          setHeight(BALL_HEIGHT);
          setColour(BALL_COLOUR);
          setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
          resetToInitialPosition();
      }
 }