package com.ims.springjwt.services;

import com.ims.springjwt.models.User;
import com.ims.springjwt.payload.request.ForgotPassword;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    User forgotPassword(@RequestBody ForgotPassword forgotPassword);

    List<User> fetchUserLikeStudent();
}
