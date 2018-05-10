/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursogaudykle;

import Calculations.KursoPokytis;
import GET_HTML_XML.GetXMLbyHTML;
import GET_HTML_XML.ReadXML;
import UserSide.UserActions;
import UserSide.UserInitialInputs;
import ValiutosKursas.ValiutosKursas;
import java.util.ArrayList;



public class KursoGaudykle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<ValiutosKursas> valiutosKursaiList; 
        
        UserSide.UserInitialInputs pradiniaiNustatymai = new UserInitialInputs();
        //pradiniaiNustatymai.defaultInputs();
        pradiniaiNustatymai.askingForInitialInputs();
        
        GET_HTML_XML.GetXMLbyHTML gautiXML;
        gautiXML = new GetXMLbyHTML(
                pradiniaiNustatymai.getTp(),
                pradiniaiNustatymai.getCcy(),
                pradiniaiNustatymai.getDtFrom(),
                pradiniaiNustatymai.getDtTo()
        );
        gautiXML.startConnection();
        
        GET_HTML_XML.ReadXML skaitytiXML = new ReadXML();
        skaitytiXML.readFromConnection(gautiXML.getConnection());
        skaitytiXML.makeDocumentFromXML();
        valiutosKursaiList = skaitytiXML.parseXML();
        
        UserSide.UserActions userActions = new UserActions(valiutosKursaiList);
        userActions.userActions();
        
    }
    
    
    
    
}
