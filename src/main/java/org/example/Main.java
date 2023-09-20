package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();
        ContactManagerMessages messageToScreen = new ContactManagerMessages();
        messageToScreen.welcomeMessage();

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
                contactManager.searchContacts(choice4, choice4Name); //create method to do this

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

/*
Project: Contact Management System

        Project Overview:
        In this project, students will develop a contact management system in Java.
        The system should allow users to add, view, search, and manage contacts.
        Contacts can be organized into different categories, and users can perform various operations on them.

        Project Requirements:

        1. Contact Class:

        Create a base class called Contact that includes common attributes like name, email, and phone number.
        This class should also have appropriate getter and setter methods.
        Implement a constructor in the Contact class to initialize these attributes.

        2. ContactCategory Interface:

        Define an interface called ContactCategory that includes methods like addContact(), removeContact(), viewContacts(), and searchContacts().
        Each category of contacts (e.g., personal, work, family) should implement this interface.

        3. ContactCategory Classes:

        Create at least two classes that implement the ContactCategory interface, representing different categories of contacts (e.g., PersonalContactCategory, WorkContactCategory).
        These classes should maintain a list of contacts using an ArrayList or a HashMap.
        Implement methods from the ContactCategory interface to manage contacts within the respective categories.

        4. ContactManager Class:

        Create a class called ContactManager that acts as a central hub for managing different categories of contacts.
        The ContactManager class should allow users to switch between contact categories and perform operations like adding, removing, viewing, and searching for contacts across categories.
        Use a HashMap or other appropriate data structure to map category names to their respective ContactCategory objects.

        5. File I/O:

        Implement file I/O operations to read and write contacts to a file. Each contact category should have its file for storing contacts.
        Users should be able to load existing contacts from files when the program starts and save contacts when they make changes.

        6. User Interface:

        Users will interact with the contact management system through the scanner
        Use a menu-driven approach to provide options for adding, removing, viewing, and searching for contacts.
        Project Structure:

        lua
        Copy code
        src/
        |-- Contact/
        |   |-- Contact.java
        |
        |-- ContactCategories/
        |   |-- ContactCategory.java
        |   |-- PersonalContactCategory.java
        |   |-- WorkContactCategory.java
        |
        |-- ContactManager.java
        |-- Main.java
        Project Guidelines:

        Students are encouraged to use inheritance and interfaces effectively to structure their classes.

        Bonus:
        Ensure that file I/O operations are error-handled and contacts are saved and loaded correctly.
        Provide a user-friendly console interface with clear instructions for users.*/
