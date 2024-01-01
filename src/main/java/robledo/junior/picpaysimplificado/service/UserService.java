package robledo.junior.picpaysimplificado.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import robledo.junior.picpaysimplificado.domain.user.User;
import robledo.junior.picpaysimplificado.domain.user.UserDTO;
import robledo.junior.picpaysimplificado.domain.user.UserType;
import robledo.junior.picpaysimplificado.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(User user) {
        this.repository.save(user);
    }
    
    public User createUser(UserDTO user) {
        User newUser = new User(user);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findById(id)
                .orElseThrow(() -> new Exception("Usuário não encontrado"));
    }
    
    public boolean validateUser(User payer, BigDecimal amount) throws Exception{

        if(payer.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuário lojista não pode realizar transações");
        }

        if(payer.getBalance().compareTo(amount) < 0){
            throw new Exception("Usuário não possui saldo suficiente para realizar a transação");
        }

        return true;
    }
}
