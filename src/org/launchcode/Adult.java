package org.launchcode;

public class Adult extends Person {

    //List instance variables
    private String friends;
    private String children;

    //Construct default Friends object
    public Adult() {
    }

    //Construct Friend object with specified parameters
    public Adult(String name, int age, String status, String image, String friends, String children) {
        super(name, age, status, image);
        this.friends = friends;
        this.children = children;
    }

    //Construct second Friend object with specified parameters
    public Adult(String name, int age, String status, String image, String friends) {
        super(name, age, status, image);
        this.friends = friends;
        this.children = null;
    }

    //Construct third Friend object with specified parameters
    public Adult(String name, int age, String status, String image) {
        super(name, age, status, image);
        this.friends = null;
        this.children = null;
    }

    //Construct fourth Friend object with specified parameters
    public Adult(String name, int age, String status) {
        super(name, age, status, null);
        this.friends = null;
        this.children = null;
    }

    //Construct fifth Friend object with specified parameters
    public Adult(String name, int age) {
        super(name, age, null, null);
        this.friends = null;
        this.children = null;
    }

    //Return friend's name(s)
    public String getFriends() {
        return friends;
    }

    //Return names of children
    public String getChildren() {
        return children;
    }

    //Set names of children
    public void setChildren(String children) {
        this.children = children;
    }

    //Set friend's name
    public void setFriends(String friends) {
        this.friends = friends;
    }

    //Return a string listing object parameters
    public String toString() {
        return "Name:" + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage();
    }
}

