package com.practice.weconnect;

public class ContactsModal {

    // variables for our user name and contact number.
    private String userName;
    private String contactNumber;

    // constructor
    public ContactsModal(String userName, String contactNumber) {
        this.userName = userName;
        this.contactNumber = contactNumber;
    }

    // on below line we have created getter and setter
    public String getUserName() {
        return userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
