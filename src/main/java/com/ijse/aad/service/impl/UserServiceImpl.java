package com.ijse.aad.service.impl;

import com.ijse.aad.dto.UserDTO;
import com.ijse.aad.entity.User;
import com.ijse.aad.enumaration.UserStatus;
import com.ijse.aad.repository.UserRepository;
import com.ijse.aad.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO saveUser() {
        // Implementation for saving a user

        log.info("Execute method saveUser()");

        User user = new User();
        user.setFirstName("Kamal");
        user.setLastName("Gamage");
        user.setDob(new Date());
        user.setStatus(UserStatus.ACTIVE);

        User savedUser = userRepository.save(user);
        log.info("User Saved.........");


        UserDTO responseDTO = new UserDTO();
        responseDTO.setUserId(savedUser.getUserId());
        responseDTO.setFirstName(savedUser.getFirstName());
        responseDTO.setLastName(savedUser.getLastName());
        responseDTO.setDob(savedUser.getDob());
        responseDTO.setStatus(savedUser.getStatus());

        log.info("Save User returned...");
        return responseDTO;


    }
}
