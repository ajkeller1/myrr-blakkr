/*
 * View class for Main Menu end user story 
 */

package byui.cit260.myrrBlakkr.view;

import byui.cit260.myrrBlakkr.control.GameControl;
import myrrblakkr.MyrrBlakkr;

public class MainMenuView extends View {
    
    //private Player currentPlayer;

    public MainMenuView() {
        super("\n"
            + "\n-------------------------------------------------------------"
            + "\n|                         Main Menu                         |"
            + "\n-------------------------------------------------------------"
            + "\n| N -  Start new game                                       |"
            + "\n| H -  Help menu                                            |"
            + "\n| S -  Save game                                            |"
            + "\n| L -  Load saved game                                      |"
            + "\n| Q -  Quit game                                            |"
            + "\n-------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {        
        String value = (String) obj;        
        value = value.toUpperCase();        // convert to all upper case
        char selection = value.charAt(0);   // get first character entered        
        
        switch (selection) {
            case 'N':                       // create and start a new game            
                this.startNewGame();
                break;
            case 'H':                       // display the Help menu            
                this.displayHelpMenu();     
                break;
            case 'S':                       // save the game
                this.saveGame();
                break;
            case 'L':                       // load a saved game
                this.loadGame();            
                break;
            case 'Q':                       // quit the game
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {                                                    
        GameControl.createNewGame(MyrrBlakkr.getPlayer());      // create a new game
        GameMenuView gameMenu = new GameMenuView();             // create a new Game menu
        gameMenu.display();                                     // display the new Game menu
    }

    private void displayHelpMenu() {        
        HelpMenuView helpMenu = new HelpMenuView();             // create a new Help menu
        helpMenu.display();                                     // display the Help menu
    }

    private void saveGame() {
        GameControl.saveGame(MyrrBlakkr.getCurrentGame());      // save the game
        GameMenuView gameMenu = new GameMenuView();             // create a new Game menu
        gameMenu.display();                                     // display the Game menu        
    }

    private void loadGame() {
        System.out.println("*** loadGame function called ***");
    }
      
    
}
