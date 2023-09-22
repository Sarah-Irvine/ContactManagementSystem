package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();
        ContactManagerMessages messageToScreen = new ContactManagerMessages();
        messageToScreen.welcomeMessage();
        contactManager.loadContacts();

        boolean correct = false;

        while(!correct) {
            Scanner contactScanner = new Scanner(System.in);
            messageToScreen.mainMenu();
            int choice = contactScanner.nextInt();
            contactScanner.nextLine();

            if (choice == 1) {
                messageToScreen.addContact();

                int choice1 = contactScanner.nextInt();
                contactScanner.nextLine();
                contactManager.addContact(choice1);

                messageToScreen.endMessage();

            } else if (choice == 2) {
                messageToScreen.removeContact();

                int choice2 = contactScanner.nextInt();
                contactScanner.nextLine();
                messageToScreen.contactToRemove();
                String choice2Name = contactScanner.nextLine();
                contactManager.removeContact(choice2, choice2Name);

                messageToScreen.endMessage();

            } else if (choice == 3) {
                messageToScreen.viewContacts();

                int choice3 = contactScanner.nextInt();
                contactScanner.nextLine();
                contactManager.viewContacts(choice3);

                messageToScreen.endMessage();

            } else if (choice == 4) {
                messageToScreen.searchContacts();

                int choice4 = contactScanner.nextInt();
                contactScanner.nextLine();
                messageToScreen.contactToSearch();
                String choice4Name = contactScanner.nextLine();
                contactManager.searchContacts(choice4, choice4Name);

                messageToScreen.endMessage();

            } else if (choice == 0) {
                messageToScreen.quitApplication();
                correct = true;

            } else {
                messageToScreen.invalidChoice();
            }
        }

    }
}
