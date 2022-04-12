 import javax.swing.JFrame;

   public class Pong2 extends JFrame 
   
   { 
       private final static String WINDOW_TITLE = "Pong";
       private final static int WINDOW_WIDTH = 1280;
       private final static int WINDOW_HEIGHT = 720;


      public static void main(String[] args) 
      {  
    	     javax.swing.SwingUtilities.invokeLater(new Runnable()         
    	     {
    	           public void run()  
    	           {
    	                  new Pong2();
    	           }
    	     });
      }
    	       public Pong2() 
    	       
    	       {
    	              setTitle(WINDOW_TITLE);
    	              setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	              setResizable(false);
    	              add(new PongPanel2());
    	              setVisible(true);
    	              setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
 } 