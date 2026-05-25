/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quick.chat;

/**
 *
 * @author Student
 */
class Message{
    private String messageID;
  private int messageNumber;
     private String recipient;
     private String message;
     private String messageHash;
     
     //Creating a constructor
     public Message(String recipient,String message){
         this.recipient=recipient;
         this.message=message;
         this.messageNumber=messageNumber;
         this.messageID="1234567890";
     }
     //Create the return method to check messageId
     public boolean checkMessageID(){
         if(messageID.length()==10){
             return true;
         }else{
             return false;
         }
     }
     // check recipient cell
     public boolean checkRecipientCell(){
         if(recipient.startsWith("+27")&& recipient.length()<=12){
             return true;
         }else{
             return false;
         }
     }
     // check Message length
     public String sentMessage(){
         if(message.length()>250){
             int excess=message.length()-250;
             return"Message exceeds 250 characters by"+excess +"please reduce size";
         }else{
             return"Message ready to send";
         }
     }
     //Create Message Hash
     public String createMessageHash(){
         String[] words= message.split(" ");
         String firstword= words[0];
         String lastwords= words[words.length-1];
         messageHash= messageID.substring(0,2) + ":" + messageNumber + ":" + firstword.toString()+lastwords.toString();
                 return messageHash;
     }
     // Display Message details
     public String printMessage(){
         return "Message ID"+ messageID +
                 "\n Message Hash :" + createMessageHash()+
                 "\nRecipient :" + recipient +
                 "\nMessage :" + message;
     }
 
}

public class Message_Text {
    
}
