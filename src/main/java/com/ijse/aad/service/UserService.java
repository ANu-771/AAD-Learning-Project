package com.ijse.aad.service;

import com.ijse.aad.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveUser();

    List<UserDTO> getUser();
}
