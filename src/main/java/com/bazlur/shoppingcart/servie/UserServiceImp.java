package com.bazlur.shoppingcart.servie;

import com.bazlur.shoppingcart.dto.User;
import com.bazlur.shoppingcart.dto.UserDTO;
import com.bazlur.shoppingcart.repo.UserRepo;
import com.bazlur.shoppingcart.repo.UserRepoImp;

public class UserServiceImp implements UserService{

    private UserRepo userRepo;

    public UserServiceImp(UserRepoImp userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        String encryptedPass= getEncryptedPass(userDTO.getPassword());
        userRepo.save(new User(userDTO.getUserName(),encryptedPass,userDTO.getEmail(),userDTO.getFirstName(),userDTO.getLastName()));
    }

    private String getEncryptedPass(String password) {
        return password;
    }
}
