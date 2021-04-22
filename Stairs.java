   //************************************************************************** 
   //        Stairs.java             Author: Eric Lavoie  #100122593
   //   Runs stairs panel and asks the user to input their desired amount of 
   // steps and creates a stair case
   //**************************************************************************
   import javax.swing.JFrame;

   public class Stairs
   {
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
     JFrame frame = new JFrame("Stairs");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     StairsPanel panel = new StairsPanel();  
     frame.getContentPane().add(panel);
     
     frame.pack();
     frame.setVisible(true);
    }
   }