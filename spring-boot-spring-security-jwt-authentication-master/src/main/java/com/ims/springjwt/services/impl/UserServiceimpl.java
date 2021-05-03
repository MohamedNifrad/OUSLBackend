package com.ims.springjwt.services.impl;

import com.ims.springjwt.models.User;
import com.ims.springjwt.payload.request.ForgotPassword;
import com.ims.springjwt.repository.UserRepository;
import com.ims.springjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public User forgotPassword(@RequestBody ForgotPassword forgotPassword) {
        try
        {
            String email = forgotPassword.getEmail();
            String password = forgotPassword.getPassword();
            System.out.println(email);
            User exitUser = userRepository.findByEmail(email).get(); //User exitUser = userRepository.findByEmail(email).orElse(null);
            String encodePassword = encoder.encode(password);
            exitUser.setPassword(encodePassword);
            return userRepository.save(exitUser);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public List<User> fetchUserLikeStudent() {
        return userRepository.fetchUser();
    }
}
