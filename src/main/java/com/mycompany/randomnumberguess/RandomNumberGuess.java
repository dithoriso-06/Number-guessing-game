/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberguess;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class RandomNumberGuess {

    public static void main(String[] args) {
     Random obj = new Random(); //instance of the Random class  
     int secretNumber = obj.nextInt(100)+ 1;
     int userGuess = 0;
     int attempts = 0;
     boolean won = false;
     
     while(attempts <3){
         userGuess = Integer.parseInt(
         JOptionPane.showInputDialog("hey! Guess a number between 1 and 100"));
        attempts++;
        
         if(userGuess > secretNumber){
             JOptionPane.showMessageDialog(null, "Your guess is too high");
         }else if(userGuess < secretNumber){
             JOptionPane.showMessageDialog(null, "Your guess is too low");
         }else {
             JOptionPane.showMessageDialog(null,"Congrats!! You got it in "+ attempts + "tries!!");
             won = true;
             break;
         }
     }
     if (!won){
         JOptionPane.showMessageDialog(null, "You lose! The number was " + secretNumber);
     }
    }
}
