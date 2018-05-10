/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSide;

import java.util.Scanner;


public class UserInitialInputs {
    
    String tp;
    String ccy;
    String dtFrom;
    String dtTo;

    public UserInitialInputs() {
    }
    public void defaultInputs(){
        this.tp = "LT";
        this.ccy = "USD";
        this.dtFrom = "2018-05-02";
        this.dtTo = "2018-05-08";
    }
    public void askingForInitialInputs(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Valiutos gaudykla");
            System.out.println("Iveskite kurso tipa (LT arba EU)");
            this.tp = scanner.next();
            System.out.println("Iveskite valiuta, su kuria lyginsite (USD, RUB, NOK)");
            this.ccy = scanner.next();
            System.out.println("data NUO kada (pvz.:  2018-05-02  ) (ne anksciau nei 2014-12-31, euro ivedimo datos)");
            this.dtFrom = scanner.next();
            System.out.println("data IKI kada (pvz.:  2018-05-02  )");
            this.dtTo = scanner.next();
           
        }
        catch(Exception e){
            System.out.println("Bad user input UserInitialIntup " + e);
        }
        
        
    }

    public String getTp() {
        return tp;
    }

    public String getCcy() {
        return ccy;
    }

    public String getDtFrom() {
        return dtFrom;
    }

    public String getDtTo() {
        return dtTo;
    }
    
}
