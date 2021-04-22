   //************************************************************************** 
   //        StairsPanel.java             Author: Eric Lavoie  #100122593
   //   creates a panel for stairs and asks the user  how many steps they want
   // in the staircase and generates the steps.
   //**************************************************************************
   import java.awt.*;
   import javax.swing.*;
   import java.util.Scanner;
   
   public class StairsPanel extends JPanel
   {
   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   // creates an integer that will be used for the user input
   private final int number;
   
   public StairsPanel()
   { 
   //asks the user to input a positive integer and closes 6
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a positive integer: ");
   number=input.nextInt();
   input.close();
     
    //creates the dimensions of the black panel 
    setBackground (Color.black);
    setPreferredSize (new Dimension(300, 300)); 
   }
   
     //creates the graphics components of the panel
     public void paintComponent (Graphics page)
     { 
      // need this to make the panel black for some reason
      super.paintComponent(page);
      //intialies the variales as integers
      int x,y,xspacing,yspacing;
      //sets x equal to 0
      x=0;
      //takes the reverse height value of the panel
      y= getHeight()-1;
      //gets the  height and width  devided by the amount of steps wanted
      xspacing = (getWidth()/number);
      yspacing = (getHeight()/number);
    
    //makes the following graphics white
    page.setColor (Color.white);
    // starts a loop for each desired step  
    for( int i = 0; i < number; ++ i ) 
    {   
    //drawLine(int x1, int y1, int x2, int y2)
    //horizontal
    //starts the line at the origin of x,y to the origin of x and subracting 
    //from the y value giving the hieght gaps
    page.drawLine(x, y ,x, y - yspacing);
    //vertical
    //starts the line at the origin of x and y - the wanted spacing of the 
    //stairsand ends it  at the origin of x +the desires width spacing
    //and y - the disered vertical spancing
    page.drawLine(x, y - yspacing,x + xspacing,y- yspacing);
    
    // moves the origin of x and y for every needed step
    x = x + xspacing;
    y = y - yspacing;
    }
    
     }
   }