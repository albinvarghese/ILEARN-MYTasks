package com.uviqo.com.ILearSignUp.Controller;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uviqo.com.ILearSignUp.ApiResponse.APIResponse;
import com.uviqo.com.ILearSignUp.Model.Login;
import com.uviqo.com.ILearSignUp.Model.SignIn;

//import com.uviqo.UviqoUserDetails.Model.User;

import com.uviqo.com.ILearSignUp.Service.UserService;

@Controller
@RestController
@Service
@RequestMapping("/users")
public class UserController {
	
	//@Autowired
	//private static PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @PostMapping
    
    public APIResponse signUp(@RequestBody SignIn signUp){
   
        return userService.signIn(signUp);
    }
    
 

    @PostMapping("/loginpage")
    public APIResponse login(@RequestBody Login login){
        return userService.login(login);
    }
    
    
}


