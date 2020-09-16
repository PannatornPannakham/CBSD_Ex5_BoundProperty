/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundtest;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BoundTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        JVC mys = new JVC();
        Listener1 l1 = new Listener1();
        Listener2 l2 = new Listener2();
        mys.addPropertyChangeListener(l1);
        mys.addPropertyChangeListener(l2);
        
        while(true){
            System.out.print("Enter Score ");
            String  cost = sc.nextLine();
            
            if(cost.equals(""))
                break;
            else
                mys.setValue(cost);
        }
    
    }
    
}
