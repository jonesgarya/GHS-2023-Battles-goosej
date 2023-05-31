public class PlayerTester extends ConsoleProgram
{
    public void run()
    {
        // This can be any code that tests out the methods of the Player class
        
        Player human = new Player();
        Player computer = new Player();
        
        human.chooseShipLocation(new Ship(2), 5, 7, 0);
        computer.chooseShipLocation(new Ship(5), 3, 5, 1);
        
        System.out.println("Print Human grids: Ship locations, My guesses, Opponent Guesses");
        human.printMyShips();
        human.printMyGuesses();
        human.printOpponentGuesses();
        
        System.out.println("Print Opponent grids: Ship locations, My guesses, Opponent Guesses");
        computer.printMyShips();
        computer.printMyGuesses();
        computer.printOpponentGuesses();
        
    }
}
