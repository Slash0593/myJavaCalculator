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
public class Solver {
    public void resolve(javax.swing.JTextField a){
        String collector = a.getText();
        String tab[] = collector.split(" ");
        
        Double tab2, tab3, result=0.0;
        char op;
        
        tab2 = Double.valueOf(tab[0]);
        tab3 = Double.valueOf(tab[2]);
        op = tab[1].charAt(0);
        switch(op){
        case '+' :
            result = tab2+tab3;
        break;
        case '-':
            result = tab2-tab3;
        break;
        case '*':
            result = tab2*tab3;
        break;
        case 'x':
            result = tab2*tab3;
        break;
         case '/':
             result = tab2/tab3;
        break;
        }
        String disp ="";
        int k;
        if(result%2==0 || String.valueOf(result).endsWith("0")){
            
           disp = disp.valueOf(result);
            disp = disp.substring(0, disp.length()-2);
            a.requestFocus();
       
        }else{
        disp = disp.valueOf(result);
        a.requestFocus();
        }

        //JOptionPane.showMessageDialog(this, disp);
        a.setText(disp);
    }
}
