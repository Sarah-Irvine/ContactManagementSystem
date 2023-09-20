package org.example;

public class ContactManagerMessages {

    public void welcomeMessage(){
        System.out.println("**************************");
        System.out.println("~~~~~ Welcome to CMS ~~~~~");
        System.out.println("**************************");
        System.out.println();
    }

    public void mainMenu() {
        System.out.println("How can we help you?");
        System.out.println("1. Add contact");
        System.out.println("2. Remove contact");
        System.out.println("3. View contacts");
        System.out.println("4. Search for contact");
        System.out.println("Please enter 1, 2, 3 or 4 to select your option and continue or enter 0 to quit the application: ");
    }

    public void addContact() {
        System.out.println("~~~Add Contact~~~");
        System.out.println();
        System.out.println("Would you like to add a contact to: ");
        System.out.println("1. Your work contact directory");
        System.out.println("2. Your personal contact directory");
        System.out.println("Please enter 1 or 2 to select your option and continue: ");
    }

    public void removeContact() {
        System.out.println("~~~Remove Contact~~~");
        System.out.println();
        System.out.println("Would you like to remove a contact from: ");
        System.out.println("1. Your work contact directory");
        System.out.println("2. Your personal contact directory");
        System.out.println("Please enter 1 or 2 to select your option and continue: ");
    }

    public void viewContacts() {
        System.out.println("~~~View Contacts~~~");
        System.out.println();
        System.out.println("Would you like to view: ");
        System.out.println("1. Your work contact directory");
        System.out.println("2. Your personal contact directory");
        System.out.println("Please enter 1 or 2 to select your option and continue: ");
    }

    public void searchContacts() {
        System.out.println("~~~Search for a Contact~~~");
        System.out.println();
        System.out.println("Would you like to search in: ");
        System.out.println("1. Your work contact directory");
        System.out.println("2. Your personal contact directory");
        System.out.println("Please enter 1 or 2 to select your option and continue: ");
    }

    public void endMessage() {
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }

    public void quitApplication() {
        System.out.println("You have chosen to quit the application - thanks for using CMS.");
    }

    public void invalidChoice() {
        System.out.println("Invalid choice, please try again.");
    }

    public void contactToRemove() {
        System.out.println("Please enter the name of the contact you wish to remove: ");
    }

    public void contactToSearch() {
        System.out.println("Please enter the name of the contact you wish to search for: ");
    }
}
