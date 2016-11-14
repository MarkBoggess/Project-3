
/**
 * Write a description of class h here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.JFrame;


public class Board extends JFrame {


   //Initialise arrays to hold panels and images of the board

    private ChessLabel[] labels = new ChessLabel[] {

    // white
    new ChessLabel("\u2654"), new ChessLabel("\u2655"), new ChessLabel("\u2657"), 
    new ChessLabel("\u2658"), new ChessLabel("\u2656"), new ChessLabel("\u2659"),
    new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"), 
    new  ChessLabel("\u2659"), 
    // empty
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "),
    // black
    new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
    new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265C"), 
    new ChessLabel("\u265E"), new ChessLabel("\u265D"), new ChessLabel("\u265A"), 
    new ChessLabel("\u265B"),
    };

    public Board() 
    {

    } // Board()

    void display()
    {
        setTitle("Suicide Chess");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(5,5);

        contentPane.setLayout(gridLayout);

        int row = 1;
        for (int i = 0; i < 25 ; i++) 
        {
            if(i % 5 == 0)row++;
            labels[i].set(i, row);
            contentPane.add(labels[i]);
        } // i

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
     } // display()

} // class Board
