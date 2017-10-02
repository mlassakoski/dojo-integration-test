package com.mlassakoski.dojointegrationtest.controller;


import com.mlassakoski.dojointegrationtest.entity.model.User;
import com.mlassakoski.dojointegrationtest.service.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j
@RestController
@RequestMapping(value = "api/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<List<User>> getUsers() {

        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

}
