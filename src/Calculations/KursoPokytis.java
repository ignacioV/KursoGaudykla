/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import ValiutosKursas.ValiutosKursas;
import java.util.ArrayList;

public class KursoPokytis {
    
    ArrayList<ValiutosKursas> valiutosKursasList;
    Float delta;

    public KursoPokytis(ArrayList<ValiutosKursas> valiutosKursasList) {
        this.valiutosKursasList = valiutosKursasList;
        calculateDelta();
    }
    
    private void calculateDelta(){
        
        this.delta = this.valiutosKursasList.get(0).getKursasAntras() 
        - this.valiutosKursasList.get(this.valiutosKursasList.size()-1).getKursasAntras();
    }

    public Float getDelta() {
        return delta;
    }

    
    
    
    
}
