package org.example;

import java.util.Objects;

public class Contact {

    private String name;

    private String email;

    private String phoneNumber;

    private String category;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Contact(String inputName, String inputEmail, String inputPhone, String inputCategory){
        this.name = inputName;
        this.email = inputEmail;
        this.phoneNumber = inputPhone;
        this.category = inputCategory;
    }

    public Contact(String inputName){
        this.name = inputName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

/* Not required as changed to using Stream
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equalsIgnoreCase(contact.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/
}
