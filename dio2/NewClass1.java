/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio2;

/**
 *
 * @author kaiky
 */
public class NewClass1 {

    public static void main(String[] args) {
       System.out.println("MSN"); 
       MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        
         
        
        System.out.println("/nFacebook");
         Facebook fcb = new Facebook();
         fcb.enviarMensagem();
         fcb.receberMensagem();
         
         
          
          System.out.println("/nTelegram");
          Telegram tel = new Telegram();
         tel.enviarMensagem();
         tel.receberMensagem();
              
    }
    }
    

