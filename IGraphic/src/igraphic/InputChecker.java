/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igraphic;

/**
 *
 * @author aBSi
 */
public class InputChecker {
    
    public void checker(javax.swing.JTextField a, String b){
        
        
        String setter = a.getText();
        
        switch(b){
        case "1":
       
        setter += b;
        a.setText(setter);
        break;
        case "2":
        setter += b;
        a.setText(setter);
        break;
        case "3":
        setter += b;
        a.setText(setter);
        break;
        case "4":
        setter += b;
        a.setText(setter);
        break;
        case "5":
        setter += b;
        a.setText(setter);
        break;
        case "6":
        setter += b;
        a.setText(setter);
        break;
        case "7":
        setter += b;
        a.setText(setter);
        break;
        case "8":
        setter += b;
        a.setText(setter);
        break;
        case "9":
        setter += b;
        a.setText(setter);
        break;
        case "0":
        setter += b;
        a.setText(setter);
        break;
        case "+":
        // cette ligne s'assure que l'on ne saisisse 2 operateurs de suite.
        if(!setter.contains("/") && !setter.contains("+") && !setter.contains("-") && !setter.contains("*")&& !setter.equals(""))
        setter += " + ";
        a.setText(setter);
        break;
        case "-":
         if(!setter.contains("/") && !setter.contains("+") && !setter.contains("-") && !setter.contains("*")&& !setter.equals(""))
        setter += " - ";
        a.setText(setter);
        break;
        case "x":
         if(!setter.contains("/") && !setter.contains("+") && !setter.contains("-") && !setter.contains("*")&& !setter.equals(""))
        setter += " * ";
        a.setText(setter);
        break;
        case "*":
        if(!setter.contains("/") && !setter.contains("+") && !setter.contains("-") && !setter.contains("*")&& !setter.equals(""))
        setter += " * ";
        a.setText(setter);
        break;
         case "/":
         if(!setter.contains("/") && !setter.contains("+") && !setter.contains("-") && !setter.contains("*")&& !setter.equals(""))
        setter += " / ";
        a.setText(setter);
        break;
         case ".":
         if(!setter.endsWith("/") && !setter.endsWith("+") && !setter.endsWith("-")&& !setter.endsWith(".") && !setter.endsWith("*")&& !setter.equals(""))
        setter += b;
        a.setText(setter);
        break;
       
    }
        
    }
    
  
    
}
