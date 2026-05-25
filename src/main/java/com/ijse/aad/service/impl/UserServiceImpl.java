package com.ijse.aad.service.impl;

import com.ijse.aad.dto.UserDTO;
import com.ijse.aad.entity.User;
import com.ijse.aad.enumaration.UserStatus;
import com.ijse.aad.repository.UserRepository;
import com.ijse.aad.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public List<UserDTO> getUser() {
        log.info("Execute method getUsers()");
        try{

            List<UserDTO> responseList = new ArrayList<>();
            List<User> userList = userRepository.findAll();

            for (User user : userList) {
                UserDTO userDTO = new UserDTO();
                userDTO.setUserId(user.getUserId());
                userDTO.setFirstName(user.getFirstName());
                userDTO.setLastName(user.getLastName());
                userDTO.setDob(user.getDob());
                userDTO.setStatus(user.getStatus());

                responseList.add(userDTO);
            }

            return  responseList;


        } catch (Exception e) {
            log.error("Error in Method getUsers() : " + e.getMessage());
            return null;

        }
    }
}
