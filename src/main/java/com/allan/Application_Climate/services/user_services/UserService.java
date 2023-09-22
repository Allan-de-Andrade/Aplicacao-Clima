package com.allan.Application_Climate.services.user_services;

import com.allan.Application_Climate.models.user_models.UserDocument;
import com.allan.Application_Climate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<UserDocument> findUserByUsername(String username){
        try{
            Optional<UserDocument> user = userRepository.findByUsername(username);
            return user;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public UserDocument saveUser(UserDocument userDocument){
        try{
            userDocument.setPassword(passwordEncoder().encode(userDocument.getPassword()));
            return userRepository.save(userDocument);
        }

        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
