package com.mlassakoski.dojointegrationtest.service;

import com.mlassakoski.dojointegrationtest.entity.model.User;
import com.mlassakoski.dojointegrationtest.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers() {
        return (List<User>) repository.findAll();
    }
}
