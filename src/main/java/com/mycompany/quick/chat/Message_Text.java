/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quick.chat;

/**
 *
 * @author Student
 */
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;
import java.util.Scanner;
class Message{
    static int max=100;
    // Array for storing
   static String[] messageIDs=new String[max];
   static String[] messageHashes=new String[max];
  static  String[] disregardMessages=new String[max];
   static String[] StoredMessages=new String[max];
   static String[] SentMessages=new String[max];
   static String[] recipient=new String[max];
   
    //Static String[] sentMessages=new String[100]
    static int totalMessages=0;
    static int disregardedCount=0;
    static int SentMessagesCount=0;
    static Scanner scan =new Scanner(System.in);
    
    private String messageID;
  private int messageNumber;
     private String recipients;
     private String message;
     private String messageHash;
     
     //Creating a constructor
     public Message(String recipient,String message){
         this.recipients=recipient;
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
         if(recipients.startsWith("+27")&& recipients.length()<=12){
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
     // create method to store message
     public JSONObject Storemessage() throws IOException{
         JSONObject obj =new JSONObject();
         obj.put("messageID", messageID);
         obj.put("messageHash", messageHash);
         obj.put("recipient", recipient);
         obj.put("message", message);
          // Save JSON to file
            FileWriter file = new FileWriter("messages.json");
            file.write(obj.toString(4)); // Pretty format
            file.close();
            
         return obj;
     }
     public static void disregardMessages(){
         System.out.println("Enter Message to disregard");
         String msg=scan.nextLine();
         disregardMessages[disregardedCount++]=msg;
         System.out.println("Message disregarded");
     }
     public static void StoreMessagemenue(){
         int option;
         do{
             System.out.println("1. Display Sender and Recipient");
        System.out.println("2. Display Longest Message");
        System.out.println("3. Search by Message ID");
        System.out.println("4. Search by Recipient");
        System.out.println("5. Delete Message by Hash");
        System.out.println("6. Display Full Report");
    option=scan.nextInt();
    scan.nextLine();
    switch(option){
        case 1:
            DisplaySenderandRecipient();
            break;

            case 2:
                DisplayLongestMessage();
                break;
                case 3:
                    SearchbymessageID(scan.nextLine()); 
                    break;
                    case 4:
                        SearchbymessageID(scan.nextLine());
                        break;
                        case 5:
                            SearchbyRecipient(scan.nextLine()); 
                            break;
                        default:
                            System.out.println("SELECTED INVALID OPTION");
    }
         }while(option!=5);
     }
     public static void DisplaySenderandRecipient(){
         if(SentMessagesCount==0){
             System.out.println("No stored messages");
         }
         for(int i=0;i<SentMessagesCount;i++){
             System.out.println("Recipient"+ recipient[i]);
         }
     }
     public static void DisplayLongestMessage(){
         if (SentMessagesCount == 0) {
        System.out.println("No stored Messages");
    }

    
    for (int i = 1; i < SentMessagesCount; i++) {
        if (StoredMessages[i].length() > StoredMessages[longest].length()) {
            longest = i;
        }
    }

    System.out.println("\nLongest Message");
    System.out.println("ID" + messageIDs[longest]);
    System.out.println("Recipient" + recipient[longest]);
    System.out.println("Message" + StoredMessages[longest]);
}
     
     // Search by Message ID
public static void SearchbymessageID(String id) {
    for (int i = 0; i < SentMessagesCount; i++) {
        if (messageIDs[i].equalsIgnoreCase(id)) {
            System.out.println("Recipient" + recipient[i]);
            System.out.println("Mesage" + StoredMessages[i]);
        }
    }
}

// Search by Recipient
public static void SearchbyRecipient(String recipients) {
    boolean found = false;
    for (int i = 0; i < SentMessagesCount; i++) {
        if (recipient[i].equalsIgnoreCase(recipients)) {
            System.out.println("\nID" + messageIDs[i]);
            System.out.println("Recipient" + recipient[i]);
            System.out.println("Mesage" + StoredMessages[i]);
            found = true;
        }
    }
    if (!found) {
        System.out.println("No Messages Found");
    }
}

// Delete Message by Hash
public static void DeleteMessagebyHash(String Hash) {
    for (int i = 0; i < SentMessagesCount; i++) {
        if (messageHashes[i].equalsIgnoreCase(Hash)) {
            for (int j = i; j < SentMessagesCount; j++) {
                messageIDs[j] = messageIDs[j + 1];
                messageHashes[j] = messageHashes[j + 1];
                recipient[j] = recipient[j + 1];
                StoredMessages[j] = StoredMessages[j + 1];
            }
            SentMessagesCount--;
            System.out.println("Message deleted successfully.");
        }
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
