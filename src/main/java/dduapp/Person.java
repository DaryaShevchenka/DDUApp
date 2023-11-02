package dduapp;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private static int userNameId = 103;

    protected Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = String.valueOf(103);
        generateUserName(firstName,lastName);

    }

    private void generateUserName(String firstName,String lastName) {
        this.userName = firstName.trim().charAt(0) + lastName.trim() + userNameId;
        userNameId++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static int getUserNameId() {
        return userNameId;
    }
}
