package org.example;

import java.util.ArrayList;
import java.util.List;

public class AbstractContactCategory  implements ContactCategory {

    private List<Contact> contacts = new ArrayList<>();
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
        for (Contact c: contacts) {
            builder.append(c);
            builder.append("\n");
        }

        return builder.toString();
    }
}
