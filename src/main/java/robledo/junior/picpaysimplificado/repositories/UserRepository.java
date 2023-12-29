package robledo.junior.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import robledo.junior.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
