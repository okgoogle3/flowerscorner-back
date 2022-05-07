package com.jjour.service;

import com.jjour.model.UserModel;
import com.jjour.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    @Autowired
    public final UserRepo userRepo;

    public List<UserModel> getAllUsers(){
        return userRepo.findAll();
    }
}
