package com.ijse.aad.entity;

import com.ijse.aad.enumaration.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //gives second getters and setters, toString, equals
@NoArgsConstructor //default constructor
@AllArgsConstructor //all args constructor
@Entity //define this class as an entity and create a table in the database
public class User {

    @Id //define this as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment mechanism
    private long userId;
    private String firstName;
    private String lastName;
    private Date dob;

    @Enumerated(EnumType.STRING) //search and save this enum as String in the database
    private UserStatus status;


}
