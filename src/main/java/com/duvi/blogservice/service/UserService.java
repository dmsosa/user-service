package com.duvi.blogservice.service;

import com.duvi.blogservice.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findUserById(String id);
    public User findUserByUsername(String username);
    public User findByEmail(String email);
    public User findByLogin(String login);
    public User saveUser(User user);
    public User updateUser(String oldUserId, User updatedUser);
    public void deleteUserById(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
