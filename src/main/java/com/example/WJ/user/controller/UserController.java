package com.example.WJ.user.controller;

import com.example.WJ.user.domain.Messenger;
import com.example.WJ.user.domain.UserDTO;
import com.example.WJ.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(UserDTO userDTO){
        return ResponseEntity.ok(userService.login(userDTO));
    }

    @PostMapping("/join")
    public ResponseEntity<Messenger> save(UserDTO userDTO){
        return ResponseEntity.ok(userService.save(userDTO));
    }
}
