package com.example.WJ.user.repository;

import com.example.WJ.user.domain.UserDAO;
import com.example.WJ.user.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {
    Optional<UserDAO> findByUsername(String username);
}
