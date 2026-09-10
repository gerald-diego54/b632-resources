package com.joysistvi.stage2.day19.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class UserAccount {

    private final String id;

    @NotBlank(message = "First name is required")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Address is required")
    @Size(min = 10, max = 255, message = "Address must be 10 to 255 characters")
    private String address;

    @NotBlank(message = "Email address is required")
    @Email(message = "Invalid email address")
    private String emailAddress;

    @NotBlank(message = "Password is required")
    @Size(min=8, message = "Password least 8 character minimum")
    private String password;

    public UserAccount(
            String firstName,
            String middleName,
            String lastName,
            String address,
            String emailAddress,
            String password
    ) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//package com.joysistvi.stage2.day19.model;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
//
//import java.util.UUID;
//
//public record UserAccount(
//
//        String id,
//
//        @NotBlank(message = "First name is required")
//        String firstName,
//
//        String middleName,
//
//        @NotBlank(message = "Last name is required")
//        String lastName,
//
//        @NotBlank(message = "Address is required")
//        @Size(
//                min = 10,
//                max = 255,
//                message = "Address must be 10 to 255 characters"
//        )
//        String address,
//
//        @NotBlank(message = "Email address is required")
//        @Email(message = "Invalid email address")
//        String emailAddress,
//
//        @NotBlank(message = "Password is required")
//        @Size(
//                min = 8,
//                message = "Password must be at least 8 characters"
//        )
//        String password
//
//) {
//
//    public UserAccount(
//            String firstName,
//            String middleName,
//            String lastName,
//            String address,
//            String emailAddress,
//            String password
//    ) {
//        this(
//                UUID.randomUUID().toString(),
//                firstName,
//                middleName,
//                lastName,
//                address,
//                emailAddress,
//                password
//        );
//    }
//}