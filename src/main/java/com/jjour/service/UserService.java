package com.jjour.service;

import com.jjour.model.UserModel;
import com.jjour.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    public final UserRepo userRepo;

    public List<UserModel> getAllUsers() {
        return userRepo.findAll();
    }

    public UserModel getUserByID(long id) throws Exception {
        Optional<UserModel> user = userRepo.findById(id);

        if (user.isEmpty()) {
            throw new Exception();
        } else {
            return user.get();
        }
    }

    public UserModel getUserByUsername(String username) throws Exception {
        Optional<UserModel> user = userRepo.findByUsername(username);
        if (user.isEmpty()) {
            throw new Exception("This user does not exist");
        } else {
            return user.get();
        }
    }

    public long create(String username, String email, String password) {
        UserModel user = new UserModel(username, email, password);
        UserModel savedUser = userRepo.save(user);
        return savedUser.getId();
    }

    public void delete(long id) {
        userRepo.deleteById(id);
    }
}
