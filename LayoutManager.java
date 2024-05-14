package MAIN_NOTES;
//---------------------------------CARD LAYOUT ----------------------------
import javax.swing.*;
import java.awt.*;
public class LayoutManager{
    public static void main(String[] args) {
        
        // JFrame j1=new JFrame(new CardLayout());
        // j1.setBounds(0,0,600,1000);
        // Panel p1=new Panel();
        // j1.add(p1,"obj1");

        System.out.println("Hello world!");


        // j1.setVisible(true);
    }
}

//----------------------------------BORDER LAYOUT--------------------------

// import  javax.swing.*;
// import  java.awt.*;
// public class M{
//     public static void main(String [] args){
//         //step-1 make a frame using JFrame
//         JFrame j1= new JFrame("Layout Manager Program");
//         j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         j1.setLayout(new BorderLayout());
//         j1.setBounds(0,0,600,1000);
        
//         JButton b1= new JButton("Button-1");
//         JButton b2= new JButton("Button-2");
//         JButton b3= new JButton("Button-3");
//         JButton b4= new JButton("Button-4");
//         JButton b5= new JButton("Button-5");
//         j1.add(b1,BorderLayout.EAST);
//         j1.add(b2,BorderLayout.WEST);
//         j1.add(b3,BorderLayout.NORTH);
//         j1.add(b4,BorderLayout.SOUTH);
//         j1.add(b5,BorderLayout.CENTER);
//         j1.setVisible(true);
//     }
// }




// //-------------------GRID LAYOUT----------------------------------------------
// import javax.swing.*;
// import java.awt.*;
// public class M{
//     public static void main(String[] args) {
//         JFrame j1=new JFrame("Grid Layout");
//         j1.setBounds(0,0,800,1000);
//         int n=4;
//         j1.setLayout(new GridLayout(n,n));
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 j1.add(new Button("" +j));
//             }
//         }

//         j1.setVisible(true);
        
//     }
// }
// import javax.swing.*;
// import java.awt.*;

// public class M {
//     public static void main(String[] args) {
//         JFrame f1 = new JFrame("Border Layout");
//         f1.setBounds(300, 200, 500, 200);
//         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         f1.setLayout(new BorderLayout()); // Set BorderLayout for the frame

//         JButton b1 = new JButton("Page_Start");
//         JButton b2 = new JButton("Page_End");
//         JButton b3 = new JButton("Line_Start");
//         JButton b4 = new JButton("Center");
//         JButton b5 = new JButton("Line_end");

//         f1.add(b1, BorderLayout.PAGE_START); // Add b1 to the top
//         f1.add(b2, BorderLayout.PAGE_END); // Add b2 to the bottom
//         f1.add(b3, BorderLayout.LINE_START); // Add b3 to the left
//         f1.add(b4, BorderLayout.CENTER); // Add b4 to the center
//         f1.add(b5, BorderLayout.LINE_END); // Add b5 to the right

//         f1.setVisible(true);
//     }
// }
