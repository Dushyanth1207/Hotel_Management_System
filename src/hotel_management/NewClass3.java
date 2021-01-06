/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author lohith
 */
public class NewClass3 {
    static void ling() throws MalformedURLException, IOException{
        System.out.print("hi");
        String phonenumber = NewJFrame6.pnxx();
        URL yahoo = new URL("http://185.136.166.131/domestic/sendsms/bulksms.php?username=lohith&password=lohithgubbihally&type=TEXT&sender=BHOTEL&mobile="+phonenumber+"&message=Check%20Out%20success%0ARoomNo%20:%20"+NewJFrame6.rnx+"%0AThankYou%20For%20Choosing%20Us.");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
    static void main(String[] args) throws MalformedURLException, IOException{
        System.out.print("Lohith the god");
        ling();
    }
    
}
