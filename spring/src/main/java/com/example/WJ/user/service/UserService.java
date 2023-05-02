package com.example.WJ.user.service;

import com.example.WJ.user.domain.Messenger;
import com.example.WJ.user.domain.UserDTO;
public interface UserService {
    UserDTO login(UserDTO userDTO);

    Messenger save(UserDTO userDTO);
}
