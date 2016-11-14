/**
 * AI to play chess, probably.
 *
 * @author Nick Zarilla, Mike Boggess
 * @version 11/13/16
 */
public class AI //implements Runnable
{

    public int priority;
    private int[][][] board; //First number: Piece number, left to right, front to back; 2nd number: x,3rd number: y.
    Private MoveTree moves = new MoveTree(60);

    public AI(int[][][] board)
    {
        this.board = board; // Get the board.
    }

    public void update(int[][][] board)
    {
        //aiThread.interrupt(); // Stop the AI...
        int[][][] tempBoard = this.board;
        this.board = board;
        while( tempBoard != board){

            //add crap here to redraw the board

            /*for ( MoveTree move : moves.possibleMoves){
                if ([[[move.coords[1]][move.coords[0]] == move.player){
                    moves = move;
                    break;
                }
            }*/
        }
    }

    public void populateTree()
    {
        int n = 0;
        int m = 0;
        Integer p1Moves = new Integer[][][];
        Integer p2Moves = new Integer[][][];
        //move player's pieces into opponent's possible moves
        for (int j=0; j <= 10; j++);
            {
                for (int x = 0; x <= 5; x++)
                {
                    for (int y = 0; y <= 5; y++)
                    {
                        if (board[j][x][y]) = possibleMoves[j])
                        {
                            if (j <= 10)
                            {
                                p1Moves[n] = new Integer[j][x][y];
                                n++;
                            }
                            else if (j >10)
                            {
                                p2Moves[m] = new Integer[j][x][y];
                                m++;
                            }

                        }
                    }
                }
            }
        }
    }

    public Integer[][][] getMove()
    {
        //pulls a move from the tree.
        //First,check if you need to capture a piece; if so, do so, prioritizing low pieces
        //second, check if your pieces can move into one of their capture zones; if so, prioritize YOUR high value pieces
        //third, if neither of the above, possibly try to traverse the tree to force capture of your high value pieces
        //if not possible, make a random move?
        //if no moves possible, count number of pieces, game is over.
    }

    public void runAI(int player)
    {
        //run the ai, somehow.  for a chosen player?
    }

    public int getValue(int j);
    {
        if(j>5&&j< 16) { priority=1; }
        else if(j==1||j==20) { priority=5; }
        else if(j==2||j==19) { priority=3; }
        else if(j==3||j==18) { priority=4; }
        else if(j==4||j==17) { priority=2; }
        else if(j==5||j==16) { priority=9; }

        return priority;
        }




}
