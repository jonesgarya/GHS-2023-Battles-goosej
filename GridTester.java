public class GridTester extends ConsoleProgram
{
    public void run()
    {
        // This code tests out the methods of the Grid class

        // Create vertical ship of length 3 at location (D, 4)        
        Grid grid = new Grid();
        Ship s1 = new Ship(3);
        
        s1.setLocation(3, 3);
        s1.setDirection(1);
        grid.addShip(s1);
        
        // Create hosrizontal ship of length 5 at location (H, 6)        
        Ship s2 = new Ship(5);
        
        s2.setLocation(7, 5);
        s2.setDirection(0);
        grid.addShip(s2);

        grid.printShips();
    }
}
