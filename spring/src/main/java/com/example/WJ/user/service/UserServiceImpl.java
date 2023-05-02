package com.example.WJ.user.service;

import com.example.WJ.user.domain.Messenger;
import com.example.WJ.user.domain.UserDAO;
import com.example.WJ.user.domain.UserDTO;
import com.example.WJ.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    @Override
    public UserDTO login(UserDTO userDTO) {
        try {
            UserDTO returnUser = new UserDTO();
            String username = userDTO.getUsername();
            UserDAO findUser = userRepository.findByUsername(username).orElse(null);
            if(findUser != null){
                boolean checkPassword = userDTO.getPassword().equals(findUser.getPassword());
                if(checkPassword){
                    returnUser = modelMapper.map(findUser, UserDTO.class);
                }else {
                    String msg = "FAILURE";
                    returnUser.setMsg(msg);
                }
            }
            return returnUser;
        }catch (Exception e){
            throw new RuntimeException("invalid ID");
        }
    }

    @Override
    public Messenger save(UserDTO userDTO) {
        String res = "";
        if(userRepository.findByUsername(userDTO.getUsername()).isEmpty()){
            userRepository.save(UserDAO.builder()
                    .userid(userDTO.getUserid())
                    .password(userDTO.getPassword())
                    .username(userDTO.getUsername())
                    .phone(userDTO.getPhone())
                    .email(userDTO.getEmail())
                    .msg(userDTO.getMsg())
                    .build());
            res = "SUCCESS";
        }else{
            res = "FAIL";
        }
        return Messenger.builder().msg(res).build();
    }
}
