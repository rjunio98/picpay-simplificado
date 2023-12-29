package robledo.junior.picpaysimplificado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import robledo.junior.picpaysimplificado.domain.user.User;
import robledo.junior.picpaysimplificado.domain.user.UserDTO;
import robledo.junior.picpaysimplificado.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    private void saveUser(User user) {
        this.repository.save(user);
    }
    
    public User createUser(UserDTO user) {
        User newUser = new User(user);
        this.saveUser(newUser);
        return newUser;
    }
}
