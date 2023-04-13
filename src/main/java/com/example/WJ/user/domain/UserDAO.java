package com.example.WJ.user.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter @Builder
@Setter
@Entity
@Table(name = "user")
public class UserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "useridx") @NotNull
    private Long userIdx;
    @Column(name = "userid") @NotNull
    private String userid;
    @Column(name = "pwd") @NotNull
    private String password;
    @Column(name = "username") @NotNull
    private String username;
    @Column(name = "phone") @NotNull
    private String phone;
    @Column(name = "email") @NotNull
    private String email;
    @Column(name = "msg")
    private String msg;

}
