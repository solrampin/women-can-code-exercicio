package com.womencancode.projetofinal.service;

import com.womencancode.projetofinal.model.User;
import com.womencancode.projetofinal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insertuser (User user) {
        return userRepository.insert(user);
    }

    public User update (User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById (String id) {
        return userRepository.findById(id).get();
    }

    public void delete (String id) {
        userRepository.deleteById(id);
    }

}
