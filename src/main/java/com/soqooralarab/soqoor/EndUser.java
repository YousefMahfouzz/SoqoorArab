package com.soqooralarab.soqoor;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class EndUser {

    @Id
    @SequenceGenerator(name = "users_sequence" , sequenceName = "users_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
    private Long userId;
    private String password;
    private String userName;
    private String userEmail;
    private Number phoneNumber;
    private LocalDate dob;
    private String locaiton;
//    @ManyToOne
//    @JoinColumn (name = "pfpId")
//    private ProfilePicture profilePicture;

    public EndUser(){

    }

    public EndUser(Long userId, String password, String userName, String userEmail, Number phoneNumber, LocalDate dob, String locaiton) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.locaiton = locaiton;
 //       this.profilePicture = profilePicture;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Number getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Number phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLocaiton() {
        return locaiton;
    }

    public void setLocaiton(String locaiton) {
        this.locaiton = locaiton;
    }

//    public ProfilePicture getProfilePicture() {
//        return profilePicture;
//    }
//
//    public void setProfilePicture(ProfilePicture profilePicture) {
//        this.profilePicture = profilePicture;
//    }

    @Override
    public String toString() {
        return "EndUser{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dob=" + dob +
                ", locaiton='" + locaiton + '\'' +
//                ", profilePicture=" + profilePicture +
                '}';
    }
}
