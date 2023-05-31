public class Player
{
    // These are the lengths of all of the ships.
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private static final int NUM_SHIPS = 5;

    // Direction constants
    private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;
    
    
    private Grid myGrid;
    private Grid guessGrid;
    private Ship[] myShips;
    private int numShipsPlaced;
    
    public Player()
    {
        myGrid = new Grid();
        guessGrid = new Grid();
        myShips = new Ship[NUM_SHIPS];
        numShipsPlaced = 0;
    }
    
    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        System.out.println("ChooseShipLocation: ship=" + s + ", (row, col) =(" + row + ", " + col + ") and dir =" + direction);
        s.setLocation(row, col);
        s.setDirection(direction);
        myGrid.addShip(s);
        
    }

    public void addShip(Ship s)
    {
        if (numShipsPlaced < NUM_SHIPS)
        {
            myGrid.addShip(s);
            myShips[numShipsPlaced] = s;
            numShipsPlaced++;
        }
    }

    public void markGuess(int row, int col, boolean val)
    {
        guessGrid.setShip(row, col, val);
        if(val)
        {
            guessGrid.markHit(row, col);
        }
        else
        {
            guessGrid.markMiss(row, col);
        }
    }

    /*
     * Takes in an oppnent guess for a row, col location.
     * Records the guess, and returns a boolean indicating
     * whether the guess was a hit.
     */
    public boolean recordOpponentGuess(int row, int col)
    {
        if(myGrid.hasShip(row, col))
        {
            myGrid.markHit(row, col);
        }
        else
        {
            myGrid.markMiss(row, col);
        }
        return myGrid.hasShip(row, col);
    }


    public void printMyShips()
    {
        myGrid.printShips();
    }
    
    public void printOpponentGuesses()
    {
        myGrid.printStatus();
    }
    
    public void printMyGuesses()
    {
        guessGrid.printStatus();
    }

}
