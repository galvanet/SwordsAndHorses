/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import byui.cit260.swordsAndHorses.control.GameControl;
import byui.cit260.swordsAndHorses.model.SwordsAndHorses;
import java.util.Scanner;

/**
 *
 * @author andre_000
 */
public class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView() {
        
        this.menu = "\n"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n| Help Menu                              |"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nD - How to make a decision"
                  + "\nC - How combat works"
                  + "\nQ - Quit"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    
    
    

    public void displayHelpMenuView() {
        
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }   
            
            break;           
        }
        
        return value;
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "G":
                this.goalOfTheGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "D":
                this.howToDecide();
                break;
            case "C":
                this.howCombatWorks();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                        
        return false;
        
        
    }

    private void goalOfTheGame() {
        System.out.println("\n*** goalOfTheGame function called ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove function called ***");
    }

    private void howToDecide() {
        System.out.println("\n*** howToDecide function called ***");
    }

    private void howCombatWorks() {
        System.out.println("\n*** howCombatWorks function called ***");
    }

    


    
    
}
