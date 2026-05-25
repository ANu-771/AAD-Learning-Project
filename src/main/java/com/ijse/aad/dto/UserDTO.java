package com.ijse.aad.dto;

import com.ijse.aad.enumaration.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private long userId;
    private String firstName;
    private String lastName;
    private Date dob;
    private UserStatus status;

}
