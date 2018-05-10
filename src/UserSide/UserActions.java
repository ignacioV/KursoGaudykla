/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSide;

import Calculations.KursoPokytis;
import ValiutosKursas.ValiutosKursas;
import java.util.ArrayList;
import java.util.Scanner;


public class UserActions {
    
    ArrayList<ValiutosKursas> valiutosKursaiList;
    KursoPokytis kursoPokytis;
    
    
    
    public UserActions(ArrayList<ValiutosKursas> valiutosKursaiList) {
        this.valiutosKursaiList = valiutosKursaiList;
        
    }
    public void userActions(){
        
        
        try {
            
            System.out.println("Ka norite daryti toliau?");
        System.out.println("Perziureti visus nuskaiciuotus valiutos kursus ir datas - spauskite 1");
        System.out.println("Perziureti nuskaiciuoto kurso pokyti jusu nurodytame laikotarpije - spauskite 2");
        System.out.println("Baigti programa- spauskite 3");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            
        switch(input) {
            case 1 :
               dislpayAll();
               break; 

            case 2 :
                dislpayDelta();
               
               break; 
            case 3 :
                System.err.println("Programa baigia darba...");
                scanner.close();
                System.exit(0);
                break;
            
            default : 
               System.err.println("Netinkamas pasirinkimas. Bandykite dar karta");
               
               
        }
        
        } catch (Exception e) {
            System.out.println("Bad user input UserActions " + e);
        }
        userActions();
        
                
    }
    
    private void dislpayAll(){
        for (ValiutosKursas valiutosKursas : this.valiutosKursaiList) {
            valiutosKursas.info();
        }
    }
    private void dislpayDelta(){
        this.kursoPokytis = new KursoPokytis(valiutosKursaiList);
        System.out.println("pokytis = "+this.kursoPokytis.getDelta());
        System.out.println("");
    }
    
    
}
