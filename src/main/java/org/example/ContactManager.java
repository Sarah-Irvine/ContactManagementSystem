package org.example;

import java.util.Scanner;
public class ContactManager {

    WorkContactCategory workContacts = new WorkContactCategory();
    PersonalContactCategory personalContacts = new PersonalContactCategory();
    public void addContact(int integer){
        Scanner addContactScanner = new Scanner(System.in);
        switch (integer){
            case 1:{
                String category = "work";
                System.out.println("Enter the contact's name: ");
                String name = addContactScanner.nextLine();
                System.out.println("Enter their email address: ");
                String email = addContactScanner.nextLine();
                System.out.println("Enter their phone number: ");
                String phoneNumber = addContactScanner.nextLine();
                Contact inputContact = new Contact(name, email, phoneNumber, category);
                workContacts.addContact(inputContact);
                System.out.println(inputContact);
                break;

            }
            case 2: {
                String category = "personal";
                System.out.println("Enter the contact's name: ");
                String name = addContactScanner.nextLine();
                System.out.println("Enter their email address: ");
                String email = addContactScanner.nextLine();
                System.out.println("Enter their phone number: ");
                String phoneNumber = addContactScanner.nextLine();
                Contact inputContact = new Contact(name, email, phoneNumber, category);
                personalContacts.addContact(inputContact);
                System.out.println(inputContact);
                break;
            }
            default: {
                System.out.println("Invalid directory");
                break;
            }
        }
    }

    public void removeContact(int integer, String name){
        switch (integer){
            case 1:{
                Contact removeContact = new Contact(name);
                System.out.println(name + " has been successfully removed from your work contact directory.");
                workContacts.removeContact(removeContact);
                break;
            }
            case 2: {
                Contact removeContact = new Contact(name);
                System.out.println(name + " has been successfully removed from your personal contact directory.");
                personalContacts.removeContact(removeContact);
                break;
            }
            default: {
                System.out.println("Invalid directory");
                break;
            }
        }
    }

    public void viewContacts(int integer){
        switch (integer){
            case 1:{
                System.out.println(workContacts);
                break;
            }
            case 2: {
                System.out.println(personalContacts);
                break;
            }
            default: {
                System.out.println("Invalid directory");
                break;
            }
        }
    }

    public void searchContacts(int integer, String name){
        switch (integer){
            case 1:{
                //find work contact using name input
                System.out.println("Here are the contact details for " + name + " from your work contact directory.");
                //print out details for contact
                break;

            }
            case 2: {
                //find personal contact using name input
                System.out.println("Here are the contact details for " + name + " from your personal contact directory.");
                //print out details for contact
                break;
            }
            default: {
                System.out.println("Invalid directory");
                break;
            }
        }
    }
}
