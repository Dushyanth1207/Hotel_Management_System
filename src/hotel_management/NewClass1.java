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
public class NewClass1 {
    static String ppphone;
    static String mmmail;
    static int potpp;
    static int motpm;
    static int cpotpp;
    static int cmotpm;
    static void pphone() throws MalformedURLException, IOException{
        Random rand = new Random();
        potpp = rand.nextInt(99999);
        cpotpp = potpp;
        NewJFrame3 hello68 = new NewJFrame3();
        ppphone = hello68.pn();
        URL yahoo = new URL("http://185.136.166.131/domestic/sendsms/bulksms.php?username=lohith&password=lohithgubbihally&type=TEXT&sender=BHOTEL&mobile="+ppphone+"&message="+potpp+"");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
    
    static void mmail(String from,String password,String to,String sub,String msg){
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
    static void link(){
          Random hand = new Random();
          motpm= hand.nextInt(99999);
          cmotpm = motpm;
          NewJFrame3 hello69 = new NewJFrame3();
          mmmail = hello69.ed();
          mmail("lohithgubbihally@gmail.com","sharvani@1978",mmmail,"hi ","Otp"+motpm);
          NewJFrame4 hello71 = new NewJFrame4();
          hello71.setVisible(true);
          
      }
    static int spotp(){return cpotpp;}
    static int smotp(){return cmotpm;}
    
    public static void main(String[] args) throws IOException{
        pphone();
        link();
    }
    
    }
    

