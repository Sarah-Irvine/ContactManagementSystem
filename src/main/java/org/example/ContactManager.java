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
                workContacts.removeContact(removeContact);
                System.out.println(name + " has been successfully removed from your work contact directory.");
                break;
            }
            case 2: {
                Contact removeContact = new Contact(name);
                personalContacts.removeContact(removeContact);
                System.out.println(name + " has been successfully removed from your personal contact directory.");
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
                Contact searchContact = new Contact(name);
                System.out.println("Here are the contact details for " + name + " from your work contact directory.");
                workContacts.searchContacts(searchContact);
                break;

            }
            case 2: {
                Contact searchContact = new Contact(name);
                System.out.println("Here are the contact details for " + name + " from your personal contact directory.");
                personalContacts.searchContacts(searchContact);
                break;
            }
            default: {
                System.out.println("Invalid directory");
                break;
            }
        }
    }

    public void loadContacts() {
        personalContacts.load();
        workContacts.load();

    }

    public void saveContacts(){
        personalContacts.save();
        workContacts.save();
    }
}
