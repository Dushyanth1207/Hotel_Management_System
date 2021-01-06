/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;
import static hotel_management.NewClass6.sender;
import java.net.*;
import java.io.*;

/**
 *
 * @author lohith
 */
public class NewClass7 {
    public static void sink() throws Exception {
		// TODO Auto-generated method stub
		
        URL yahoo = new URL("http://185.136.166.131/domestic/sendsms/bulksms.php?username=lohith&password=lohithgubbihally&type=TEXT&sender=BHOTEL&mobile="+NewJFrame7.tele+"&message=Room%20Booked%20Successesfully%0ARoomNo%20:%20"+NewJFrame7.aaa+"%0AOption%20:%20"+NewJFrame7.bbb+"%0AEnjoy%20Your%20Stay.");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
	

	}
    public static void main(String[] args) throws Exception{
       sink();
    }
}
