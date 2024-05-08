package com.sprinboot_bici.springbicicut.services;

import com.sprinboot_bici.springbicicut.models.UserModel;
import com.sprinboot_bici.springbicicut.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }

    public UserModel updatebyId(UserModel request, Long id){
       UserModel user = userRepository.findById(id).get();

       user.setFirstName(request.getFirstName());
       user.setLastName(request.getLastName());
       user.setEmail(request.getEmail());

       return user;
    }

    public Boolean deleteUser (Long id){
        try{
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
