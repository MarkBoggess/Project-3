
/**
 * Write a description of class ChessBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ChessLabel extends JLabel {
    Font font     = new Font("Ariel", Font.PLAIN, 24);
    Color bgLight = new Color(0, 191, 255);
    Color bgDark  = new Color(224, 255, 255);
    ChessLabel(String s)
    {
        super(s);
    }
    void set(int col, int row)
    {
      setFont(font);
          setOpaque(true);
          for (row = 0; row <= 5; row++)
          {
          if (col %2 == 0)
          {
              setBackground(bgDark);
          }
          else if (col %2 != 0)
          {
              setBackground(bgLight) ;   
          }
          setHorizontalAlignment( SwingConstants.CENTER );
    }
   }
}