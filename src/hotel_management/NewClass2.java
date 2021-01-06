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
public class NewClass2 {
    static void bookphonecon() throws MalformedURLException, IOException{
        String phonenumber = NewJFrame8.phonecon1();
        URL yahoo = new URL("http://185.136.166.131/domestic/sendsms/bulksms.php?username=lohith&password=lohithgubbihally&type=TEXT&sender=BHOTEL&mobile="+phonenumber+"&message=Room%20Booked%20Successesfully%0ARoomNo%20:%20"+NewJFrame8.rn1+"%0AOption%20:%20"+NewJFrame8.op1+"%0AEnjoy%20Your%20Stay.");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
    public static void main(String[] args) throws IOException{
        bookphonecon();
    }
    
}
