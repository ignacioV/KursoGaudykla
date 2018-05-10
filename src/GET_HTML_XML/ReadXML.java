/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GET_HTML_XML;

import ValiutosKursas.ValiutosKursas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ReadXML {
    
    
    StringBuffer response = new StringBuffer();
    Document doc;
    public ReadXML() {
        
    }
    
    public void readFromConnection(HttpURLConnection connection){
        try {
            BufferedReader in = new  BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            String inputLine;
            
            while ((inputLine = in.readLine()) != null) {
                this.response.append(inputLine);
                
            }
            in.close();
        } catch (IOException e) {
            System.err.println("Error at readFromConnection ReadXML : " +e);
        }
        
    }
    public void makeDocumentFromXML(){
        try {
            this.doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
            .parse(new InputSource(new StringReader(this.response.toString())));
         
        } catch (Exception e) {
        }
    }
    public ArrayList<ValiutosKursas> parseXML(){
        ArrayList<ValiutosKursas> tempList = new ArrayList<ValiutosKursas>();
        NodeList Nodes = doc.getElementsByTagName("FxRate");
        if (Nodes.getLength() > 0) {
            for (int temp = 0; temp < Nodes.getLength(); temp++){
                Element element = (Element)Nodes.item(temp);
                
                tempList.add(new ValiutosKursas(
                        element.getElementsByTagName("Tp").item(0).getTextContent(),
                        element.getElementsByTagName("Dt").item(0).getTextContent(),
                        element.getElementsByTagName("Ccy").item(0).getTextContent(),
                        Float.valueOf(element.getElementsByTagName("Amt").item(0).getTextContent()),
                        element.getElementsByTagName("Ccy").item(1).getTextContent(),
                        Float.valueOf(element.getElementsByTagName("Amt").item(1).getTextContent())
                ));
            }
          System.err.println("viskas pavyko!");
	} else { 
		    System.out.println("nepavyko paversti XML i ArrayList  ReadXML");
         }
        
        return tempList;
    }

    public Document getDoc() {
        return doc;
    }

    
    
    
    
}
