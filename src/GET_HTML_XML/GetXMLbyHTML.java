/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GET_HTML_XML;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class GetXMLbyHTML {
    
    URL urlObject;
    HttpURLConnection connection;

    public GetXMLbyHTML(String tp, String ccy, String dtFrom, String dtTo) {
        
        String URLlink= "http://www.lb.lt/webservices/fxrates/FxRates.asmx/getFxRatesForCurrency?tp="+tp+"&ccy="+ccy+"&dtFrom="+dtFrom+"&dtTo="+dtTo+"";
        try {
            this.urlObject = new URL(URLlink);
        } catch (MalformedURLException e) {
            System.err.println("Error at creating obeject GetXMLbyName : " +e);
        }
        
    }
    
    public void startConnection(){
        try {
            this.connection = (HttpURLConnection) urlObject.openConnection();
            connection.setRequestMethod("GET");
            
            
            //System.err.println("Response code: " + connection.getResponseCode());
        } catch (IOException e) {
            System.err.println("Error at connecting to url GetXMLbyName: " +e);
        }
        
    }

    public URL getUrlObject() {
        return urlObject;
    }

    public HttpURLConnection getConnection() {
        return connection;
    }
    
    
    
    
    
}
