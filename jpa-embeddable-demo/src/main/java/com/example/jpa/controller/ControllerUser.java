package com.example.jpa.controller;

import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

/**
 * @auther $(USER)
 * @date $(DATE)
 * @description :
 */
@RestController
public class ControllerUser {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/home")
    public String home( ){
        assertNotNull( userRepository );
        System.out.println( "#### userRepository Name:"+ userRepository.getClass().getName()+" Class "+userRepository.getClass() );
        return "hello";
    }
}
