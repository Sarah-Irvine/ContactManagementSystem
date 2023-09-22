package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbstractContactCategory implements ContactCategory {

    private List<Contact> contacts = new ArrayList<>();

    private String filename;

    public AbstractContactCategory(String filename) {
        this.filename = filename;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void removeContact(Contact contact) {
        //contacts.remove(contact);

        List<Contact> filteredList = contacts.stream().filter(c -> c.getName().equalsIgnoreCase(contact.getName())).toList();
        contacts.removeAll(filteredList);

    }

    @Override
    public void viewContacts() {

    }

    public void searchContacts(Contact contact) {

        List<Contact> filteredSearchList = contacts.stream().filter(c -> c.getName().equalsIgnoreCase(contact.getName())).toList();
        System.out.println(filteredSearchList);

    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (Contact c : contacts) {
            builder.append(c);
            builder.append("\n");
        }

        return builder.toString();
    }

    public void load() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);

            Scanner sc = new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read
            while (sc.hasNextLine()) {
                String[] contactArray = sc.nextLine().split(",");
                Contact contact = new Contact(contactArray[0],contactArray[1],contactArray[2],contactArray[3]);
                contacts.add(contact);
            }
            sc.close();     //clo
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void save() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);

            //returns true if there is another line to read
            for (Contact c: contacts) {
                StringBuilder builder = new StringBuilder();
                builder.append(c.getName());
                builder.append(",");
                builder.append(c.getEmail());
                builder.append(",");
                builder.append(c.getPhoneNumber());
                builder.append(",");
                builder.append(c.getCategory());
                builder.append("\n");
                fos.write(builder.toString().getBytes());
            }
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
