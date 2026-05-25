/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quick.chat;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Student
 */
class Login {

    String StoreUsername;
    String StorePassword;
    String StoreCellphonenumber;
    String registerUser;
    String Storefirstname;
    String Storelastname;

    boolean checkUsername(String Username) {
        if (Username.contains("_") && Username.length() <= 5) {
            return true;
        } else {
            System.out.println("Username should contain an underscore and"
                    + " should be no more tha 5 characters ");
            return false;

        }
    }

    boolean checkPassword(String password) {
        if (password.length() < 8) {
            return true;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean haSpecialChar = false;

        //define special characters
        String SpecialChar = "!@#$%^&*():";
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (SpecialChar.indexOf(ch) >= 0) {
                haSpecialChar = true;
            }
        }
        return hasUppercase && hasDigit && haSpecialChar;
    }

    boolean checkCellphone(String StoreCellphonenumber) {
        if (StoreCellphonenumber == null) {
            return false;
        }
        String pattern = "^\\+27[- ]?(6|7|8)\\d{1}[- ]?\\d{3}[- ]?\\d{4}$";
        if (StoreCellphonenumber.matches(pattern)) {
            System.out.println("Cellphone number Successfully added");
            return true;
        } else {
            System.out.println("Cellphone number incorrectly formatted "
                    + "or does not contain international code");
            return false;
        }
    }

    String registerUser(String username, String password) {
        if (!checkUsername(username)) {
            System.out.println("Username or password incorrect, please try again");
        }// else {
//            
//        }
        if (!checkPassword(password)) {
            System.out.println("Username or password incorrect, please try again");
        }
        StoreUsername = username;
        StorePassword = password;

        return "You have been registered sucessfully";
    }

    boolean LoginUser(String username, String password) {

        return username.equals(StoreUsername) && password.equals(StorePassword);
    }

    String returnLoginStatus(String username, String password, String firstname, String lastname) {

        if (username.equals(StoreUsername) && password.equals(StorePassword)) {
            return "Welcome" + firstname + " " + lastname + ", its good to see you again";
        } else {
            return "User name or password incorrect, please try again";

        }
    }
}

/**
 *
 * @author Student
 */
public class QuickChat {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        Login login = new Login();
        System.out.println("Enter your Fisrt name");
        String firstname = scan.nextLine();

        System.out.println("Enter your Last name");
        String lastname = scan.nextLine();

        System.out.println("Enter Username");
        String username = scan.nextLine();
        login.checkUsername(username);

        System.out.println("Enter your password");
        String password = scan.nextLine();
        login.checkPassword(password);

        System.out.println("Enter your cellphone number");
        String cellphone = scan.nextLine();
        login.checkCellphone(cellphone);

        System.out.println(login.registerUser(username, password));

        System.out.println("************** Login ********************");

        System.out.println("Enter Username");
        String userName = scan.nextLine();

        System.out.println("Enter your password");
        String passwords = scan.nextLine();

        login.LoginUser(userName, password);

        // Show login message
        System.out.println(login.returnLoginStatus(userName, password, firstname, lastname));

        int menuOption = 0;
        while (menuOption != 3) {
            System.out.println("1) Send message");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");

            System.out.println("Choose an Option");
            menuOption = scan.nextInt();
            scan.nextLine();
            if (menuOption == 1) {
                System.out.println("How many messages do want to send");
                int numMessages = scan.nextInt();
                scan.nextLine();

                for (int i = 0; i < numMessages; i++) {
                    System.out.println("Enter recipient number :");
                    String recipient = scan.nextLine();

                    System.out.println("Enter your message :");
                    String messageText = scan.nextLine();

                    Message msg = new Message(recipient, messageText);
                    System.out.println(msg.sentMessage());
                    if (msg.checkRecipientCell() && msg.checkMessageID());
                    System.out.println(msg.printMessage());
                    System.out.println(login.returnLoginStatus(userName, password, firstname, lastname));
                    System.out.println("1) Send message");
                    System.out.println("2) Disregard Message");
                    System.out.println("3) Store message");

                    int choice = scan.nextInt();
                    scan.nextLine();

                    if (choice == 1) {
                        System.out.println("Message successfully sent");
                    } else if (choice == 2) {
                        System.out.println("Press 0  to delete the message");
                    } else if (choice == 3) {
                        System.out.println(msg.Storemessage());
                        System.out.println("Message Successfully Stored");
                    } else {
                        System.out.println("Invalid message details");
                    }
                    System.out.println("Total message sent :" + numMessages);

                }

            }
            if (menuOption == 2) {
                System.out.println("Coming soon");

            } else if (menuOption == 3) {
                System.out.println("Application closed");
            }
        }
    }

}
