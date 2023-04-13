package com.example.WJ.user.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component @Data
public class UserDTO {

    private long userIdx;
    String userid;
    String password;
    String username;
    String phone;
    String email;
    String msg;


}
