package com.allan.Application_Climate.services.user_services;

import com.allan.Application_Climate.models.user_models.UserDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ImplUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDocument userDocument = userService.findUserByUsername(username).orElseThrow(() ->
               new UsernameNotFoundException("User not found with this username: " + username));
        return userDocument;
    }
}
