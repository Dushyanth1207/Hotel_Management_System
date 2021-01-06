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


//
import java.util.Properties;    
import java.util.Random;
import javax.mail.*;    
import javax.mail.internet.*;





/**
 *
 * @author lohith
 */
public class NewClass   {
    static int phone_otp;
    static int mail_otp;
    static String Phone;
    static String email;
    static int otpp;
    static int otpm;
    
    
    static void potp() throws MalformedURLException, IOException{
        Random rand = new Random();
        phone_otp = rand.nextInt(99999);
        otpp = phone_otp;
        
        NewJFrame1 hellootp = new NewJFrame1();
        Phone = hellootp.phoneotp();
        email = hellootp.mailotp();
        
        URL yahoo = new URL("http://185.136.166.131/domestic/sendsms/bulksms.php?username=lohith&password=lohithgubbihally&type=TEXT&sender=BHOTEL&mobile="+Phone+"&message="+phone_otp+"");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        NewJFrame2 hello61 = new NewJFrame2();
        hello61.setVisible(true);
    }
    
  
     public static void send(String from,String password,String to,String sub,String msg){ 
         
          //Get properties object
          
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "587");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }
      static void sender(){
          Random hand = new Random();
          mail_otp = hand.nextInt(99999);
          otpm = mail_otp;
          send("lohithgubbihally@gmail.com","sharvani@1978",email,"hi ","Otp"+mail_otp);
      }
      
       static int otppp(){return otpp;}
       static int otpmm(){return otpm;}
    
    
     



    


    
    
    public static void main(String[] args) throws MalformedURLException, IOException{
        
        potp();
        
        sender();
    
        
    }
    
    
}
