package ua.pobut.storage.domain;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String username;

    private String password;

//    private String firstName;
//
//    private String lastName;
//
//    private String phone;

}
