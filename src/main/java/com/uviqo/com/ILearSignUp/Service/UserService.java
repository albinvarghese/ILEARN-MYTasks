package com.uviqo.com.ILearSignUp.Service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uviqo.com.ILearSignUp.ApiResponse.APIResponse;
import com.uviqo.com.ILearSignUp.Model.Login;
import com.uviqo.com.ILearSignUp.Model.SignIn;
import com.uviqo.com.ILearSignUp.Model.User;
import com.uviqo.com.ILearSignUp.Repository.UserDAO;
import com.uviqo.com.ILearSignUp.Repository.UserDAOImpl;

@Transactional
@Service
public class UserService  {
  @Autowired
  private UserDAO userDAO;

    @Autowired
    private UserDAOImpl userDaoImpl;

//     @Override
    public APIResponse signIn(SignIn signIn) {
        validateSignIn(signIn);
        User user = new User();
        //can use Bcrypt
        BeanUtils.copyProperties(signIn, user);
        userDaoImpl.save(user);
        return new APIResponse(200, "success", user);
    }

  //   @Override
    public APIResponse login(Login login) {
        User user = userDAO.findByUsername(login.getUsername());
        if(user == null) {
            //throw new RuntimeException("User does not exist.");
            return new APIResponse(403,"No user found",null);
        }
        if(!user.getPassword().equals(login.getPassword())){
            //throw new RuntimeException("Password mismatch.");
        	return new APIResponse(403, "password mismatch", null);
        }
        return new APIResponse(200, "Login success", null) ;

    }
    private void validateSignIn(SignIn signIn) {
    }
}
